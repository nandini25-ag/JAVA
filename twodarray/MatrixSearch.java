package twodarray;
import java.util.Scanner;
public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int i,j;
		    int a[][]=new int[n][m];
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<m;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		    
		    int ser=sc.nextInt();

		    if(ser<a[0][0] || ser>a[n-1][m-1])
		{
		    System.out.println("0");
		}
		    else
		{
		    boolean isFound=false;
		    int r=0;
		    int c=m-1;
		    while(r < m && c>=0)
		{
		    	 if(a[r][c]<ser)
		    	        r++;
		    	    else if(a[r][c]>ser)
		    	        c--;
		    	    else{
		    	        isFound=true;
		    	        System.out.println("1");
		    	        break;
		    	    }
		    	}
		    	    if(isFound==false){
		    	        System.out.println("0");
		    	    }
		    	
		}
	}

}
