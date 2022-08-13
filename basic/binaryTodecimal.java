package basic;

import java.util.Scanner;
import java.util.Scanner;
public class binaryTodecimal {
	 
	    
		 public static void main(String args[])
		 {
		 Scanner binaryinput=new Scanner(System.in);
		 int n=binaryinput.nextInt();
		 int decimalnumber=0,power=0;
		 while(n!=0)
		 {
		 decimalnumber+=((n%10)*Math.pow(2,power));
		 n=n/10;
		 power++;
		 }
		 System.out.println(decimalnumber);
		 }
	
}
