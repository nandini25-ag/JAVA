package recurrsion;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();

	        int nst = 1;
	        int row = 0;

	        while(row < n){
	            if(row == 0){
	                System.out.print("1");
	            }else{
	                for(int cst = 1; cst <= nst; cst++){
	                    if(cst == 1 || cst == nst){
	                        System.out.print(row); 
	                    }else{
	                        System.out.print("0");
	                    }
	                }
	            }

	            System.out.println();
	            nst++;
	            row++;
	        }
	}
		

    
	}


