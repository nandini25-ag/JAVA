package basic;
import java.util.Scanner;
public class farenhietTocelcius {

	public static void main(String[] args) {
		
		  float temperature;
		    Scanner scn = new Scanner(System.in);

		    temperature = scn.nextInt();

		    temperature = ((temperature - 32)*5)/9;

		    System.out.println("temperature in Celsius = " + temperature);
		  }
	}


