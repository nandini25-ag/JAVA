package recurrsion;
import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		String arr[] = new String[n];
		
		for(int i = 0;i<arr.length;i++){
			arr[i] = cin.next();//while taking integer and string as input you should use next() instead of nextLine()
		}

		
		

		for(int i =0;i<arr.length;i++){
			for(int j = i+1;j<arr.length-1;j++){//here the condition in for loop should be j++
				if(arr[i].compareTo(arr[j])>0){//you need to write your own compare function
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(String s: arr){
			System.out.println(s);
		}

	
	}

}
