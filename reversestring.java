
public class reversestring {
    
    public static void main(String[] args){
String str="abcd";
RevStr(str, str.length()-1);
    }
   public static void RevStr(String str ,int idx){
    if(idx==0){
        System.out.println(str.charAt(idx));
return;
    }
    System.out.println(str.charAt(idx));
    RevStr(str,idx-1);   } 
}
