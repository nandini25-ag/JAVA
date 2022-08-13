package recurrsion;

import java.util.ArrayList;

public class RecurrsionGetSubseq {

	public static void main(String[] args) {
System.out.println(getSS("abc"));
	}
	public static ArrayList<String> getSS(String str){
		if(str.length()==0) {
			ArrayList<String> baseResult=new ArrayList<>();
			baseResult.add(" ");
		}
		
		
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myresult=new ArrayList();
		ArrayList<String> recresult=getSS(ros);
		for(int i=0;i<recresult.size();i++) {
			myresult.add(recresult.get(i));
			recresult.add(cc+recresult.get(i));
			}
		return myresult;
	}

}
