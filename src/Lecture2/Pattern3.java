package Lecture2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int nst = 1;
		int row = 1;
		int value = 1;
		while (row <= n) {
			int cst = 1;
			// work to be done in same row
			while (cst <= nst) {
				System.out.print(value);
				// prep for the next value in same row
				value++;
				cst++;
			}

			// prep for work to be done for next row
			System.out.println();
			row++;
			nst++;
		}
	}

}
