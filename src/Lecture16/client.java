package Lecture16;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 true 25 true 16 false false true 37 false false true 38 true 81 false false true 48 false false
		BinaryTree tree = new BinaryTree();
		tree.display();

		System.out.println(tree.size2());
		System.out.println(tree.max());
		System.out.println(tree.min());
		System.out.println(tree.height());
		System.out.println(tree.find(100));
//		tree.mirror();
//		tree.display();

		tree.preOrder();
		System.out.println();
		tree.inOrder();
		System.out.println();
		tree.postOrder();
		System.out.println();
		tree.levelOrder();
		
		System.out.println(tree.isBST());
	}

}
