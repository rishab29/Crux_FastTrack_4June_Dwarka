package Lecture5;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);

		list.add(10);
		System.out.println(list);

		list.add(20);
		System.out.println(list);

		list.add(30);
		System.out.println(list);

		list.add(40);
		System.out.println(list);

		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(list.size() - 1));

		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		list.set(1, 100);
		System.out.println(list);
		System.out.println(list.size());
	}

}
