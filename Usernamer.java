package lab02;

import java.util.Scanner;

public class Usernamer {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = in.nextLine();
		
		firstName = firstName.toLowerCase();
		firstName = firstName.substring(0,1);
		//firstName = firstName.charAt(0);
		//System.out.println(firstName);
		
		lastName = lastName.toLowerCase();
		//System.out.println(lastName);
		
		System.out.println("Your username is " + firstName + lastName + ".");
		
	}
}
