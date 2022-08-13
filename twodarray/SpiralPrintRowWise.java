package twodarray;
import java.util.Scanner;
public class SpiralPrintRowWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
        print(arr, 0, 0, rows,cols); 
        System.out.println("END");

    }
    public static void print(int arr[][], int i, int j, int m, int n) 
    {  
        if (i >= m || j >= n) 
        { 
            return; 
        } 
  
        for (int p = i; p < n; p++) 
        { 
        	 System.out.print(arr[i][p] + ", "); 
        } 
  
        for (int p = i + 1; p < m; p++)  
        { 
            System.out.print(arr[p][n - 1] + ", "); 
        } 
  
        if ((m - 1) != i)  
        { 
            for (int p = n - 2; p >= j; p--)  
            { 
                System.out.print(arr[m - 1][p] + ", "); 
            } 
        } 
  
        if ((n - 1) != j)  
        { 
            for (int p = m - 2; p > i; p--)  
            { 
                System.out.print(arr[p][j] + ", "); 
            } 
        } 
        print(arr, i + 1, j + 1, m - 1, n - 1); 

    
	}

}
