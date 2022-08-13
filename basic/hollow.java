package basic;

import java.util.Scanner;

public class hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		 
	              System.out.print("Enter Symbol : ");
		
	              char c = scn.next().charAt(0);
	 
		for(int i=1;i<=n;i++)
	               {
	 
	                        for(int j=1;j<=n-i;j++)
	                
	                        {
	                               System.out.print(" ");
	                        }
		     if(i==1 || i==n)
	                       for(int j=1;j<=n;j++)
	                
	                        {
	                               System.out.print(c);
	                        }
	                   else
		    {
	                	       for(int j=1;j<=n;j++)
	                
	                	       {  
	                            		if(j==1 || j==n)
	                               	System.out.print(c);
	                              	else
	                             
	                            	               System.out.print(" ");
	                                   }
	                     }
	                            System.out.println();
	                       
	               }    
	}

}
