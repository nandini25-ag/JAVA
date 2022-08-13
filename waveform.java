public class waveform {
    public static void main(String[] args){

    }
    public static int[] waveform(int arr[][], int rows, int col){
int[] ans=new int[rows*col];
int index=0;
for(int j=0;j<=col;j++){
    if(j%2==0){
        //d
        for(int i=0;i<rows;i++){
            ans[index++]=arr[i][j];
        }
    }
    else{
        //u
        for(int i=rows-1;i>0;i--){
            ans[index++]=arr[i][j];
        }
    }
}
return ans;
    }
}
