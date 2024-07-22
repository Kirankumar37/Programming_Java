package pattern;

public class pattern4 {
	/*
	 
	 *       *
	 * *     *
	 *   *   *
	 *     * *
	 *       *
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5,col=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j || j==0 || j==col-1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
