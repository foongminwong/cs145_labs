package lab08;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Spinner {

	public static final int rectX = 90;
	public static final int circleX = 70;
	public static final int size = 250;

	public static BufferedImage generateFrame1(int timeStep) {
		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();

		g.setFont(new Font("Pixeled", Font.PLAIN, 15));
		g.drawString("PEND-ING...", 40, 80);

		g.fillRect(40, 85, 150, 10);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2)); // thickness
		g.drawLine(75, 90, 40, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(30, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 150, 180);
		g.setColor(Color.cyan);
		g.fillOval(140, 170, 20, 20);

		return image;// it runs the program but returns nothing
	}

	public static BufferedImage generateFrame2(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 40, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(30, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 150, 180);
		g.setColor(Color.cyan);
		g.fillOval(140, 170, 20, 20);

		/*
		 * g.setColor(Color.white); g.drawLine(75, 90, 50, 180);
		 * g.setColor(Color.cyan); g.fillOval(40, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(75, 90, 60, 180);
		 * g.setColor(Color.cyan); g.fillOval(50, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(75, 90, 70, 180);
		 * g.setColor(Color.cyan); g.fillOval(60, 170, 20, 20);
		 * 
		 * //---------------
		 * 
		 * g.setColor(Color.white); g.drawLine(150, 90, 150, 180);
		 * g.setColor(Color.cyan); g.fillOval(140, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(150, 90, 160, 180);
		 * g.setColor(Color.cyan); g.fillOval(150, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(150, 90, 170, 180);
		 * g.setColor(Color.cyan); g.fillOval(160, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(150, 90, 180, 180);
		 * g.setColor(Color.cyan); g.fillOval(170, 170, 20, 20);
		 * 
		 * g.setColor(Color.white); g.drawLine(150, 90, 190, 180);
		 * g.setColor(Color.cyan); g.fillOval(180, 170, 20, 20);
		 */

		return image;

	}

	public static BufferedImage generateFrame3(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);
		g.setFont(new Font("Pixeled", Font.PLAIN, 15));
		g.drawString("PEND-ING...", 40, 80);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 50, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(40, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 150, 180);
		g.setColor(Color.cyan);
		g.fillOval(140, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame4(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 60, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(50, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 150, 180);
		g.setColor(Color.cyan);
		g.fillOval(140, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame5(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);
		g.setFont(new Font("Pixeled", Font.PLAIN, 15));
		g.drawString("PEND-ING...", 40, 80);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.YELLOW);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 70, 180);
		g.setColor(Color.cyan);
		g.fillOval(60, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 150, 180);
		g.setColor(Color.cyan);
		g.fillOval(140, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame6(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

			g.setColor(Color.white);
			g.drawLine(75, 90, 70, 180);
			g.setColor(Color.cyan);
			g.fillOval(60, 170, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 70, 180);
		g.setColor(Color.cyan);
		g.fillOval(60, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 160, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(150, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame7(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);
		g.setFont(new Font("Pixeled", Font.PLAIN, 15));
		g.drawString("PEND-ING...", 40, 80);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

			g.setColor(Color.white);
			g.drawLine(75, 90, 70, 180);
			g.setColor(Color.cyan);
			g.fillOval(60, 170, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 70, 180);
		g.setColor(Color.cyan);
		g.fillOval(60, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 170, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(160, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame8(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

			g.setColor(Color.white);
			g.drawLine(75, 90, 70, 180);
			g.setColor(Color.cyan);
			g.fillOval(60, 170, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 70, 180);
		g.setColor(Color.cyan);
		g.fillOval(60, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 180, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(170, 170, 20, 20);

		return image;

	}

	public static BufferedImage generateFrame9(int timeStep) {

		BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.fillRect(40, 85, 150, 10);
		g.setFont(new Font("Pixeled", Font.PLAIN, 15));
		g.drawString("PEND-ING...", 40, 80);

		for (int i = 0; i < 50; i += 20) {
			g.setColor(Color.white);
			g.fillRect(rectX + i, rectX, 2, 100);
			g.setColor(Color.cyan);
			g.fillOval(circleX + i + 10, circleX + 100, 20, 20);

			g.setColor(Color.white);
			g.drawLine(75, 90, 70, 180);
			g.setColor(Color.cyan);
			g.fillOval(60, 170, 20, 20);

		}

		Graphics2D gx = (Graphics2D) g;
		gx.setStroke(new BasicStroke(2));

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(75, 90, 70, 180);
		g.setColor(Color.cyan);
		g.fillOval(60, 170, 20, 20);

		g.setColor(Color.white);
		gx.setStroke(new BasicStroke(2));
		g.drawLine(150, 90, 190, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(180, 170, 20, 20);

		return image;

	}

}
