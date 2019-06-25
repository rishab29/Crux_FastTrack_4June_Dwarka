package Lecture11;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		// only array created, no student created yet.
		Student[] students = new Student[1000];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i + "th");
			System.out.println(Student.GeNumOfStudents());

		}

		// Able to access static field but cant change the value
		System.out.println(Student.MAX_STUDENTS);
		// Student.MAX_STUDENTS=2000;

		//students[250].rollNo = 10;
		System.out.println(students[250].rollNo);
//
		System.out.println(students[250].getName());
		students[250].setName("ABC"); // safe here because of exception.
		System.out.println(students[250].getName());
//
		students[250].ANonStaticFunction();
		students[250].AStaticFunction();
		Student.AStaticFunction();
//
		students[250].setUniformColor("Blue");
		System.out.println(students[350].getUniformColor());
	}
}
