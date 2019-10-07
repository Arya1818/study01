package study01.test09;

import java.util.ArrayList;

public class StringArray_01 {

	///사진찍은거 여기 추가해주면 됨!!
	public static void main(String[] args) {
		String[] strs = new String[0];
		strs = new String[1];
		strs[0] ="1";
		strs = new String[2];
		strs[1] ="2";
		arrayPrintln(strs);
				
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		strList.remove(1);
	}
}
