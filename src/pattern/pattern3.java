package pattern;

public class pattern3 {
	/*
	 *
	   *
	     *
	       *
	 */
	

	public static void main(String[] args) {
		int row=4;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i+1;j++) {
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
