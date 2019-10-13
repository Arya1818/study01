package study01.test06;

public class ObjectTest {
	int num1; // static으로 바꿔주거나, 위치를 알려주면됨
	int num2;
	String str = "";
	
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();       // class영역에 있는 변수를 사용하게 해줌.
		ot.num1 = 5;
		ot.num2 = 10;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		
		ot = new ObjectTest();                  //다시초기화. 5,10은 없어짐(덮어쓰는거아님)
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		
		ObjectTest ot2 = new ObjectTest();
		System.out.println(ot.str); //""
		System.out.println(ot2.str); //""
		System.out.println(ot.str==ot2.str); //true-같은 주소값을 바라보고있음(java영역)
		
		
	//	ot2.str = new String("")               //false
	//	ot2.str="";                            //true---???
	//	System.out.println(ot.str == ot2.str); //true -----??????
		
	} 
}

//정해져있는 데이터 타입은 값 같으면 같은거!!!!
//정해져있지 않은 데이터 타입
