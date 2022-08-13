package twodarray;
import java.util.Scanner;
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// array declare
		int[] A = new int[N];

		for (int i = 0; i <= A.length - 1; i++) {
			A[i] = sc.nextInt();
		}
		insertion(A);
		display(A);
	}

	public static void insertion(int[] arr) {
		int counter = 1;
		while (counter <= arr.length - 1) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--; //ADDED
			}
			arr[j + 1] = val;
			counter++;
		}
	}
	public static void display(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}

}
