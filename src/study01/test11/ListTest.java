package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

public class ListTest {
	public static void main(String[] args) {
		List<String> List1 = new ArrayList<String>(); //list가 arraylist의 조상이거나 인터페이스구나. 
		//List<String> strList = new List<String>();  //안됨.
		List<String> List2 = new LinkedList<String>();
		List1 = new LinkedList<String>(); //됨. 상관없음
//		List<String> strList3 = new Vector<String>(); ->쓰지마 
		
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List2.add("1");
		List2.add("2");
		List2.add("3");
		System.out.println(List1);
		System.out.println(List2);
		List1.remove("0");
		List1.remove("0");
		System.out.println(List1);
		System.out.println(List2);
		List1.set(0, "4");
		List2.set(0, "4");
		System.out.println(List1);
		System.out.println(List2);
		System.out.println(List1.size());
		System.out.println(List2.size());
		
	}
}



//remote
//add remove set
//ArrayList는 순서를 정확하게 알고있음, Linkedlist는 앞 뒤에 뭐가있는지 알아서 나오는것임.
//순서대로 입력하고 빼오는것 중에 제일 빠른게 ArrayList
//ArrayList와 LinkedList의 차이.
