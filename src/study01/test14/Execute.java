package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("박도영");
		p.setAge(24);
		p.setAddr("안양");

		List<Person> pList = new ArrayList<Person>();
		// person이라고 부를수있는것들만 가능
		pList.add(p); // p는 person이라고 부를 수 있음

		p = new Person();

		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);

		p = pList.get(1);

		p.setName("재빈");

		System.out.println(pList);
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
	}
}
//변수p