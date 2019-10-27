package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> human = new HashMap<String,String>(); //<key,value> //human의 데이터타입은 HashMap<String,String>
		human.put("이름","홍길동");
		human.put("나이","33");
		human.put("주소","서울 강서구");
		human.put("성별","남자");
	//	map.put("성별", "여자"); //같은 키면 중복이 안된다. 
	
		
		System.out.println(human);
		
		List<HashMap<String,String>> people = new ArrayList<HashMap<String,String>>();  // 위와 데이터타입이 같음
		
		people.add(human);
		people.add(human); //add할 때마다 나온다. 그래서 같은 값으로 2개가 나온다. //[{이름=홍길동, 주소=서울 강서구, 나이=33, 성별=남자}, {이름=홍길동, 주소=서울 강서구, 나이=33, 성별=남자}]
		
		System.out.println(human.get("이름"));
	//	System.out.println(human); //{이름=홍길동, 주소=서울 강서구, 나이=33, 성별=남자}
		System.out.println(people); //[{이름=홍길동, 주소=서울 강서구, 나이=33, 성별=남자}]
		System.out.println(people.get(0));
	}
}



/*hash map, linked hash map
 * list는 구성원이 단일 ->값으로만 구분
 * Map은 key 값으로 구분
 * 정확한 값을 주려고 map을 사용(이 주소는 이름이야, 이 주소는 나이야 !!
 * 
 * 
 */
