package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Study {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<Double> dl = new ArrayList<Double>();
		
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int rNum = r.nextInt(100);
			int fNum = r.nextInt(10);
			al.add(rNum+"."+fNum);
			dl.add(Double.parseDouble(al.get(i)));
		}

		System.out.println(dl);
		System.out.println(dl.get(0)+dl.get(1));

	}
}





//for문으 0-9까지 돌린다
//랜덤 숫자를 두개 돌린다 0-99 0-9
//첫번재 변수 + . +두번재 변수 =>string
//ArrayList string에 하나씩 집어넣기

//Integer는 메모리 생성 안해도 parseInt를쓸수있다 =>parseInt는 static