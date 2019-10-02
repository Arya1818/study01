package study01.test06;

public class MethodTest {

	public static void main(String[] args) {
		String str = "123"; //정해져있지않은 데이터타입 메모리 생성 :new사용 //1.처음생김(자바영역에생김)
		String str1 = new String("123");  //2.다른데생김(자바가 만드는공간 내가 만드는 공간 다름)
		String str2 = new String("123");
		
		System.out.println("123"=="123"); //true 자바에 저장되어있음
		System.out.println(str=="123"); // 123위치지정x 자바에 있나?  비교. true
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str1==str2);
		
		System.out.println(str.contentEquals(str1)); //str의 메소드/equals는 값 비교,스트링에 들어가있음.
		//정해져있는데이터타입에서는 equals쓰면됨/ string은 equals로 비교해야함. 값을 비교하는거기때문에
		
		int a = 1;
		System.out.println(a==1);//
	
	}
}
