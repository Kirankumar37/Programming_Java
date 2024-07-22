package simple_program;

public class palindrome {
	public boolean Ispalindrome(int num) {
		int temp,sum=0,r;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(temp==sum) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		palindrome p =new palindrome();
		if(p.Ispalindrome(101)==true) {
			System.out.println("given no.is palindrome ");
		}
		else System.out.println("given no. is not palindrome");
	}
}
