package basic;
import java.util.Scanner;
public class armstrong {
	 

		  public static void main(String args[]) {
			  Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();

				int number, temp, total = 0, count = 0;

				number = num;

				while (num > 0) {

					// temp = num % 10;
					num /= 10;
					count++;
				}
				num = number;
				while (number > 0) {

					temp = number % 10;
					// total = total + temp * temp * temp;

					total = total + (int) Math.pow(temp, count);
					number /= 10;
					// count++;
				}

				if (total == num)
					System.out.println("true");
				else
					System.out.println("false");
			}
		}
