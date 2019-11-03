package programmers;

import java.util.ArrayList;
import java.util.List;

class Test2{
	public Test2(int num1) {
		
	}
}
public class Test {
	public static void main(String[] args) {
	Test t = new Test();
	Test2 t2 = new Test2(5);
	
	List<Test> tList = new ArrayList<>();
	tList.add(t);
	
	List<Test2> ttList = new ArrayList<>();
	ttList.add(new Test2(5));
	
	}
}
