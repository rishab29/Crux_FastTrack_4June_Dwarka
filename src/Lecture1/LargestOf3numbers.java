package Lecture1;

public class LargestOf3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = 5;
//
//		if (a > b && a > c) {
//			System.out.println(a);
//		} else {
//			if (b > a && b > c) {
//				System.out.println(b);
//			} else {
//				System.out.println(c);
//			}
//		}

		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
