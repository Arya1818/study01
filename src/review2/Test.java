package review2;

import java.util.ArrayList;
import java.util.List;


class Test2{
	public Test2(int num1) { //생성자
		System.out.println("힘내요");
	}
}
public class Test {

	public static void main(DataType[] args) {
		List<Test> testList = new ArrayList<>();
		testList.add(new Test());
		List<Test2> testList2 = new ArrayList<>();
		testList2.add(new Test2(5));
		testList2.add(new Test2(7));
		
		//System.out.println(testList2);
		
	}

}
