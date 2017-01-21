package lab08;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test {
	public static void main(String[] args) throws IOException {

		File outputFile = new File("C:/Users/foongmin/Desktop/test.gif");
		GifSequenceWriter gif = new GifSequenceWriter(outputFile, 1000, true);

		BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);

		File file = new File("C:/Users/foongmin/Desktop/m.png");
		BufferedImage src = ImageIO.read(file);

		Graphics g = image.getGraphics();
		Graphics g1 = src.createGraphics();

		for (int i = 0; i < 1000; i += 50) {

			image = generateFrame(i);
			

			gif.appendFrame(image);
		}

		gif.close();
	}

	public static BufferedImage generateFrame(int timeStep) throws IOException {
		BufferedImage image = new BufferedImage(512, 512, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();

		g.drawString("NIMAMA", timeStep, 250);
		g.fill3DRect(50 + timeStep, 50, 100, 100, false);

		return image;// it runs the program but returns nothing
	}

}
