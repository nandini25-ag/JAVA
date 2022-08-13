package recurrsion;

public class PDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PDI(5);
	}
public static void PDI(int n) {
	if(n==0) {
		return;
	}
	
	System.out.println(n);
	PDI(n-1);
	System.out.println(n);
}
}
