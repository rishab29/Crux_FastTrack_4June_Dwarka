package Lecture6;

import java.util.Scanner;

public class MaxContigousSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int tcs = s.nextInt();
		for (int tc = 1; tc <= tcs; tc++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			
			
			int sumtillnow = 0;
			int ans = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				sumtillnow = sumtillnow + arr[i];
				if (sumtillnow > ans) {
					ans = sumtillnow;
				}
				if (sumtillnow < 0) {
					sumtillnow = 0;
				}
			}
			System.out.println(ans);
		}
	}

}
