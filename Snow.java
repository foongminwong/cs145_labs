package lab04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Snow {
	public static void main(String[] args) {
		// feel free to adjust the height and width
		Canvas canvas = new Canvas(1100, 700);
		Graphics2D graphics = canvas.getGraphics();

		// call drawing methods here
		graphics.setFont(new Font("Niagara Solid", Font.PLAIN, 55));
		graphics.drawString("\"Do you wanna build a Snowman?\"", 70, 100);

		for (int x = 5; x <= 10000; x += 122) {
			for (int y = 5; y <= 10000; y += 122) {
				graphics.fillOval(x, y, 5, 5);
			}
		}
		
		for (int x = 10; x <= 10000; x += 200) {
			for (int y = 10; y <= 10000; y += 200) {
				Color mix = new Color(196, 236, 242);
				graphics.setColor(mix);
				graphics.fillOval(x, y, 8, 8);
			}
		}
		
		for (int x = 50; x <= 10000; x += 200) {
			for (int y = 50; y <= 10000; y += 350) {
				Color mix = new Color(41, 141, 255);
				graphics.setColor(mix);
				graphics.fillOval(x, y, 7,7);
			}
		}
		
		graphics.setColor(Color.yellow);
		drawSnowPerson(graphics, 70, 150);

		graphics.setColor(Color.white);
		drawSnowPerson(graphics, 330, 150);

		graphics.setColor(Color.cyan);
		drawSnowPerson(graphics, 600, 150);

		graphics.setColor(Color.magenta);
		drawSnowPerson(graphics, 880, 150);

		graphics.setFont(new Font("Niagara Solid", Font.PLAIN, 45));
		Color mix = new Color(240, 237, 237);
		graphics.setColor(mix);
		graphics.setFont(new Font("Niagara Solid", Font.PLAIN, 90));
		graphics.drawString("\"I don't want to build a snowman. Okay, bye...\"", 100, 600);

		canvas.show();
	}

	public static void drawSnowPerson(Graphics g, int x, int y) {
		g.drawOval(x, y, 120, 120);
		g.fillOval(x, y, 120, 120);
		g.drawOval(x - 40, y + 120, 200, 200);
		g.fillOval(x - 40, y + 120, 200, 200);

		drawSnowManBody(g, x + 45, y + 250, 60);
		drawSnowEyes(g, x + 25, y + 50, 50);
		drawSnowMouth(g, x + 25, y + 80, 10, 10);
	}

	public static void drawSnowManBody(Graphics g, int x, int y, int minus) {
		g.drawOval(x, y, 30, 30);
		g.setColor(Color.black);
		g.fillOval(x, y, 30, 30);

		g.drawOval(x, y - minus, 30, 30);
		g.setColor(Color.black);
		g.fillOval(x, y - minus, 30, 30);
	}

	public static void drawSnowEyes(Graphics g, int x, int y, int plus) {
		g.drawOval(x, y, 15, 15);
		g.setColor(Color.black);
		g.fillOval(x, y, 15, 15);

		g.drawOval(x + plus, y, 15, 15);
		g.setColor(Color.black);
		g.fillOval(x + plus, y, 15, 15);
	}

	public static void drawSnowMouth(Graphics g, int x, int y, int plus1, int plus2) {
		g.drawOval(x, y, 10, 10);
		g.setColor(Color.black);
		g.fillOval(x, y, 10, 10);

		g.drawOval(x + plus1, y + plus2, 10, 10);
		g.setColor(Color.black);
		g.fillOval(x + plus1, y + plus2, 10, 10);

		g.drawOval(x + plus1 + 15, y + plus2 + 7, 10, 10);
		g.setColor(Color.black);
		g.fillOval(x + plus1 + 15, y + plus2 + 7, 10, 10);

		g.drawOval(x + plus1 + 30, y + plus2 + 3, 10, 10);
		g.setColor(Color.black);
		g.fillOval(x + plus1 + 30, y + plus2 + 3, 10, 10);

		g.drawOval(x + plus1 + 42, y + plus2 - 9, 10, 10);
		g.setColor(Color.black);
		g.fillOval(x + plus1 + 42, y + plus2 - 9, 10, 10);
	}

	/*
	 * public static void drawString(Graphics g, int x, int y, int plus) {
	 * g.setFont(new Font("Niagara Solid", Font.PLAIN, 50));
	 * g.drawString("Do you wanna build a Snowman?", x, y);
	 * g.drawString("Come on lets go and play", x, y + plus);
	 * g.drawString("I never see you anymore", x, y + 2 * plus);
	 * g.drawString("Come out the door", x, y + 3 * plus);
	 * g.drawString("It's like you've gone away...", x, y + 4 * plus);
	 * g.drawString("We used to be best buddies", x, y + 5 * plus);
	 * g.drawString("And now we're not", x, y + 6 * plus);
	 * g.drawString("I wish you would tell me why!", x, y + 7 * plus);
	 * g.drawString("Do you want to build a snowman?", x, y + 8 * plus);
	 * g.drawString("It doesn't have to be a snowman", x, y + 9 * plus);
	 * g.drawString("Go away", x, y + 10 * plus); g.setFont(new
	 * Font("Niagara Solid", Font.PLAIN, 100)); g.drawString("Okay, bye...", x +
	 * 100, y + 13 * plus); }
	 */
}