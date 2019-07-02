package Lecture16;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}

	private Node root;
	private int size;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of" + parent.data);
			} else {
				System.out.println("Enter the data for right child of" + parent.data);

			}
		}

		int data = s.nextInt();
		Node node = new Node(data, null, null);
		this.size++;

		System.out.println("Do you have left child of" + node.data);
		boolean choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		System.out.println("Do you have right child of" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}

		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}
	
	public int size2() {
		
	}
	
	private int size2() {
		
	}

}
