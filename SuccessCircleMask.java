package lab07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SuccessCircleMask {
	public static void main(String[] args) throws IOException {
		BufferedImage image = new BufferedImage(1024, 1024, BufferedImage.TYPE_BYTE_GRAY);

		double width = image.getWidth();
		double height = image.getHeight();

		double midC = (double) (width / 2);
		double midR = (double) (height / 2);
		double power = 10;

		for (int r = 0; r < height; r++) {
			for (int c = 0; c < width; c++) {

				// circle equation
				double distancefromCenter = Math.sqrt(Math.pow(c - midC, 2) + Math.pow(r - midR, 2));
				double radius = Math.min(midC, midR);// get the minimum radius
				double normalizedDistance = distancefromCenter / radius;
				// cannot be larger than radius

				if (distancefromCenter > radius) {
					// border / outside circle
					image.setRGB(c, r, new Color(0, 0, 0).getRGB());
				}

				else {
					// inside the circle
					double tweakedDistance = Math.pow(normalizedDistance, power);
					int rgbGray = (int) ((1 - tweakedDistance) * 255);
					image.setRGB(c, r, new Color(rgbGray, rgbGray, rgbGray).getRGB());
				}
			}
		}

		ImageIO.write(image, "png", new File("C:/Users/foongmin/Desktop/circle.png"));

	}
}
