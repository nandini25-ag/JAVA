package basic;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i)
				System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			System.out.print("\n");
			
	}

	

	}

}
