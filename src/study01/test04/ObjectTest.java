package study01.test04;

import java.util.Random;

public class ObjectTest {
	int age; // 변수를 선언만 함. 멤버변수:자바가 0으로 초기화 시켜줌.
	String name;

	String getStr() { // return해줘야 오류가 안남
		return null; // null 가능함
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest(); // ot, //age가 초기화됨(자바가알아서)
		System.out.println(ot.age);
		System.out.println(ot.name);

	}
}