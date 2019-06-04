package Lecture1;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter principal");
		int p = s.nextInt();

		System.out.println("Enter roi");
		int r = s.nextInt();

		System.out.println("Enter t");
		int t = s.nextInt();

		int si = (p * r * t) / 100;
		System.out.println(si);

	}

}
