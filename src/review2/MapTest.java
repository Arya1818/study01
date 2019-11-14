package review2;

import java.util.HashMap;
import java.util.Map;

class Test{
	String name;
}
public class MapTest {
	
	public static void main(String[] args) {
		Map<Test,String> map = new HashMap<>();
		Test t = new Test();
		t.name = "조";
		map.put(t,"나나");
		t = new Test();
		t.name = "종";
		map.put(t,"노노");
		
		System.out.println(map);
	}
}
