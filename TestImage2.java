package lab07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TestImage2 {
	public static void main(String[] args) throws IOException {
		BufferedImage image = new BufferedImage(512, 256, BufferedImage.TYPE_INT_RGB);
		Color color = new Color(138, 255, 248);
		
		for(int r = 1; r <= 100; r++){
			for(int c= 1; c<=100; c++){
				image.setRGB(r, c, color.getRGB());
			}
		}
		

		ImageIO.write(image, "png", new File("C:/Users/foongmin/Desktop/image.png"));
	}
}
