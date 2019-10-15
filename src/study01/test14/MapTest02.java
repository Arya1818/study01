package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest02 {
	public static void main(String[] args) {

		HashMap<String, String> map;
		List<HashMap<String, String>> mapList = new ArrayList<HashMap<String, String>>(); // hashmap으로 이뤄진 리스트 (키 밸류
																							// 가지고있는) //테이블
		for (int i = 1; i <= 30; i++) {
			map = new HashMap<String,String>();
			map.put("이름", "홍길동" + i);
			map.put("나이", i + "");
			map.put("성별", "남자");
			if (i % 2 == 0) {
				map.put("성별", "여자");

			}
			mapList.add(map);
		}

		for (int i = 0; i < mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}

	}
}
