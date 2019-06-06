package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int nst = 5;
		int row = 1;
		while (row <= n) {
			int cst = 1;
			// work to be done in same row
			while (cst <= nst) {
				System.out.print("*");
				cst++;// prep for the next value in same row
			}

			// prep for work to be done for next row
			System.out.println();
			row++;
			nst = 5;
		}
	}

}
