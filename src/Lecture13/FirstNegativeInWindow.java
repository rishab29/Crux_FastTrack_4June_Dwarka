package Lecture13;

import java.util.Queue;

import Lecture12.DynamicQueue;

public class FirstNegativeInWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = { 3, -1, -4, 6, -5, 2 };
		FirstNegative(arr, 3);
	}

	public static void FirstNegative(int[] arr, int k) throws Exception {

		DynamicQueue queue = new DynamicQueue();
		int i;
		for (i = 0; i < k; i++) {
			if (arr[i] < 0) {
				queue.enqueue(i);
			}
		}
		for (; i < arr.length; i++) {
			if (!queue.isEmpty()) {
				System.out.println(arr[queue.front()]);
			} else {
				System.out.println("0");
			}

			while (!queue.isEmpty() && queue.front() <= i - k) {
				queue.dequeue();
			}
			if (arr[i] < 0) {
				queue.enqueue(i);
			}
		}

		if (!queue.isEmpty()) {
			System.out.println(arr[queue.front()]);
		} else {
			System.out.println("0");
		}

	}

}
