package lab01;

import java.util.Scanner;

public class ColorMixer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("First Color: (in RGB form) "); //prompt user for first color
		int r1 = in.nextInt();
		int g1 = in.nextInt();
		int b1 = in.nextInt();
		
		System.out.println("Second Color: (in RGB form)");//prompt user for second color
		int r2 = in.nextInt();
		int g2 = in.nextInt();
		int b2 = in.nextInt();
		
		System.out.println("Proportion or weight of the color mixture: [0,1]"); //prompt user for a proportion by which to mix the colors
		double p = in.nextDouble();
		
		System.out.println("Third Color: (in RGB form)");
		double r3 = (p * r1 + (1-p) * r2 );
		double g3 = (p * g1 + (1-p) * g2 );
		double b3 = (p * b1 + (1-p) * b2 );

		System.out.println("The mixed intensities are (" + r3 + "," + g3 + "," + b3 + ")");
		//how to turn into one decimal place
		// println is different from printf("%.1f",x)
	}
}
