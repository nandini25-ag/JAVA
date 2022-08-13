package twodarray;
import java.util.Scanner;
public class GRandTemple {
//A religious king wants to build the largest temple in his kingdom .
//To build the largest temple he needs to find the area of the largest suitable land . 
//Given co-ordinates which denotes rivers flowing through the point horizontally as well as vertically , 
//find the largest area possible to make the grand temple.
//Consider 2 rivers flowing across x-axis as well as y-axis. 
//The temple must be enclosed by rivers on all 4 sides.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] x = new int [n];
	    int [] y = new int [n];

	    for(int i = 0 ; i<n ; i++)
	    {
	        x[i] = sc.nextInt();
	        y[i] = sc.nextInt();
	    }
	    x = MergeSort( x , 0 , n-1);
		y = MergeSort( y , 0 , n-1);
		long ans = 0;
		long maxbreadth=0;

	    
			for(int j = 0 ; j<n-1 ; j++)
			{
	        
	     maxbreadth =Math.max( (y[j+1] - y[j]) - 1,maxbreadth);

			
			}
	    long area = 0;
	    for(int i=0;i<n-1;i++){
	    	long length = (x[i+1] - x[i]) - 1;
	    	if( length > 0 && maxbreadth > 0)
	    	area = length * maxbreadth ;

	    	        if( area > ans )
	    	        {
	    	            ans = area;
	    	        }
	    		}

	    	    System.out.println(ans);
	    	}

	    	public static int[] MTSA (int [] arr , int [] brr)
	    	{
	    	    int [] res = new int [arr.length + brr.length];
	    	    int i = 0 , j = 0 , k=0;
	    	    while (i<arr.length && j<brr.length)
	    	    {
	    	        if(arr[i]<=brr[j])
	    	        {
	    	            res[k] = arr[i];
	    	            i++;
	    	        }
	    	        else
	    	        {
	    	            res[k] = brr[j];
	    	            j++;
	    	        }
	    	        k++;
	    	    }

	    	    if(i == arr.length )
	    	    {
	    	        while (j < brr.length)
	    	        {
	    	            res[k] = brr[j];
	    	            j++;
	    	            k++;
	    	        }
	    	    }
	    	    else if(j == brr.length )
	    	    {
	    	        while (i < arr.length)
	    	        {
	    	            res[k] = arr[i];
	    	            i++;
	    	            k++;
	    	        }
	    	    }

	    	    return res;
	    	}

	    	public static int [] MergeSort(int [] arr , int lo , int hi)
	    	{

	    	    if(lo == hi)
	    	    {
	    	        int [] br = new int [1];
	    	        br[0] = arr[lo];
	    	        return br;
	    	    }
	    	    int mid = (lo + hi)/2 ;
	    	    int [] fh =  MergeSort(arr,lo,mid);
	    	    int [] sh =  MergeSort(arr,mid+1,hi);
	    	    int [] result = MTSA(fh,sh);

	    	    return result;
	    	
	}

}
