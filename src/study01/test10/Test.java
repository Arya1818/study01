package study01.test10;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random ran = new Random();
		//ran.nextInt(100); 
		int fNum = ran.nextInt(100); //int형 변수에 집어넣을 수 있다
		int sNum = ran.nextInt(10);
		
		System.out.println(fNum);
		System.out.println(sNum);
		
		String str = fNum+"."+sNum;
		System.out.println(str);
		
//		System.out.println(str + 1);
		
		double db = Double.parseDouble(str);
		System.out.println(db + 1);
		
	}
}

//자바에서는 +연산자만 두 가지 일을 한다 1 더하기 2 연결

/* 첫번째 수는 비교할 대상이 없다. pass
 * 두번째 수는 첫번재 수와 비교한다. 작으면  첫 번째에 저장.
 * 세번째 수는 두번째 수, 첫번째 수와 차례로 비교. 작으면 첫번째 수 아래에 저장. 크면 pass.
 * ...(마지막 숫자까지 비교한다.)
 * 
 * "숫자 n과 n-1,n-2.. 숫자들과 순차적으로 하나하나 비교하면서 더 작은 수를 맨 앞으로 옮긴다."
 * 결과> 작은 숫자들 부터 정렬이 된다. descending
 */

