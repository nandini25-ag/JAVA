package twodarray;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] result = bubblesortForArray(arr);
		printarray(result);
   }
      public static void printarray(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
     public static int[] bubblesortForArray(int[] arr2) {
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = 0; j < arr2.length -i- 1; j++) {
				int max = arr2[j+1];

				if (arr2[j] > arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = max;
					arr2[j + 1] = temp;
				}
			}
		}
		return arr2;

 	
	}

}
