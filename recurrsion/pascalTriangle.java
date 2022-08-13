package recurrsion;

import java.util.Scanner;

public class pascalTriangle {

		  static void printPascal(int n) 
		    { 
		          
		    // Iterate through every line 
		    // and print entries in it 
		    for (int line = 0; line < n; line++) 
		    { 
		        // Every line has number of  
		        // integers equal to line number 
		        for (int i = 0; i <= line; i++) 
		        System.out.print(binomialCoeff 
		                        (line, i)+" "); 
		                          
		        System.out.println(); 
		    } 
		    } 
		      
		    
		    static int binomialCoeff(int n, int k) 
		    { 
		        int res = 1; 
		          
		        if (k > n - k) 
		        k = n - k; 
		              
		        for (int i = 0; i < k; ++i) 
		        { 
		            res *= (n - i); 
		            res /= (i + 1); 
		        } 
		        return res; 
		    } 
		      
		    // Driver code 
		    public static void main(String args[]) 
		    {Scanner scn=new Scanner(System.in);
		    int n=scn.nextInt();  
		    printPascal(n); 
		    } 
	}

