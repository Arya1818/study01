package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		Random r = new Random();
		
		for(int i=0; i<=10; i++) {
			strList.add(r.nextInt(100)+"."+r.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
			
		}
		System.out.println(doubleList);
		//System.out.println(strList.get(0) + strList.get(1)); 
		//System.out.println(doubleList.get(0) + doubleList.get(1)); 
				
	}
	
	
}			

//for문으 0-9까지 돌린다
//랜덤 숫자를 두개 돌린다 0-99 0-9
//첫번재 변수 + . +두번재 변수 =>string
//ArrayList string에 하나씩 짚어넣기

//Integer는 메모리 생성 안해도 parseInt를쓸수있다 =>parseInt는 static