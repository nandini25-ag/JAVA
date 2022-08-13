package basic;
import java.util.Scanner;
public class vonNeuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)

		{
			
			
			int n=scan.nextInt();
			int x=0;
			int y=0;
			int val=1;
	//
	while(n/10!=0||n%10!=0)
	{
	x=n%10;
	n=n/10;
	y=y+x*val;

				val=val*2;
			}
			
			System.out.println(y);	
		}
		

	
	}

}
