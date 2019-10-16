package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
	
	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>(); 
		map.put("보물1호","컴퓨터");
		map.put("보물2호","컴퓨터"); //위와 같은 '컴퓨터'를 바라봄
		map.put("해야할일","운동"); //맵 사이즈 3, 순서모름
		Iterator<String> it = map.keySet().iterator(); //iterator라는 메서드. 주인은 keyset메서드. 주인은 map.//
//		Set<String> keySet = map.keySet();
//		Iterator<String> it = keySet.iterator();
//		map.keySet을 대입할수있는 이유는 데이터타입ㅇset이고 retr
//		map.keySet이 keySet이 돼. keySet이 keySet.iterator가 돼. 그럼 map.keySet 
//		String str = "123";
//		System.out.println(str); -> System.out.println("123") 됨
		
		
		while(it.hasNext()) {    //다음꺼가지고있어? {}안에 내용 없으면 계속 물어만 보는 것임. //for문과 쪼금 다르다.
//			it.next(); //한명을 빼온다 //세번 돌고 true가 나옴.
			String key = it.next();
//			System.out.println(key); 
			System.out.println(
					"key:" + key);
			String value = map.get(key);
			System.out.println("value:" + value);
		
		
		}
	//	System.out.println(map.get("보물1호")==map.get("보물2호"));  //true. 같은 주소를 바라봄.
}
}


/*리스트 : 순서가 중요 , 값 마음대로 출력 가능 (0부터~) / linkedlist는 내위치는 모르지만 앞 뒤에 누가있는진 안다
 * 맵 : 키가 중요 순서가 없음, 키값 밸류값 연결만 되어있음. index라고 불리는 키가 뭘로 불리는지(데이터타입) 보장 못함. 그러나 누가 있는지는 알아야한다. 몇개있는지가 중요한게 아니고 뭐가있는지가 중요핟,.
 * 어레이리스트에서 인덱스가 중요 맵에서는 키가 중요!
 * 키에대한 어떤 패턴을 통해서 전체적으로 훑어봄--> iterator를 돌린다. 
 * 
 * is/has붙는건 return값이 boolean이다.
 * 
 * println() 은 리턴타입 void. "."붙여서 대입할수없음. 자바에서 보이드를 쓸수있는 영역 메서드밖에없음. 
 * 메서드에 데이터타입이 없으면 어떻게 . 을 쓸수있나?
 */