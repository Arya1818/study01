package review;

import java.util.ArrayList;

public class StringArray02 {

	static void ArrayPrintln(String[] strs) {
		System.out.print("[");
		for(int i=0;i<strs.length;i++) {
			System.out.print(strs[i]);
			if(i!=strs.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = new String[1];
		strs[0] ="1";
		strs = new String[2];
		strs[1] ="2";
		ArrayPrintln(strs);	
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
//		for(int i=0; i<strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
	}
}
