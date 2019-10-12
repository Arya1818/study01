package study01.test10;

import java.util.ArrayList;

public class IntegerList {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); //
		al.add(10);
		al.add(20);
		al.add(30);
//		System.out.println(al); 	// [10, 20, 30]
		
		for(int i=0; i<al.size(); i++ ) {
			System.out.println(al.get(i));
			
		}
	}
}

/* add : 방을 더한다
 * 구성원은 Integer만 가능
 * ArrayList<> al = new ArrayList<>(); 하면 모든 object가 들어갈수있게됨
 * 객체지향 언어는 무언가를 가져올 때 get이 붙는다/ get가져온다 set셋팅한다.
 * 
 * 
 */
