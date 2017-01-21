//Kirsten & Foong + Joyce ,Erin
package lab03;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Square {
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		
		drawSquare(robot);
		
	}

	public static void drawDot(Robot robot, int coordinateX, int coordinateY) {

		robot.mouseMove(coordinateX, coordinateY);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(1000);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	public static void drawLineWithFiveDots(Robot robot, int locationX, int locationY, int deltaX, int deltaY) {
		drawDot(robot, locationX, locationY);
		drawDot(robot, locationX + deltaX, locationY + deltaY);
		drawDot(robot, locationX + 2 * deltaX, locationY + 2 * deltaY);
		drawDot(robot, locationX + 3 * deltaX, locationY + 3 * deltaY);
		drawDot(robot, locationX + 4 * deltaX, locationY + 4 * deltaY);
		
	}

	public static void drawSquare(Robot robot) {
		
		drawLineWithFiveDots(robot, 229, 300, 100, 0);
		drawLineWithFiveDots(robot, 229, 300, 0, 100);
		drawLineWithFiveDots(robot, 229, 700, 100, 0);
		drawLineWithFiveDots(robot, 629, 700, 0, -100);
	}
}
