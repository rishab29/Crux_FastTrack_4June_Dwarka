package Lecture1;

public class SumOfFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
