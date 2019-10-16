package study01.test09;

class ObjectTest2{
	static int num2 = 2;
}	

public class ObjectTest {
	int num1;
	//static String num1; //이딴거안됨
	static int num2; //<-0을 넣어줌
	
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();    //자바가 ObjectTest를 읽게하는 방법 (유일한방법) 
		ot.num1 = 10;
		System.out.println(ot.num1);//10
		
		System.out.println(ObjectTest2.num2);//2
		ObjectTest.num2=3;
		System.out.println(ObjectTest2.num2); //ObjectTest2생략가능, 당연히 ObjectTest의 클래스라서 =>하지만 정식대로 써야함
	}

}




/* static
 *  삐딱한애들 out, in 
 *  out.println 은 왜 안되냐? System의 out이기 때문에.
 *  접근제어자와 상관없음
 * 
 * 자바는 초기화 하지 않으면 변수 출력 못한다.
 * static은 먼저 초기화시켜버림
 */
//어려워!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!