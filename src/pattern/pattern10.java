package pattern;

public class pattern10 {
/*
 1
 2 3
 4 5 6
 7 8 9 10
 */
	public static void main(String[] args) {
		int row=10;
		int k=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
