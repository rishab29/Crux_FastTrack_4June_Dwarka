package Lecture14and15.Generics;

public class GenericLinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<String> slist = new LinkedList<>();
//		slist.addFirst("abc");
//		slist.addFirst("def");
//		slist.display();

		LinkedList<Student> slist = new LinkedList<>();
		slist.addFirst(new Student("abc", 10));
		slist.addFirst(new Student("def", 20));
		slist.display();

	}

	static class Student {
		String name;
		int rollno;

		Student(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;
		}

		public String toString() {
			return "{" + this.name + ":" + this.rollno + "}";
		}
	}

}
