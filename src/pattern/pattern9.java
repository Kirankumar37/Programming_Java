package pattern;

public class pattern9 {
	/*
	    *
	   * *
	  *   *
	 *******
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =4;
		for(int i=1;i<=row;i++) {
			for(int j=row-i;j>=0;j--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(2*i)-1;k++) {
				if(k==0 || k==(2*i)-2 || i==row) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
