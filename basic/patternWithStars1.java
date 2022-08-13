package basic;
import java.util.Scanner;
public class patternWithStars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		int nst = 1;
		int num = n;
		for(int i=1;i<=n;i++){
			int val = 1;
			for(int j=1;j<=num;j++){
				System.out.print( val );
				val++;
			}
			if(i>1){
			for(int j=1;j<=nst;j++){
				System.out.print(" * ");
			}
			nst+=2;
			}
		
			System.out.println( );
			num--;
			
		}
	}

}
