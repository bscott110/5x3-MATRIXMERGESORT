import java.util.*;
import java.util.concurrent.*;

public class MATRIXMERGESORT {

	public static void main(String[] args) {

		int n = 5;
		int m = 3;

		int[][] randomMatrix = new int[n][m];

		System.out.print("OG Matrix:\n");
		// n rows
		for (int i = 0; i < n; i++) {
			// m columns
			for (int j = 0; j < m; j++) {
				// creates random int from -100 to 100
				int randNum = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
				// inserts random int into each element
				randomMatrix[i][j] = randNum;

				// line break at the end of each row
				if (j % n == 0) {
					System.out.println();
				}

				// prints matrix
				System.out.print("[" + randomMatrix[i][j] + "]" + ",");
			}

		}

		int col = 1;
		System.out.println("\n\nSorted Matrix:\n");
		sortbyColumn(randomMatrix, col - 1);

		// prints sorted matrix
		for (int i = 0; i < randomMatrix.length; i++) {
			for (int j = 0; j < randomMatrix[i].length; j++)
				System.out.print(randomMatrix[i][j] + " ");
			System.out.println();
		}
	}

	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[col] > entry2[col])
					return 1;
				else
					return -1;
			}
		}); // End of function call sort().
	}
}

// Source for sorting algo:
// https://www.geeksforgeeks.org/sorting-2d-array-according-values-given-column-java/
