package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Execute01 {

		public static void main(String[] args) {
			Person p = new Person();
			p.setName("박도영");
			p.setAge(24);
			p.setAddr("안양");
//			p.setTrans("여"); //클래스에서 뭔가를 추가했지만 map은 그럴 필요 없음. 
			System.out.println(p);
			HashMap<String,String> p2 = new HashMap<String,String>(); 
				//정해져있지않은 데이터타입이니까 List에 넣을 수 있음
			p2.put("name","도영");
			p2.put("name","지혜");
			p2.put("age","24");
			p2.put("addr","안양");
			p2.put("trans","여");
			System.out.println(p2);
			
			List<HashMap<String,String>> p2List = new ArrayList<HashMap<String,String>>();
			p2List.add(p2);
			p2List.add(p2);
			System.out.println(p2List);
		}
	}

