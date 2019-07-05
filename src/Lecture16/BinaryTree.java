package Lecture16;

import java.util.LinkedList;
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
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);
		int mysize = lsize + rsize + 1;
		return mysize;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = this.max(node.left);
		int rmax = this.max(node.right);
		int mymax = Math.max(node.data, Math.max(lmax, rmax));
		return mymax;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int lmin = this.min(node.left);
		int rmin = this.min(node.right);
		int mymin = Math.min(node.data, Math.min(lmin, rmin));
		return mymin;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		int myheight = Math.max(lheight, rheight) + 1;
		return myheight;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		} else if (this.find(node.left, data)) {
			return true;
		} else if (this.find(node.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public void mirror() {

		this.mirror(this.root);
	}

	private void mirror(Node node) {
		if (node == null) {
			return;
		}
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
		this.mirror(node.left);
		this.mirror(node.right);
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder() {
		this.inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");

		inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.remove();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.add(rv.left);
			}
			if (rv.right != null) {
				queue.add(rv.right);
			}
		}
	}

	public boolean isBST() {
		return this.isBst(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBst(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		} else if (!isBst(node.left, min, node.data)) {
			return false;
		} else if (!isBst(node.right, node.data, max)) {
			return false;
		} else {
			return true;
		}
	}

}
