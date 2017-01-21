package lab07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Splotches {
	public static void main(String[] args) throws IOException {

		File dst = new File(new File(System.getProperty("user.home")), "Desktop/splotches.png");
		BufferedImage image = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);

		Random rand = new Random();
		// plotRectangle(image, color, 100, 400,300, 500);

		for (int i = 0; i <= 60000; i++) {

			Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			plotRectangle(image, color, rand.nextInt(600), rand.nextInt(600), rand.nextInt(600), rand.nextInt(600));

		}

		ImageIO.write(image, "png", dst);
	}

	public static BufferedImage plotRectangle(BufferedImage image, Color color, int lowerLeftX, int lowerLeftY,
			int upperRightX, int upperRightY) {

		/*
		 * int height = image.getHeight(); int width = image.getWidth();
		 */
		for (int xRow = lowerLeftX; xRow <= upperRightX; xRow++) {
			for (int yColumn = lowerLeftY; yColumn <= upperRightY; yColumn++) {

				// Graphics g = image.getGraphics();
				// g.drawRect(lowerLeftX, lowerLeftY, upperRightX, upperRightY);
				// g.fillRect(lowerLeftX, lowerLeftY, upperRightX, upperRightY);
				image.setRGB(xRow, yColumn, color.getRGB());
			}
		}
		return image;
	}
}
