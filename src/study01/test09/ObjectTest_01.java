package study01.test09;

public class ObjectTest_01 {
	int num1;                     //자바가 main실행전에 먼저 읽음
	static int num2;             //
	
	public static void main(String[] agrs) {

		ObjectTest ot = new ObjectTest();
		ot.num2 = 10;
		ot = new ObjectTest();
		System.out.println(ot.num2);      //10
		
		String str1 = "1" ;
		String str2 = new String("1");    //false
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}
}

//클래스변수 - 클래스 영역에있고 static인거       - main실행전읽음/클래스가메모리에올라갈때생성됨
//인스턴스변수 - 클래스 영역에 있고 static 아닌거 - main실행전읽음/인스턴스가생성됐을때 생성됨
//지역변수 - 클래스영역x , 변수 선언문에 수행됐을대 생성됨