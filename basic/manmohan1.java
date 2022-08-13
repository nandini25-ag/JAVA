package basic;
import java.util.Scanner;
public class manmohan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int nst = 1;
	        int val;
	        int row = 1;
	        while (row <= n) {
	            val = 1;
	            if (row == 1) {
	                System.out.print(1);
	            } else {
	                if (row == n-2 || row == n) {
	                    for (int cst = 1; cst <= nst; cst++) {
	                        if (cst == 1 || cst == nst) {
	                            System.out.print(val);
	                        } else {
	                            System.out.print(0);
	                           
	                        }
	                    }
	                } else {
	                    for (int cst = 1; cst <= nst; cst++) {
	                        System.out.print(val);
	                    }
	                }
	            }
	            //prep
	            System.out.println();
	            nst++;
	            row++;
	        }
	    
	}

}
