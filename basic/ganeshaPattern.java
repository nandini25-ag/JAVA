package basic;
import java.util.Scanner;
public class ganeshaPattern {
	static void swastika(int row, int col)  
    { 
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++)  
            { 
                // checking if i < row/2 
                if (i < row / 2)  
                { 
                      
                    // checking if j<col/2 
                    if (j < col / 2)  
                    { 
                          
                        // print '*' if j=0 
                        if (j == 0) 
                            System.out.print("*"); 
                              
                        // else print space 
                        else
                            System.out.print(" "+ " "); 
                    } 
                      
                    // check if j=col/2  
                    else if (j == col / 2) 
                    System.out.print(" *"); 
                      
                    else
                    { 
                        // if i=0 then first row  
                        // will have '*' 
                        if (i == 0) 
                            System.out.print(" *"); 
                    } 
                } 
                else if (i == row / 2) 
                    System.out.print("* "); 
                else 
                { 
                      
                    // middle column and last column  
                    // will have '*' after i > row/2 
                    if (j == col / 2 || j == col - 1) 
                    System.out.print("* "); 
                      
                    // last row 
                    else if (i == row - 1)  
                    { 
                          
                        // last row will be have '*' if  
                        // j <= col/2 or if it is last column 
                        if (j <= col / 2 || j == col - 1) 
                            System.out.print("* "); 
                        else
                            System.out.print(" "+ " "); 
                    }  
                    else
                    System.out.print(" "+" "); 
                } 
            } 
            System.out.print("\n"); 
        } 
    }  
      
    // Driver code  
    public static void main (String[] args) 
    { 
        // odd number of row and column 
       
    	Scanner scn = new Scanner(System.in); // Scanner class to take input
    	int rows = scn.nextInt(); // Taking input of a rows
    	int cols = scn.nextInt(); // Taking input of columns
    	int[][] arr = new int[rows][cols]; // Size declared at the run time 
    } 

}
