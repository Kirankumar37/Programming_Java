package pattern;

public class pattern7 {
	/*
	      *
	     * *
	    * * *
	   * * * *
	    * * *
	     * *
	      *
	 */

	public static void main(String[] args) {
		int row=8;
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row-i;k>=1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
