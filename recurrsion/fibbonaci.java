package recurrsion;

public class fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fib(10));
	}
public static int fib(int n) {
	//base case
	if(n==0||n==1) {
		return n;
	}
	//n-1 fibbonaci
	int fnm1=fib(n-1);
	//n-2 fibbonaci
	int fnm2=fib(n-2);
	//nth fibbonci is calculated by the sum of (n-1) and (n-2)
	int fn=fnm1+fnm2;
	return fn;
}
}
