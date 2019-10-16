package study01.test15;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
//		List<String> strList =  new ArrayList<String>();
//		//new List안한이유? 인터페이스로 호출 못하기 때문, 오른쪽을 왼쪽으로 부를수 있는 이유는 상속을 받았거나 구현을 했기때문(여기서는 implements)
//		strList.add("a"); //꺼낼땐 순서만 알면 됨. 시작값은fix 0 
//		strList.add("b");
//		strList.add("c");
//		for(int i=0; i<strList.size();i++) {
//			System.out.println(strList.get(i));
		Map<String,String> map = new HashMap<String,String>();  
		map.put("보물1호","컴퓨터");
		map.put("보물2호","컴퓨터"); //위와 같은 '컴퓨터'를 바라봄
		map.put("해야할일","운동"); //맵 사이즈 3, 순서모름

//		for(int i=0; i< map.size();i++) {
//			System.out.println(map.get(i)); //index 데이터타입이 string인데 get(i)는 int라서.. //null, null, null
//		}
//		System.out.println(map);
//		System.out.println(map.get("보물1호")==map.get("보물2호"));  //true. 같은 주소를 바라봄.
}
}




/*리스트 : 순서가 중요 , 값 마음대로 출력 가능 (0부터~)/linkedlist는 내위치는 모르지만 앞 뒤에 누가있는진 안다
 * 맵 : 키가 중요 순서가 없음, 키값 밸류값 연결만 되어있음. index라고 불리는 키가 뭘로 불리는지(데이터타입) 보장 못함. 그러나 누가 있는지는 알아야한다. 
 * 어레이리스트에서 인덱스가 중요 맵에서는 키가 중요!
 * 키에대한 어떤 패턴을 통해서 전체적으로 훑어봄 iterator
 */

