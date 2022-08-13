package twodarray;
import java.util.Scanner;
public class WAVEprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		// 2d array declaration
		int[][] arr = new int[M][N];

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		display(arr);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= arr[0].length - 1; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int j = arr[0].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.print("END");
	}
}