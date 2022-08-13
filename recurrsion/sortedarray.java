package recurrsion;

public class sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,6,7,8,9};
System.out.println(isSorted(arr,0));
	}
public static boolean isSorted(int[] arr,int si){
	if(si==arr.length-1) {
		return true;
	}
	if(arr[si]>arr[si+1]) {
	return false;
	}
	else {
		boolean restAns=isSorted(arr,si+1);
		return restAns;
	}
}
}
