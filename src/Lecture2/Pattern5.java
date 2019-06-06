package Lecture2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       int row=1;
       
       int vtp=1;
       while(row<=n) {
    	    int cvp=1;
    	    while(cvp<=vtp) {
    	    	if(cvp%2==1) {
    	    		System.out.print(row);
    	    	}else {
    	    		System.out.print("*");
    	    	}
    	    	cvp++;
    	    }
    	    
    	    //next row work
    	    vtp=vtp+2;
    	    System.out.println();
    	    row++;
       }
	}

}
