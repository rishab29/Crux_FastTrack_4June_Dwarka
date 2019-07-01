package Lecture14and15;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(50);
		list.addAt(2, 40);
		list.addAt(2, 30);
		list.addAt(0, 5);
		list.addLast(60);
		//list.display();

		list.removeFirst();
		list.removeLast();
		//list.display();
		//list.removeAt(2);
		list.display();
		
		list.reverseDR();
		list.display();
		
//		System.out.println(list.mid());
//		System.out.println(list.kthNodeFromEnd(2));
//		//list.createCycle();
//		System.out.println(list.detectCycle());
		
		

	}

}
