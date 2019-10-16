package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("좋아하는 차1", "작두콩차");
		map.put("좋아하는 차2", "페퍼민트");
		map.put("좋아하는 차3", "비트차");
		map.put("테스트1", "12356");
		map.put("테스트3", "12356");
		map.put("테스트4", "12356");
		map.put("테스트5", "12356");
		map.put("테스트2", "12356");

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();

			System.out.println("key:" + key + ", value : " + map.get(key));
		}
	}
}

//순서가있는것처럼 보이지만 연결된 링크를 따라가는것 뿐임.
//단일로만 map을 쓸 일은 없음. 결국 list에 들어가야함. 
//linked 잘 안씀, arraylist랑 hashmap 많이 씀
