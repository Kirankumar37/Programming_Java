package simple_program;

public class prime_number {
	public boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
				return true;
				
			
	}
	public static void main(String args[]) {
		prime_number p=new prime_number();
		System.out.println(p.isPrime(5));
	
	}
}
