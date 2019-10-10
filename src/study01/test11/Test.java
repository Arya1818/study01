package study01.test11;

import java.util.HashMap;

public class Test {

	void changeMap(HashMap<String,String> map) {
		map = new HashMap<String,String>();
		map.put("나이","44");
	}
	public static void main (String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("나이","33");
		Test t = new Test(); //(static이 없으니)
		t.changeMap(map);
		System.out.println(map);
	}
}
