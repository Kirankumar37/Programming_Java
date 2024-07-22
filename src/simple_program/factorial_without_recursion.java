package simple_program;

public class factorial_without_recursion {
	public int factorial(int n) {
		int fact=1;
		if(n==0 || n==1) {
			return n;
		}
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String args[]) {
		factorial_without_recursion f =new factorial_without_recursion();
		System.out.println(f.factorial(5));
	}
}
