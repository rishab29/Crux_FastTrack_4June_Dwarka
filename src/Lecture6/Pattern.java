package Lecture6;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int len = 2 * n - 1;
		int decvalues = 0;

		while (row <= 2 * n - 1) {
			int samevalues = len - (2 * decvalues);
			int value = n;

			int col = 1;
			while (col <= decvalues) {
				System.out.print(value + " ");
				value--;
				col++;
			}

			col = 1;
			while (col <= samevalues) {
				System.out.print(value + " ");
				col++;
			}

			value++;
			col = 1;
			while (col <= decvalues) {
				System.out.print(value + " ");
				value++;
				col++;
			}

			if (row < n) {
				decvalues++;
			} else {
				decvalues--;
			}

			row++;
			System.out.println();
		}
	}
}
