package Lecture2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4;
       int row=1;
       
       while(row<=n) {
    	   int csp=1;
    	   while(csp<=n-row) {
    		   System.out.print(" ");
    		   csp++;
    	   }
    	   
    	   //inc values
    	   int cst=1;
    	   int value=row;
    	   while(cst<=row) {
    		   System.out.print(value);
    		   value++;
    		   cst++;
    	   }
    	   
    	   //dec values
    	   cst=1;
    	   value=value-2;
    	   while(cst<row) {
    		   System.out.print(value);
    		   cst++;
    		   value--;
    	   }
    	   
    	   row++;
    	   System.out.println();
       }
	}

}
