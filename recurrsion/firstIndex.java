package recurrsion;

public class firstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,6,8,1,1,8,3,5};
System.out.println(firstIndex(arr,0,9));
	}
	public static int firstIndex(int[] arr,int si,int data) {
		if(si==arr.length) {
			return -1;
		}
		if(arr[si]==data) {
			return si;
		}else {
			int restAns=firstIndex(arr,si+1,data);
			return restAns;
		}
	}

}
