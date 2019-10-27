package study01.test11;


import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		ArrayList<String> List1 = new ArrayList<String>();
		
		List1.add("1");
		List1.add("2");
		List1.add("3");
//		System.out.println(List1.get(1));  //[1,2,3]
		List1.remove("2");
		System.out.println(List1);  //[1,3]
		List1.set(0,"5");
		System.out.println(List1);  //[5,3]
		System.out.println(List1.size()); //2
	}
}
