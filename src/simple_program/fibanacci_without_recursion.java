package simple_program;

public class fibanacci_without_recursion {
	public int fibanacci_without_Recursion(int n) {
		int n1=0,n2=1;
		int count=0;
		for(int i=3;i<=n;i++) {
			count =n1+n2;
			n1=n2;
			n2=count;
		}
		return count;
	}
	
	public static void main(String args[]) {
		fibanacci_without_recursion f =new fibanacci_without_recursion();
		System.out.println(f.fibanacci_without_Recursion(6));
	}
	

	

	

}
