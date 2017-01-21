package lab06;

public class Ordinal {
	public static void main(String[] args) {
		System.out.println(getOrdinal(1)); // prints 1st
		System.out.println(getOrdinal(2)); // prints 2nd
		System.out.println(getOrdinal(3)); // prints 3rd
		System.out.println(getOrdinal(4)); // prints 4th
		System.out.println(getOrdinal(5)); // prints 5th
		System.out.println(getOrdinal(6)); // prints 6th
		System.out.println(getOrdinal(7)); // prints 7th
		System.out.println(getOrdinal(8)); // prints 8th
		System.out.println(getOrdinal(9)); // prints 9th
		System.out.println(getOrdinal(10)); // prints 10th
		System.out.println(getOrdinal(11)); // prints 11th
		System.out.println(getOrdinal(12)); // prints 12th
		System.out.println(getOrdinal(13)); // prints 13th
		System.out.println(getOrdinal(14)); // prints 14th
		System.out.println(getOrdinal(15)); // prints 15th
		System.out.println(getOrdinal(16)); // prints 16th
		System.out.println(getOrdinal(17)); // prints 17th
		System.out.println(getOrdinal(18)); // prints 18th
		System.out.println(getOrdinal(19)); // prints 19th
		System.out.println(getOrdinal(20)); // prints 20th
		System.out.println(getOrdinal(21)); // prints 21st
		System.out.println(getOrdinal(22)); // prints 22nd
		System.out.println(getOrdinal(33));
		System.out.println(getOrdinal(90));
		System.out.println(getOrdinal(100)); // prints 100th
		System.out.println(getOrdinal(101)); // prints 101st
		System.out.println(getOrdinal(102)); // prints 102nd
		System.out.println(getOrdinal(111)); // prints 111th
		System.out.println(getOrdinal(123));
		System.out.println(getOrdinal(172));
		System.out.println(getOrdinal(202));
		System.out.println(getOrdinal(211));
		System.out.println(getOrdinal(333));
		System.out.println(getOrdinal(100000));

	}

	public static String getOrdinal(int num) {

		String number = Integer.toString(num);

		if (num > 0 && num <= 9 || num >= 20 && num <= 99) {
			if (num % 10 == 1) {
				return number + "st";
			}

			else if (num % 10 == 2) {
				return number + "nd";
			}

			else if (num % 10 == 3) {
				return number + "rd";
			}

			else
				return number + "th";

		} else if (num >= 100 && num <= 109 || num >= 200 && num <= 209 || num >= 300 && num <= 309) {

			if (num % 100 == 1) {
				return number + "st";
			}

			else if (num % 100 == 2) {
				return number + "nd";
			}

			else if (num % 100 == 3) {
				return number + "rd";
			}

			else
				return number + "th";
		} else if (num >= 120 && num <= 199 || num >= 220 && num <= 299 || num >= 320 && num <= 399) {

			num = num % 100;

			if (num % 10 == 1) {
				return number + "st";
			}

			else if (num % 10 == 2) {
				return number + "nd";
			}

			else if (num % 10 == 3) {
				return number + "rd";
			}

			else
				return number + "th";

		} else {
			return number + "th";
		}

	}

}
