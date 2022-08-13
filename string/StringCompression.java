package string;
import java.util.Scanner;
import java.util.ArrayList;
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int n = s.length();
		
		ArrayList<String> list = new ArrayList<String>();
		int i =0;
		while(i<s.length())
		{
			int count=0;
			char x=s.charAt(i);
			while(i<s.length()&&s.charAt(i)==x) {//check that i should not exceed the length of the string
				count++;
				i++;
			}
			
			
			String z= String.valueOf(x);
			list.add(z);
			if(count>1) {
			    String r = String.valueOf(count);
			    list.add(r);
            }
		}

		for(int j =0;j<list.size();j++)
		{
			System.out.print(list.get(j));
		}

    
	}

}
