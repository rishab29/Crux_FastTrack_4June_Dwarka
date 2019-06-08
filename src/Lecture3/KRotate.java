package Lecture3;

public class KRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=54362;
        
        int k=4;
        int nod=0;
        int n=num;
        while(n!=0) {
        	nod++;
        	n=n/10;
        }
       // System.out.println(nod);
        
        k=k%nod;
        if(k<0) {
        	k=k+nod;
        }
        
        int divisor=(int)Math.pow(10, k);
        int rem=num%divisor;
        num=num/divisor;
        int ans=rem*(int)Math.pow(10, nod-k)+num;
        System.out.println(ans);
        
	}

}
