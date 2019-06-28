package Lecture13;

import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 4, 6, 5, 2 };
		nextGreater(arr);
	}

	public static void nextGreater(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				int rv = stack.pop();
				System.out.println(rv + "=>" + arr[i]);
			}
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			int rv = stack.pop();
			System.out.println(rv + "=>" + "-1");
		}

	}

}
