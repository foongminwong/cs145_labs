package lab07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class SuccessImage {
	public static void main(String[] args) throws IOException {
		JFileChooser dialog = new JFileChooser();
		int status = dialog.showOpenDialog(null);
		// BufferedImage img = new
		// BufferedImage(1024,1024,BufferedImage.TYPE_BYTE_GRAY);
		if (status == JFileChooser.APPROVE_OPTION) {
			File file = dialog.getSelectedFile();
			BufferedImage image = ImageIO.read(file);

			BufferedImage swappedImage = new BufferedImage(image.getWidth(), image.getHeight(),
					BufferedImage.TYPE_INT_RGB);

			int originalHeight = image.getHeight();
			int originalWidth = image.getWidth();
			int halfHeightOfImage = (int) (image.getHeight() / 2);
			int halfWidthOfImage = (int) (image.getWidth() / 2);

			// march through the pixels
			for (int x = 0; x < originalWidth; x++) {
				for (int y = 0; y < originalHeight; y++) {
					int rgb = image.getRGB(x, y);
					image.setRGB(x, y, rgb);

				}
			}

			int xPixel = 0, yPixel = 0, rgb = 0;

			for (int x = 0; x < originalWidth; x++) {
				for (int y = 0; y < originalHeight; y++) {
					xPixel = (halfWidthOfImage + x) % originalWidth;
					yPixel = (halfHeightOfImage + y) % originalHeight;
					rgb = image.getRGB(x, y);
					swappedImage.setRGB(xPixel, yPixel, rgb);
				}

			}

			ImageIO.write(swappedImage, "png", new File("C:/Users/foongmin/Desktop/mumu.png"));

		}
	}
}
