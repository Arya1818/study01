package study01.test11; // 너무 어렵다. 하지만 이해만 하면 쉽다!

import java.util.HashMap;

public class Test {

	void changeMap(HashMap<String,String> map) {
		map = new HashMap<String,String>();
		map.put("나이","44");
//		System.out.println(map);
	}
	public static void main (String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("나이","33");
		Test t = new Test(); //(static이 없으니)
//		t.changeMap(map);
		System.out.println(map);
		
	}
}
