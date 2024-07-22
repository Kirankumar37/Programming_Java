package simple_program;

public class fibanacci_with_recursion {
	public int fibanacci_with_Recursion(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibanacci_with_Recursion(n-1)+fibanacci_with_Recursion(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibanacci_with_recursion f =new fibanacci_with_recursion();
		System.out.println(f.fibanacci_with_Recursion(5));
	}

}
