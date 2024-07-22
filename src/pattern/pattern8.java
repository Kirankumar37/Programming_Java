package pattern;

public class pattern8 {
	/*
	 
	 ****
	  ***
	   **
	    *
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=0;i<row;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=row-i;j>=1;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
