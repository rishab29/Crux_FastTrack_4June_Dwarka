package Lecture6;

public class MissingTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int[] arr = { 1, 3, 5, 9, 6, 8,7 };
		int z = 0;
		for (int i = 0; i < arr.length; i++) {
			z = z ^ arr[i];
		}

		for (int i = 1; i <= n; i++) {
			z = z ^ i;
		}
        System.out.println(z);
		int set_bit = z & ~(z - 1);
		// System.out.println(set_bit);

		int group1 = 0, group2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & set_bit) == set_bit) {
				group1 = group1 ^ arr[i];
			} else {
				group2 = group2 ^ arr[i];
			}
		}

		for (int i = 1; i <= n; i++) {
			if ((i & set_bit) == set_bit) {
				group1 = group1 ^ i;
			} else {
				group2 = group2 ^ i;
			}
		}

		System.out.println("The first number missing is " + group1);
		System.out.println("The second number missing is " + group2);

	}

}
