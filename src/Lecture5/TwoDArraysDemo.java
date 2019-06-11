package Lecture5;

public class TwoDArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		// System.out.println(arr);
		arr = new int[3][];
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[1][0]);
//		display(arr);
//
//		System.out.println(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[arr.length - 1]);

		// display(arr);
		System.out.println(arr[0]);
		arr[0] = new int[3];
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
