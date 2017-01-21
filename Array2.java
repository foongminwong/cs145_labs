package lab09;

public class Array2 {
	public static void main(String[] args) {

		String[] candidatesNames = { "Alice", "Bob", "Carol", "Doli", "Ëlizabeth" };
		enumeratePairs(candidatesNames);
	}

	public static void enumeratePairs(String[] candidatesNames) {
		int numberOfCandidates = candidatesNames.length;

		//int pairsPossibility = (numberOfCandidates) * (numberOfCandidates - 1);

		for (int j = 0; j < numberOfCandidates; j++) {

			for (int k = 0; k < numberOfCandidates; k++) {
				if (k != j) {
					System.out.println("P: " + candidatesNames[j] + ", VP:" + candidatesNames[k]);
				}

			}

		}

	}
}
