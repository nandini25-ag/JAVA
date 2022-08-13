package twodarray;
import java.util.Scanner;
public class UpperAndLowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] A = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };
	        int X;
	        Scanner s = new Scanner(System.in);
	        X = s.nextInt();
	        System.out.println(LowerBound(A, X));
	        System.out.println(UpperBound(A, X));
	    }

	    public static int LowerBound(int[] a, int x) {
	        int low = 0;
	        int high = a.length - 1;
	        int ans = -1;
	        for (int i = 0; low <= high; i++) {
	            int mid = (low + high) / 2;
	            if (a[mid] < x) {
	                low = mid + 1;
	            } else if (a[mid] > x) {
	                high = mid - 1;
	            } else if (a[mid] == x) {
	                ans = mid;
	                high = mid - 1;  // To find the lower bound move the pointer
	            }
	        }
	        return ans;
	    }

	    public static int UpperBound(int[] a, int x) {
	        int low = 0;
	        int high = a.length - 1;
	        int ans = -1;
	        for (int i = 0; low <= high; i++) {
	            int mid = (low + high) / 2;
	            if (a[mid] < x) {
	                high = mid - 1;
	            } else if (a[mid] > x) {
	                low = mid + 1;
	            } else if (a[mid] == x) {
	                ans = mid;
	                low = mid + 1;  // To find the upper bound move the pointer up
	            }
	        }
	        return ans;
	}

}
