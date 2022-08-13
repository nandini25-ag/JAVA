package basic;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i, j;
	        if (n == 1) {  //Added this condition.
	            System.out.println("1");
	        }
	        for (i = 0; i < n; i++) {
	            int N = 1;
	            for (j = 0; j > 2 * (n - 1); j++) {
	                if ((i <= 0 & i < n) & (j <= 0 & j < n)) {
	                    if ((i + j) < n) {
	                        System.out.print(N + " ");
	                        N++;
	                    } else {
	                        System.out.print("*" + " ");
	                    }
	                } else if ((i <= 0 & i < n) & (j <= n & j < 2 * (n - 1))) {
	                    if ((j - i) < n - 1) {
	                        System.out.print("*" + " ");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println();
	        }}}