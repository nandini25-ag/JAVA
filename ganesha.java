import java.util.*;
public class ganesha{
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=(N+1)/4;
		int nst1=(N+1)/2;  


		int nsp1=(N+1)/4;
		while(row<=N)
		{
		if(row>=1&&row<=N-N/2)
		{
		for(int cst=1;cst<=nst;cst++)
		{
		System.out.print("");
		}
		for(int csp=1;csp<=nsp;csp++)
		{
		System.out.print(" ");
		}

					for(int cst1=1;cst1<=nst1;cst1++)
					{
						System.out.print("*");
					}
					}
					if(row>=(N+1)/2+(N)/(N-1)&&row<=(N+1)/2+N/3)
					{
						for(int csp=1;csp<=nsp;csp++)
						{
							System.out.print(" ");
						}
						for(int cst=1;cst<=nst;cst++)
						{
							System.out.print("*");
						}
						for(int csp1=1;csp1<=nsp1;csp1++)
						{
							System.out.print(" ");
						}
						for(int cst=1;cst<=nst;cst++)
						{
							System.out.print("*");
						}
						}
					
					if(row==N)
					{
						for(int cst1=1;cst1<=nst1;cst1++)
						{
							System.out.print("*");
						}
						for(int csp1=1;csp1<=nsp1;csp1++)
						{
							System.out.print(" ");
						}
						for(int cst=1;cst<=nst;cst++)
						{
							System.out.print("*");
						}
					}
					
				
				System.out.println();
				
				if(row==1)
				{
					nst1=(N+1)/2-N/2;
					
				}
				if(row==N/2)
				{
					nsp=(N+1)/4-(N+1)/4;
					
					nst1=(N+1)/2;
					nst=nst+(N+1)/4;
				}
				
				if(row==(N+1)/2)
				{
					nsp=N/2;
					
					nst=N/2-(N-2)/2;
				}
				
				
				row++;
				
				
				}
		    
	}
}