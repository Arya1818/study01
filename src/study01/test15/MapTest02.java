package study01.test15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("이름","조은애");
		map.put("나이","25");
		map.put("직업","학생");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			String value = map.get(key);
			System.out.println(value);
		}
	}
}
