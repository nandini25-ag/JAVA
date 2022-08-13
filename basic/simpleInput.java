package basic;
import java.util.Scanner;
public class simpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int sum=0,x,i=0;
        int[] arr=new int[9];
        while(sc.hasNext())
        {
         x=sc.nextInt();
         arr[i]=x;
         if(sum+arr[i]<0)
                break;
         i++;
        }
        System.out.println();
        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
        }
	}

}
