package lab07;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class TestImage {
	public static void main(String[] args) throws IOException {
		JFileChooser dialog = new JFileChooser();

		int status = dialog.showOpenDialog(null);

		if (status == JFileChooser.APPROVE_OPTION) {
			File file = dialog.getSelectedFile();

			BufferedImage src = ImageIO.read(file);
			File dst = new File(new File(System.getProperty("user.home")), "Desktop/Testing.png");
			File dst1 = new File(new File(System.getProperty("user.home")), "Desktop/Testing1.png");
			File dst2 = new File(new File(System.getProperty("user.home")), "Desktop/Testing2.png");
			File dst3 = new File(new File(System.getProperty("user.home")), "Desktop/Testing3.png");
			File dst4 = new File(new File(System.getProperty("user.home")), "Desktop/Testing4.png");
			File dst5 = new File(new File(System.getProperty("user.home")), "Desktop/Testing5.png");
			File dst6 = new File(new File(System.getProperty("user.home")), "Desktop/Testing6.png");

			// BufferedImage image = new BufferedImage(600, 500,
			// BufferedImage.TYPE_INT_RGB);
			Color color = new Color(138, 255, 248);
			src.setRGB(100, 100, color.getRGB());

			int height = src.getHeight() / 2;
			int width = src.getWidth() / 2;

			BufferedImage src1 = src.getSubimage(0, 0, height, width);// top
																		// left
			BufferedImage src2 = src.getSubimage(width, 0, height, width); // top
																			// right
			BufferedImage src3 = src.getSubimage(0, height, width, height); // bottom
																			// left
			BufferedImage src4 = src.getSubimage(width, height, width, height);// bottom
																				// right
			BufferedImage src5 = src;
			int xPixel = 0, yPixel = 0,rgb = 0;

			for (int y = 0; y < src.getHeight(); y++) {
				for (int x = 0; x < src.getWidth(); x++) {
					xPixel = (width + x) % src.getWidth();
					yPixel = (height + y) % src.getHeight();
					rgb = src.getRGB(xPixel, yPixel);
					src5.setRGB(xPixel, yPixel, rgb);
					
				}
			}
			
			Graphics2D g = src5.createGraphics();
			
			g.drawImage(src5, null, 0, 0);
			
			ImageIO.write(src, "png", dst);
			ImageIO.write(src1, "png", dst1);
			ImageIO.write(src2, "png", dst2);
			ImageIO.write(src3, "png", dst3);
			ImageIO.write(src4, "png", dst4);
			ImageIO.write(src5, "png", dst5);
			ImageIO.write(src5, "png", dst6);
		}
		
		
	}

}
