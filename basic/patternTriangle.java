package basic;
import java.util.Scanner;
public class patternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int nsp = n - 1;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < nsp; j++) {
	                System.out.print("  "); //Double space required
	            }
	            for (int j = i + 1; j <= 2 * i + 1; j++) {
	                System.out.print(j + " "); // Space required
	            }
	            for (int j = 2 * i; j > i; j--) {
	                System.out.print(j + " "); // Space required
	            }
	            System.out.println();
	            nsp--;
	        }

	    
	}

}
