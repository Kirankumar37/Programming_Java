package simple_program;
import java.math.*;
public class armstrong {
	public boolean Isarmstrong(int n) {
		int temp =n;
		int length =0;
		while(temp>0) {
			temp=temp/10;
			length++;
		}
		temp=n;
		double temp2=0;
		while(temp>0) {
			int r=temp%10;
			temp2= temp2+Math.pow(r,length);
			temp=temp/10;
		}
		
		if(n==temp2) return true;
		return false;
	}
	
	public void armstrongNumbers(int i,int j) {
		for(int k=i;k<=j;k++) {
			//Isarmstrong(k);
			if(Isarmstrong(k)==true) { 
				System.out.print(k+" ");}
			else {
				continue;
			}
		}
	}
	public static void main (String args[]) {
		armstrong a=new armstrong();
		/*if(a.Isarmstrong(153)==true) {
			System.out.println("Given no. is armstrong");
		}
		else {
			System.out.println("Given no. is not armstrong");
		}*/
		a.armstrongNumbers(1,999999999);
	}
}
