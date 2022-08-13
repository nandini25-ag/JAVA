package basic;

import java.util.Scanner;

public class decToOctal {


    // Function to convert decimal to octal 
    static void decToOctal(int n) 
    { 
        // array to store octal number 
        int[] octalNum = new int[100]; 
  
        // counter for octal number array 
        int i = 0; 
        while (n != 0)  
        { 
            // storing remainder in octal array 
            octalNum[i] = n % 8; 
            n = n / 8; 
            i++; 
        } 
  
        // Printing octal number array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(octalNum[j]); 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { Scanner scn=new Scanner(System.in);
    int n=scn.nextInt(); 
         decToOctal(n);  
    } 
} 


