package recurrsion;
import java.util.ArrayList;
public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getPermutations("abc"));
	}
	public static ArrayList<String> getPermutations(String str){
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<>();
			//br=base result
			br.add("");
			return br;
		}
		
		
		
		char ch=str.charAt(0);
		String ros=str.substring(1);   //ros=rest of position of the string
		
		ArrayList<String> rr=getPermutations(ros);                 //rr=recursion result
		ArrayList<String> mr=new ArrayList<>();            //mr=my result
		for(String rrs:rr) {
			for(int i=0;i<=rrs.length();i++) {
				String val=rrs.substring(0,i)+ch+rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
		
		
	}

}
