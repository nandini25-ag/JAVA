import java.util.*;
public class Arrays {
  public static void main(String[] arsgs){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int num[]=new int[size];

//input
for(int i=0;i<size;i++)
{
num[i]=sc.nextInt();
}
int x=sc.nextInt();
//System.out.println(marks[1]);
//outpt
for(int i=0;i<num.length;i++){
 if(num[i]==x){
    System.out.println("x is fount at index"+ i);
 }   
}
  }  
}
