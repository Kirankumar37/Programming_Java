package NumbersInJava;
import java.util.*;
public class ReverseTheNumber_with_Recursion {
	public  void Reverse(int num) {
		
		if(num<10) {
			System.out.println(num);
		}
		else {
		System.out.print(num%10);
		Reverse(num/10);
		}
		
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter");
		int n =s.nextInt();
		ReverseTheNumber_with_Recursion m =new ReverseTheNumber_with_Recursion();
		m.Reverse(n);

	}

}
