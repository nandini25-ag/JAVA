import java .util.Scanner;

public class fFctorial {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans= Factorial(n);
System.out.println(ans);
  } 
  public static int Factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
int fact_nm1=Factorial(n-1);
int fact_n= n* fact_nm1;
return fact_n;
  }
}
