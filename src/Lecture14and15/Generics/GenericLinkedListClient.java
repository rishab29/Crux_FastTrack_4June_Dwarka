package Lecture14and15.Generics;

public class GenericLinkedListClient extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<String> slist = new LinkedList<>();
//		slist.addFirst("abc");
//		slist.addFirst("def");
//		slist.display();

		LinkedList<Student> slist = new LinkedList<>();
		slist.addFirst(new Student("abc", 10));
		slist.addFirst(new Student("def", 20));
		slist.addFirst(new Student("ghi", 30));
		slist.addFirst(new Student("jkl", 40));
		slist.addFirst(new Student("mno", 50));

		Student tf = new Student("ghi", 40);
		slist.display();
		System.out.println(slist.find(tf));

	}

	static class Student {
		String name;
		int rollno;

		Student(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;
		}

		public boolean equals(Object ob) {
			Student s = (Student) ob;
			return this.name.equals(s.name);
		}

		public String toString() {
			return "{" + this.name + ":" + this.rollno + "}";
		}
	}

}
