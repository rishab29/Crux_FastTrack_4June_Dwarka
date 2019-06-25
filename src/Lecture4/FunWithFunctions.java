package Lecture4;

public class FunWithFunctions {

	static int global_var = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello Main");
		HelloFun();

		// HelloFun();
		// HelloFun();

//		int p=1000;
//		int r=10;
//		int t=1;
//		//si(p,r,t);
//		
//		int ans=si(p, r, t);
//		System.out.println(ans);

//		String name="Raghav";
//		name=getName(name);
//		System.out.println(name);

//		int a = 10;
//		int b = 20;
//		System.out.println(a + ", " + b);
//		swap(a, b);
//		System.out.println(a + ", " + b);

		// scopes
		int a = 10;
		int b = 0;
		if (true) {
			System.out.println("hello");
		}
		if (a >= 10) {
			b = 20;
			System.out.println(b);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(global_var);

	}

	public static void HelloFun() {
		HelloGun();
		System.out.println("Hello Fun");
	}

	public static void HelloGun() {
		System.out.println("Hello Gun");
	}

	public static int si(int p, int r, int t) {
		int si = (p * r * t) / 100;
		// System.out.println(si);
		return si;

	}

	public static String getName(String name) {
		System.out.println(name);
		name = "Aakash";
		System.out.println(name);

		return name;

	}

	public static void swap(int a, int b) {
		System.out.println(a + ", " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + ", " + b);
		System.out.println(global_var);
	}

}
