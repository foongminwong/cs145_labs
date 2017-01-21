package lab09;

import java.util.Random;

public class Array1 {
	public static void main(String[] args) {

		String[] names = { "AA", "BB", "CC" , "DD", "EE", "FF", "GG", "HH", "II", "JJ" };

		for (int k = 0; k < 20; k++) {
			String[] fiveRandomNames = picheckk5(names);
			for (int p = 0; p < 5; p++) {

				System.out.print(fiveRandomNames[p] + " ");
			}
			System.out.println();
		}

	}

	public static String[] picheckk5(String[] names) {
		Random generator = new Random();
		String[] fiveRandomNames = new String[5];

		/*
		 * for (int i = 0; i < fiveRandomNames.length; i++) {
		 * 
		 * fiveRandomNames[i] = names[generator.nextInt(names.length)];
		 * 
		 * for (int j = 0; j < i; j++) {
		 * 
		 * while (fiveRandomNames[i] == fiveRandomNames[j]) { fiveRandomNames[i]
		 * = names[generator.nextInt(names.length)];
		 * 
		 * if(fiveRandomNames[i] == fiveRandomNames[j]){ fiveRandomNames[i] =
		 * names[generator.nextInt(names.length)]; }
		 * 
		 * 
		 * if(fiveRandomNames[i] == fiveRandomNames[j]){ fiveRandomNames[i] =
		 * names[generator.nextInt(names.length)]; }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */

		for (int i = 0; i < fiveRandomNames.length; i++) {
			fiveRandomNames[i] = names[generator.nextInt(names.length)];

			if (i > 0) {
				for (int check = 0; check <= i - 1; check++) {
					if (fiveRandomNames[check] == fiveRandomNames[i]) {
						i--;
						// decrease one i and loop again
					}
				}
			}
		}

		return fiveRandomNames;
	}
}
