package simple_program;
import java.util.*;
public class randomExample {
	public void random(int num,int start,int end) {
		Random r =new Random();
		r.ints(num,start,end).forEach(System.out::println);
	}
	public static void main (String args[]) {
		randomExample r1=new randomExample();
		r1.random(1,10,50);
	}
}
