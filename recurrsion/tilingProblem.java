package recurrsion;
import java.util.Scanner;
public class tilingProblem {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t > 0) {
			--t;

			int n = scanner.nextInt();
			int m = scanner.nextInt();

			System.out.println(getCountIS(n, m));
		}
	}

	public static long getCountIS(int n, int m) {
		long[] storage = new long[n + 1];
		storage[0] = 0;
		for(int i=0;i<n+1;i++)
		{
			storage[i]=0;
		}
		for (int i = 1; i <= n; ++i) {
			if (i < m) {
				storage[i] = 1;

			}
			else if (i == m) {
				storage[i] = 2;

			}
			else
			storage[i] = (storage[i - 1] + storage[i - m])%1000000007;
		}

		return storage[n];
			}
}
