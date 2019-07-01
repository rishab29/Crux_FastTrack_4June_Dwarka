package Lecture14and15;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;

	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		int count = 0;
		Node temp = this.head;
		while (count < index) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");

		}
		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			Node node = new Node(data, nm1.next);
			nm1.next = node;
			this.size++;
		}

	}
   
	public int getFirst() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		return this.head.data;
	}
	
	public int getLast() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		if(index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		return this.getNodeAt(index).data;
	}
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		int rv = this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		int rv = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm2 = this.getNodeAt(this.size - 2);
			this.tail = nm2;
			this.tail.next = null;
		}
		this.size--;
		return rv;
	}

	public int removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			int rv = nm1.next.data;
			nm1.next = nm1.next.next;
			this.size--;
			return rv;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reverseDI() throws Exception {
		int beg = 0, end = this.size - 1;
		while (beg <= end) {
			Node left = this.getNodeAt(beg);
			Node right = this.getNodeAt(end);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			beg++;
			end--;

		}
	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node tprev = prev;
			Node tcurr = curr;
			prev = curr;
			curr = curr.next;
			tcurr.next = tprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {
		reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		if (node == this.tail) {
			return;
		}
		reversePR(node.next);
		node.next.next = node;
	}

	public int mid() {
		return this.getMidNode().data;
	}

	private Node getMidNode() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public int kthNodeFromEnd(int k) throws Exception {
		if (k <= 0 || k > this.size) {
			throw new Exception("Invalid K");
		}
		Node fast = this.head;
		Node slow = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public void createCycle() throws Exception {
		Node temp = this.getNodeAt(2);
		this.tail.next = temp;
	}

	public boolean detectCycle() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public void reverseDR() {
		HeapMover obj = new HeapMover(this.head);
		this.reverseDR(obj, this.head, 0);
	}

	private void reverseDR(HeapMover obj, Node right, int index) {
		if (right == null) {
			return;
		}
		reverseDR(obj, right.next, index + 1);
		if (index >= this.size / 2) {
			int temp = obj.node.data;
			obj.node.data = right.data;
			right.data = temp;
			obj.node = obj.node.next;
		}
	}

	class HeapMover {
		Node node;

		public HeapMover(Node node) {
			this.node = node;
		}
	}

}
