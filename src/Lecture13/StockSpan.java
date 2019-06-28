package Lecture13;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 30, 35, 40, 33, 45, 35, 32 };
		int[] spans = getSpans(prices);
		for (int i = 0; i < prices.length; i++) {
			System.out.print(spans[i] + " ");
		}
	}

	public static int[] getSpans(int[] prices) {
		int[] spans = new int[prices.length];
		spans[0] = 1;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i < spans.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				spans[i] = i + 1;
			} else {
				spans[i] = i - stack.peek();
			}
			stack.push(i);
		}

		return spans;

	}

}
