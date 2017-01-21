package lab02;

import java.util.Scanner;

public class Circlethon {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a radius: ");
		double radius = in.nextDouble();

		System.out.println();

		System.out.print("Enter number of degrees: ");
		int numberOfDegrees = in.nextInt();

		double numberOfRadians = Math.toRadians(numberOfDegrees);

		double lengthOfArc = numberOfRadians * radius;
		
		System.out.println();
		
		// System.out.println(numberOfRadians + " and " + radius);
		System.out.println("The length of arc is " + lengthOfArc);
	}
}
