package Lecture3;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 32;
        
		int bin=0;
		int tenpowers=1;// 10 raise to power 0.
		while(dec!=0) {
			int rem=dec%2;
			bin=bin+rem*tenpowers;
			dec=dec/2;
			tenpowers=tenpowers*10;
		}
		
		System.out.println(bin);
		
	}

}
