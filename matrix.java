import java.util.*;
public class matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] num=new int[rows][col];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
  //output
  for(int i=0;i<rows;i++)
{
for(int j=0;j<col;j++){
    //compare with x
    if(num[i][j]==x){
        System.out.println("x is fount at location ("+i +","+ j+ ")");
    }
}
}    }
}
