package simple_program;

public class string_palindrome {
	public boolean Ispalindrome(String s) {
		String rev="";
		int length = s.length();
		String temp = s;
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(temp.equals(rev)) {return true;}
		return false;
	}
	public static void main(String args[]) {
		string_palindrome p =new string_palindrome();
		if(p.Ispalindrome("carac")==true) {
			System.out.println("given string is palindrome ");
		}
		else System.out.println("given string is not palindrome");
	}
	}

