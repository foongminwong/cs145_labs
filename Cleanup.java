package lab02;

import java.util.Scanner;

public class Cleanup {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ënter the name of file: ");
		String nameOfFile = in.nextLine();
		
		
		nameOfFile = nameOfFile.replace(" ", "_");
		System.out.println(nameOfFile);
		
	}
}
