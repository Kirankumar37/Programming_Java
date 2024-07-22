package pattern;

public class pattern5 {
	/*
	        *
	      * * 
	    * * *
	  * * * *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<row;j++) {
				if(j<i) {
				System.out.print(" ");}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}

}
