package study01.test14; //for문 돌려서 여러개 넣기

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest01 {
	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String,String>(); //행
			//정해져있지않은 데이터타입이니까 List에 넣을 수 있음(정해지지않은 데이터타입은 맵안에 리스트 리스트안에 머머 다가능) 
		map.put("이름","홍길동");
		map.put("나이","24");
//		System.out.println(map);  //{이름=홍길동, 나이=24}
		
		List<HashMap<String,String>> mapList
			= new ArrayList<HashMap<String,String>>(); //hashmap으로 이뤄진 리스트 (키 밸류 가지고있는) //테이블
		mapList.add(map);
		map.put("성별","남자"); //[{이름=홍길동, 나이=24, 성별=남자}]
//		map.remove("나이");    //[{이름=홍길동, 성별=남자}]
		System.out.println(mapList);
		
//		HashMap<String,List<HashMap<String,String>>> totalMap;  //sheet
		
	}
}

//List [] , map{}
//new arrayList라고 하는 이유?
//리스트라고 부를 수 있는 조건을 만족했기 때문에)(?)