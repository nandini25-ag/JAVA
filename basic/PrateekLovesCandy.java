package basic;
import java.util.Scanner;
public class PrateekLovesCandy {
	//Prateek recently graduated from college.
	//To celebrate, he went to a candy shop and bought all the candies.
	//The total cost was a number upto which there are n prime numbers (starting from 2).
	//Since Prateek wants to minimize his cost, he calls you to help him 
	//find the minimum amount that needs to be paid. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int k = 1; k <= t; k++) {

			int n = sc.nextInt();

			int prime = 0;
			boolean status = true;
			int x = 2;

			for (int i = 1; i <= n;) {

				for (int j = 2; j <= Math.sqrt(x); j++) {

					if (x % j == 0) {
						status = false;
						break;
					}
				}

				if (status) {
					prime = x;
					i++;
				}
				
				if (i != 2) {
					x+=2;
				}
				else
					x ++;
				status = true;
			}

			System.out.println(prime);
		}
	
	}

}
