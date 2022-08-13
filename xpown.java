
import java.util.Scanner;
public class xpown {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
int ans=calPow(x,n);
System.out.println(ans);;
    }
    public static int calPow(int x,int n){
 if(n==0){
    return 1;
 }
 if(x==0){
    return 0;
 }
 int xpown1=calPow(x,n-1);
 int xpown=x*xpown1;
 return xpown;
    }
}
