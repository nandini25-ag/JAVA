package twodarray;
import java.util.Scanner;
public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr1[] = new int[n];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();

			}

			int m = sc.nextInt();
			int arr2[] = new int[m];

			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = sc.nextInt();

			}
	        
			if(n>m) {
				sum(arr1,arr2,n,m);
			}else {
				sum(arr2,arr1,m,n);
			}
		}
		
		
		public static void sum(int a[], int []b, int n , int m ) {
			int carry =0,s=0;
			int i=n-1;
			int j=m-1;
			int k=n-1;
			int sum[] = new int[k+1];//you should make an array of k+1 size
			while(j>=0) {
				s=a[i]+b[j]+carry;
				sum[k]=s%10;
				carry = s/10;
				i--;
				j--;
				k--;
			}
			
			while(i>=0) {
				s=a[i]+carry;
				sum[k]=s%10;
				carry=s/10;
				i--;
				k--;
			}
			
			
			if(carry==1) {
				System.out.print(1+", ");//if there is a carry then dont add 10 just print 1 do a dry run for 99 and 999
			}
			for(int r =0;r<n;r++)
			{
				System.out.print(sum[r]+", ");
			}
			System.out.println("END");
	    
	}

}
