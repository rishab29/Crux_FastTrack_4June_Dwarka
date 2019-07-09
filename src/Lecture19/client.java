package Lecture19;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Heap<Integer> heap = new Heap<>();
//		heap.add(35);
//		heap.add(30);
//		heap.add(25);
//		heap.add(20);
//		heap.add(15);
//		heap.add(10);
//		heap.add(5);
//		heap.add(8);
//		heap.add(12);
//
//		heap.display();
//
//		System.out.println(heap.getHP());
//		System.out.println("*****************");
//		heap.add(45);
//		heap.display();

//		Heap<Student> heap = new Heap<>();
//		heap.add(new Student("A", 2, 800));
//		heap.add(new Student("B", 7, 300));
//		heap.add(new Student("C", 4, 600));
//		heap.add(new Student("D", 1, 900));
//		heap.add(new Student("E", 8, 200));
//		heap.add(new Student("F", 9, 100));
//		heap.add(new Student("G", 3, 700));
//		heap.add(new Student("H", 5, 500));
//		heap.add(new Student("I", 6, 400));
//		heap.display();
//
//		System.out.println("************************");
//		
//		heap.remove();
//		heap.display();
		
	//	int[] arr = { 3, 5, 6, 2, 1, 4 };
        Integer[] arr= {3, 5, 6, 2, 1, 4 };
		Heap<Integer> heap=new Heap<>(arr,false);
		heap.display();
	}

	static class Student implements Comparable<Student> {
		String name;
		int rollno;
		int marks;

		public Student(String name, int rollno, int marks) {
			this.name = name;
			this.rollno = rollno;
			this.marks = marks;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;
		}

		public String toString() {
			return "{name=" + this.name + ", marks=" + this.marks + ", roll no=" + this.rollno + "}";
		}
	}

}
