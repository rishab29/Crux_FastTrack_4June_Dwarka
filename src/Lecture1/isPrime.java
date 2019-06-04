package Lecture1;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 33;
		int div = 2;
		while (div < n) {
			if (n % div == 0) {
				System.out.println("Not Prime");
				return;
			}
			div++;
		}
		System.out.println("Prime");
	}
	
	

}
