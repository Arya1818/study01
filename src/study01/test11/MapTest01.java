package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest01 {

	public static void main(String[] args) {
		HashMap<String,String> human = new HashMap<String,String>(); //<key,value> //human의 데이터타입은 HashMap<String,String>
		human.put("이름","홍길동");
		human.put("나이","33");

		
		List<HashMap<String,String>> people = new ArrayList<HashMap<String,String>>();  // 위와 데이터타입이 같음
		
		people.add(human);
		people.add(human); 
		System.out.println(people);
		people.get(1).put("이름","김길동");  //[{이름=김길동}, {이름=김길동}]
	//	human.put("이름","임꺽정");  //[{이름=임꺽정}, {이름=임꺽정}]
		human = new HashMap<String,String>();
		System.out.println(human); //새로운 인스턴스를 바라본다.
		System.out.println(people); //[{이름=홍길동, 주소=서울 강서구, 나이=33, 성별=남자}]
		System.out.println(people.get(0)); //0번째 방은 어디를 바라보냐? 

		
	}
}


