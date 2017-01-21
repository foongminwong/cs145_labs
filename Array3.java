package lab09;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		int[] unsortedNums = { 245, 498, 145, 485, 268, 335, 146 };
		System.out.println("Before: " + Arrays.toString(unsortedNums));
		int[] sortedNums = selectionSort(unsortedNums);
		System.out.println("After: " + Arrays.toString(sortedNums));
	}

	public static int[] selectionSort(int[] unsortedNums) {
		int[] sortedNums = Arrays.copyOf(unsortedNums, unsortedNums.length);
		
		//sortedNums = unsortedNums;

		int length = sortedNums.length;
		for (int c = 0; c < length; c++) {
			for (int i = 0; i < length-1; i++) {
				// manipulate the loop bound to get simpler code

//				if (i == (length - 2)) {
//					if (sortedNums[length - 2] > sortedNums[length - 1]) {
//						int temp = sortedNums[length - 1];
//						sortedNums[length - 1] = sortedNums[length - 2];
//						sortedNums[length - 2] = temp;
//					}
//				}
//
//				else if (i >= 0 && i <= (length - 3)) {

					if (sortedNums[i] > sortedNums[i + 1]) {
						int temp = sortedNums[i];
						sortedNums[i] = sortedNums[i + 1];
						sortedNums[i + 1] = temp;
					}

//				}

			}
		}

		return sortedNums;
	}
}
