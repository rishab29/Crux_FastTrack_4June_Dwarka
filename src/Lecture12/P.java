package Lecture12;

public class P {
	int d1 = 11;
	int d = 12;

    public static int NUMBER = 10;

	public void Fun1() {
		System.out.println("Inside P's Fun1");
	}

	public void Fun() {
		System.out.println("Inside P's Fun");
	}

	// final fns can't be overridden
	public final void finalFun() {
		System.out.println("Inside P's finalFun");

	}

	public static void staticFun() {
		System.out.println("Inside P's staticFun.");
	}
//	
	
}
