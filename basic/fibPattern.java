package basic;

import java.util.Scanner;

public class fibPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int cst = 1;

			for (cst = 1; cst < nst + 1; cst++) {

				int f;
				System.out.print(num1 + "\t");
				f = num1 + num2;
				num1 = num2;
				num2 = f;
				// cst++;

			}
			nst++;
			row++;
			System.out.println();
		}
	}
	}


