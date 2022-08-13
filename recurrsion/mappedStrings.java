package recurrsion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class mappedStrings {

	public static void mapped(String str, String temp, HashMap<String, Character> map) throws Exception {
		if (str.length() == 0) {
			System.out.println(temp);
			return;
		}
		mapped(str.substring(1), temp + map.get(str.charAt(0) + ""), map);
		if (str.length() != 1) {
			String s = str.charAt(0) + "" + str.charAt(1) + "";
			if (map.containsKey(s))
				mapped(str.substring(2), temp + map.get(s), map);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = num + "";
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<String> list = new ArrayList<>();
		HashMap<String, Character> map = new HashMap();
		for (int i = 1; i <= 26; i++) {
			map.put(i + "", letters.charAt(i - 1));
		}
		mapped(str, "", map);
	}
}
