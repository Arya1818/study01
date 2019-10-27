package review;

import java.util.ArrayList;
//import java.util.Random;

public class StringArray {

		public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("홍길동");
		strList.add("임꺽정");
		strList.add("김문수");
		
		System.out.println("==우리반 출석부==");
		for(int i=0; i<strList.size(); i++) {
			System.out.println((i)+"."+strList.get(i));
		}
		System.out.println("박문수는"+strList.indexOf("박문수")+"번째 있어요~");
		System.out.println(strList);
		
		
		
		ArrayList<Integer> numList = new ArrayList<Integer>(); //ArrayList는 Integer만 담을수있어요
		numList.add(1);
		numList.add(2);
		//numList.add(3.3); //에러남, <Integer>대신 object로 해도 되지만 그럼 다 갖다넣을수있다. 
		System.out.println(numList);
	}
}



/* ArrayList<String>
 * 사이즈가 늘어나거나 삭제됨
 * ArrayList가 어딨는지 몰라서에러 ctrl shift o  
 * String만 담을 수 있는 <>에는 Arraylist의구조가 들어감 element.
 * Arraylist라고 부르는것들만 집어넣을수있다.---><String> 스트링어레이리스트라고 부르는것들만 집어넣을수있다.
 *  정해지지않은 데이터타입이라 new
 *  엄청 많이 씀!!!!
 *  
 * 배열의 단점을 보완하고자 arrayList를 압도적으로 많이 쓴다. 이러나 저러나 기반은 배열이다. 
 * 
 * 
 * 문자열에 담고있는 리스트에서 내가 원하는게 몇번째에 있는지 알고싶을 때
 * int a = 1;
 * Integer i = new Integer(1);   //Wrap - int long double 정도만 많이 씀
 * 	
 */













