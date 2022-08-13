package recurrsion;

public class Allindices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,8,1,8,8,5};
int[] ans=allIndices(arr,0,8,0);
display(ans);
	}
public static int[] allIndices(int[] arr,int si,int data,int count) {
	if(si==arr.length) {
		int[] base=new int[count];
		return base;
	}
	int[] indices= null;
	if(arr[si]==data) {
		indices=allIndices(arr,si+1,data,count+1);
	}else {
		indices=allIndices(arr,si+1,data,count);
	}
	if(arr[si]==data) {
		indices[count]=si;
	}
	return indices;
}
public static void display(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ "  ");
}
}}
