package lab07;

public class catDog {
	public static void main(String[] args) {
		System.out.println(catDog("catcat"));
	}
	
	// difference between public and public static

	public static boolean catDog(String str) {
		int countCat = 0;
		int countDog = 0;
		
		// if put str.length(), it will be out of bound

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i+3).equalsIgnoreCase("cat")) {
				countCat++;
			}

			if (str.substring(i, i+3 ).equalsIgnoreCase("dog")) {
				countDog++;
			}
		}

		return countCat == countDog;
	}
}
