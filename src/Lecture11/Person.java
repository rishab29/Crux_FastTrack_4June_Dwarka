package Lecture11;

public class Person {
	public int age;
	public String name;

	// default
	Person() {
		// System.out.println("Hello");
	}

	// parametrized
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

}
