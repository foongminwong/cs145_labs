package lab02;

import java.util.Scanner;

public class Clamper {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double yourNumber = in.nextDouble();
	
		double lo = 0;
		double hi = 10;
		
		yourNumber = Math.max(lo, yourNumber);
		yourNumber = Math.min(yourNumber, hi);
		
		System.out.println(yourNumber);
		
	}
}
