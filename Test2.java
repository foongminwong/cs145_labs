package lab01;

public class Test2 {
	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {
			for (int i = 1; i <= (line - 1); i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= (11 - 2 * line); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println(Math.ceil(7.6));
	System.out.println(Math.ceil(7.11111));
	System.out.println(Math.floor(7.01));
	System.out.println(Math.floor(7.999));
	}
}
