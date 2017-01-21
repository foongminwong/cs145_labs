package lab08;

import java.awt.image.BufferedImage;
import java.io.File;

public class SpinnerMain {
	public static final int rectX = 90;
	public static final int circleX = 70;
	public static final int size = 250;

	public static void main(String[] args) {

		File outputFile = new File("C:/Users/foongmin/Desktop/spinner.gif");
		GifSequenceWriter gif = new GifSequenceWriter(outputFile, 90, true);

		BufferedImage image1 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image2 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image3 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image4 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image5 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image6 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image7 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image8 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		BufferedImage image9 = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		/*
		 * Graphics g1 = image1.getGraphics(); Graphics g2 =
		 * image2.getGraphics(); Graphics g3 = image3.getGraphics(); Graphics g4
		 * = image4.getGraphics(); Graphics g5 = image5.getGraphics(); Graphics
		 * g6 = image6.getGraphics(); Graphics g7 = image7.getGraphics();
		 * Graphics g8 = image8.getGraphics(); Graphics g9 =
		 * image9.getGraphics();
		 */

		for (int i = 0; i < 50; i += 10) {
			image1 = Spinner.generateFrame1(i);
			image2 = Spinner.generateFrame2(i);
			image3 = Spinner.generateFrame3(i);
			image4 = Spinner.generateFrame4(i);
			image5 = Spinner.generateFrame5(i);
			image6 = Spinner.generateFrame6(i);
			image7 = Spinner.generateFrame7(i);
			image8 = Spinner.generateFrame8(i);
			image9 = Spinner.generateFrame9(i);

			gif.appendFrame(image1);
			gif.appendFrame(image2);
			gif.appendFrame(image3);
			gif.appendFrame(image4);
			gif.appendFrame(image5);
			gif.appendFrame(image6);
			gif.appendFrame(image7);
			gif.appendFrame(image8);
			gif.appendFrame(image9);

		}

		gif.close();
	}
}
