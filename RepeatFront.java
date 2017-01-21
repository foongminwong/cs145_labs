package lab07;

public class RepeatFront {
	public static void main(String[] args) {
		System.out.println(repeatFront("Chocolate", 4));
	}

	public static String repeatFront(String str, int n) {
		int repeat = n;
		String newStr = "";

		for (int i = 0; i <= repeat; i++) {

			newStr = newStr + str.substring(0, n);

			n--;
		}

		return newStr;
	}
}
