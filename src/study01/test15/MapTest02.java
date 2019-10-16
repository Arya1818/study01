package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest02 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("보물1호","컴퓨터");
		map.put("보물2호","초밥");
		map.put("할일","운동");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " +key);
			String value = map.get(key);
			System.out.println("value : " +map.get(key));
		}
	}
}
