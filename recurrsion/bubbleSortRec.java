package recurrsion;

public class bubbleSortRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {50,40,30,20,10};
sort(arr,0,arr.length-1);
display(arr);
	}
	public static void sort(int[] arr,int si,int li) {
		if(li==0) {
			return;
		}
		
		if(si==li) {
			sort(arr,0,li-1);
			return;
		}
		
		if(arr[si]>arr[si+1]) {
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		sort(arr,si+1,li);
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "  ");
		}
	}

}
