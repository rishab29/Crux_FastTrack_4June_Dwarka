package Lecture4;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		// System.out.println(arr);

		arr = new int[5];
//		System.out.println(arr);
//
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
		// System.out.println(arr[5]);
//		System.out.println(arr[4]);
//
//		System.out.println(arr.length);
//		
//		display(arr);
//		arr[0]=10;
//		arr[1]=20;
//		display(arr);
//		display(arr);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int i = 0, j = 1;
		System.out.println(arr[i] + "," + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + "," + arr[j]);

	}

	public static void display(int[] arr) {
		// int[] arr=new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + "," + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + "," + arr[j]);

	}

}
