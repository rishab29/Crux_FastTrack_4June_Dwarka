package Lecture5;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		// Part 1
		String str;
		// System.out.println(str); //because it is null

		// Part 2
		str = "Hello";
		System.out.println(str.length());
		// System.out.println("********************************");
		//
		// // Part 3
		System.out.println(str.charAt(0));
		// System.out.println(str.charAt(str.length()));
		System.out.println(str.charAt(str.length() - 1));
		// System.out.println("********************************");
		//
		// // Part 4
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(2, 3));
		System.out.println(str.substring(2, 2));
		// System.out.println(str.substring(2, 1));
		System.out.println(str.substring(2, 5));
		// System.out.println(str.substring(2, 6));
		System.out.println(str.substring(2));
		System.out.println("********************************");
		// //
		// // // Part 5
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);
		System.out.println("********************************");
		// //
		// // // Part 6
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));
		System.out.println("********************************");
		// //
		// // // Part 7
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));
		System.out.println("********************************");
		// //
		// // // Part 8
//		 Scanner s = new Scanner(System.in);
//		String mystring = s.next();
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");
		String s5 = "Hello";
//		// //
//		// s5="Hi";
		System.out.println((s1 == s2) + ", " + s1.equals(s2));
		System.out.println((s1 == s3) + ", " + s1.equals(s3));
		System.out.println((s1 == s4) + ", " + s1.equals(s4));
//		//
		System.out.println((s1 == s5));
		System.out.println((s5 == s4));

//		 System.out.println(mystring == s1);
//		 System.out.println(mystring == s4);

		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.toString());
//		sb.append("Hello");
//		System.out.println(sb.toString());
//		sb.append('y');
//		System.out.println(sb.toString());
////		//
//		sb.setCharAt(2, 'i');
//		 System.out.println(sb.charAt(0));
//		System.out.println(sb.toString());

	}

}
