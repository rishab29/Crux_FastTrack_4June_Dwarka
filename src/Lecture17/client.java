package Lecture17;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree = new BST();
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(12);
		tree.add(37);
		tree.add(62);
		tree.add(87);
		tree.add(30);
		tree.add(74);

		tree.display();
		System.out.println(tree.max());
		System.out.println(tree.min());
		
		System.out.println("*******************");
		tree.remove(50);
		tree.display();
		
		System.out.println(tree.isBST());

	}

}
