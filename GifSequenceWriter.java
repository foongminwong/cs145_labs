package lab08;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.IIOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;

public class GifSequenceWriter {
	protected ImageWriter gifWriter;
	protected ImageWriteParam imageWriteParam;
	protected IIOMetadata imageMetaData;
	protected ImageOutputStream outputStream;

	/**
	 * Creates a new GifSequenceWriter
	 * 
	 * @param outputStream
	 *            the ImageOutputStream to be written to
	 * @param imageType
	 *            one of the imageTypes specified in BufferedImage
	 * @param timeBetweenFramesMS
	 *            the time between frames in miliseconds
	 * @param loopContinuously
	 *            wether the gif should loop repeatedly
	 * @throws IIOException
	 *             if no gif ImageWriters are found
	 *
	 * @author Elliot Kroo (elliot[at]kroo[dot]net)
	 */
	public GifSequenceWriter(File outFile, int timeBetweenFramesMS, boolean loopContinuously) {
		try {
			// my method to create a writer
			gifWriter = getWriter();
			imageWriteParam = gifWriter.getDefaultWriteParam();
			ImageTypeSpecifier imageTypeSpecifier = ImageTypeSpecifier
					.createFromBufferedImageType(BufferedImage.TYPE_INT_RGB);

			imageMetaData = gifWriter.getDefaultImageMetadata(imageTypeSpecifier, imageWriteParam);

			String metaFormatName = imageMetaData.getNativeMetadataFormatName();

			IIOMetadataNode root = (IIOMetadataNode) imageMetaData.getAsTree(metaFormatName);

			IIOMetadataNode graphicsControlExtensionNode = getNode(root, "GraphicControlExtension");

			graphicsControlExtensionNode.setAttribute("disposalMethod", "none");
			graphicsControlExtensionNode.setAttribute("userInputFlag", "FALSE");
			graphicsControlExtensionNode.setAttribute("transparentColorFlag", "FALSE");
			graphicsControlExtensionNode.setAttribute("delayTime", Integer.toString(timeBetweenFramesMS / 10));
			graphicsControlExtensionNode.setAttribute("transparentColorIndex", "0");

			IIOMetadataNode commentsNode = getNode(root, "CommentExtensions");
			commentsNode.setAttribute("CommentExtension", "Created by MAH");

			IIOMetadataNode appEntensionsNode = getNode(root, "ApplicationExtensions");

			IIOMetadataNode child = new IIOMetadataNode("ApplicationExtension");

			child.setAttribute("applicationID", "NETSCAPE");
			child.setAttribute("authenticationCode", "2.0");

			int loop = loopContinuously ? 0 : 1;

			child.setUserObject(new byte[] { 0x1, (byte) (loop & 0xFF), (byte) ((loop >> 8) & 0xFF) });
			appEntensionsNode.appendChild(child);

			imageMetaData.setFromTree(metaFormatName, root);

			outputStream = new FileImageOutputStream(outFile);
			gifWriter.setOutput(outputStream);
			gifWriter.prepareWriteSequence(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void appendFrame(BufferedImage img) {
		try {
			gifWriter.writeToSequence(new IIOImage(img, null, imageMetaData), imageWriteParam);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Close this GifSequenceWriter object. This does not close the underlying
	 * stream, just finishes off the GIF.
	 */
	public void close() {
		try {
			gifWriter.endWriteSequence();
			outputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Returns the first available GIF ImageWriter using
	 * ImageIO.getImageWritersBySuffix("gif").
	 * 
	 * @return a GIF ImageWriter object
	 * @throws IIOException
	 *             if no GIF image writers are returned
	 */
	private static ImageWriter getWriter() throws IIOException {
		try {
			Iterator<ImageWriter> iter = ImageIO.getImageWritersBySuffix("gif");
			if (!iter.hasNext()) {
				throw new IIOException("No GIF Image Writers Exist");
			} else {
				return iter.next();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Returns an existing child node, or creates and returns a new child node
	 * (if the requested node does not exist).
	 * 
	 * @param rootNode
	 *            the <tt>IIOMetadataNode</tt> to search for the child node.
	 * @param nodeName
	 *            the name of the child node.
	 * 
	 * @return the child node, if found or a new node created with the given
	 *         name.
	 */
	private static IIOMetadataNode getNode(IIOMetadataNode rootNode, String nodeName) {
		int nNodes = rootNode.getLength();
		for (int i = 0; i < nNodes; i++) {
			if (rootNode.item(i).getNodeName().compareToIgnoreCase(nodeName) == 0) {
				return ((IIOMetadataNode) rootNode.item(i));
			}
		}
		IIOMetadataNode node = new IIOMetadataNode(nodeName);
		rootNode.appendChild(node);
		return node;
	}
}
