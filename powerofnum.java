import java.util.*;
public class powerofnum {
    public static void main(String[] args){
        long ans=1;
        int x,n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        n=sc.nextInt();
        int i=1;
        while(i<=n){
            ans=ans*x;
            i++;
        }
System.out.println(ans);;
    }
}
