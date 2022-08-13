package basic;
import java.util.Scanner;
public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

			boolean flag = true;
		// true = no is prime
		int divisor = 2;
		while (divisor <= n - 1) {
		if (n % divisor == 0) {
		flag = false;
		}
		divisor = divisor + 1;
		}
		if(n <= 1)
			System.out.println("not prime");
		else if (flag == false) {
		System.out.println("not prime");
		} else {
		System.out.println("prime");
		}
		
	}

}
