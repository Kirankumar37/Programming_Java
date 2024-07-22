package pattern;

public class pattern11 {
	/*
	     1
	    1 1
	   1 2 1
	  1 3 3 1
	 1 4 6 4 1
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=8;
		
		//int p=m+n;
		for(int i=0;i<row;i++) {
			int m=1;
			for(int j=row-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				
				System.out.printf("%4d",m);
				m=m*(i-k)/(k+1);
				}
			
			System.out.println();
		}

	}

}
