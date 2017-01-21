package lab06;
// String must use equals
import java.util.Scanner;

public class Cards {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a card: ");
		String yourCard = in.nextLine();
		
		String temporaryString = yourCard;

		if (yourCard.contains("2")) {
			yourCard = "Two";
		}

		else if (yourCard.contains("3")) {
			yourCard = "Three";
		}

		else if (yourCard.contains("4")) {
			yourCard = "Four";
		}

		else if (yourCard.contains("5")) {
			yourCard = "Five";
		}

		else if (yourCard.contains("6")) {
			yourCard = "Six";
		}

		else if (yourCard.contains("7")) {
			yourCard = "Seven";
		}

		else if (yourCard.contains("8")) {
			yourCard = "Eight";
		}

		else if (yourCard.contains("9")) {
			yourCard = "Nine";
		}

		else if (yourCard.contains("10")) {
			yourCard = "Ten";
		}

		else if (yourCard.contains("K")) {
			yourCard = "King";
		}

		else if (yourCard.contains("Q")) {
			yourCard = "Queen";
		}

		else if (yourCard.contains("J")) {
			yourCard = "Jack";
		}

		else { //(yourCard.contains("A"))
			yourCard = "Ace";
		}

		if (temporaryString.contains("C")) {
			System.out.println(yourCard + " of Clubs");
		}

		else if (temporaryString.contains("D")) {
			System.out.println(yourCard + " of Diamonds");
		}

		else if (temporaryString.contains("H")) {
			System.out.println(yourCard + " of Hearts");
		}

		else { //(temporaryString.contains("S")) 
			System.out.println(yourCard + " of Spades");
		}
	}
}
