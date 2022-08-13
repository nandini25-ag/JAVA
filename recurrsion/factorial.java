package recurrsion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Fact(4));
		System.out.println(power(2,5));
	}
public static int Fact(int n) {
	if(n==1) {
		return 1;
	}
	int fnm1=Fact(n-1);
	int fn=n*fnm1;
	return fn;
}
public static int power(int x,int n) {
	if(n==0){
		return 1;
	}
	int pnm1=power(x,n-1);
	int pn=x*pnm1;
	return pn;
}
}
