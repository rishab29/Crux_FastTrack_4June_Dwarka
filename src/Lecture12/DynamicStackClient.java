package Lecture12;

import Lecture11.StacksUsingArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StacksUsingArrays stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			displayStackInfo(stack);
		}
		stack.push(60);
		stack.push(70);
		stack.push(80);
		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		// stack.pop();
	}

	public static void displayStackInfo(StacksUsingArrays stack) throws Exception {
		System.out.println("***************************");
		stack.display();
		System.out.println("Size " + stack.size());
		System.out.println("Top " + stack.top());
		System.out.println("***************************");
	}

}
