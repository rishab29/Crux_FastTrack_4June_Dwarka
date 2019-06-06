package Lecture2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       
       int nst=5;
       int nsp=0;
       
       int row=1;
       while(row<=n) {
    	   int csp=1;
    	   while(csp<=nsp) {
    		   System.out.print(" ");
    		   csp++;
    	   }
    	   
    	   int cst=1;
    	   while(cst<=nst) {
    		   System.out.print("*");
    		   cst++;
    	   }
    	   
    	   row++;
    	   nst--;
    	   nsp=nsp+2;
    	   System.out.println();
       }
	}

}
