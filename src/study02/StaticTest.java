package study02;

public class StaticTest {
	final static int a; //final로 지정한건 값을 안바꾸겠다는 의미라서 
	static {			//여기서는 대입하고 하는 작업 못하니까 이런 방법으로 값을 바꿔줌. //다른클래스에 있어도 자바한테 로드만 알려주면 읽음. 
		a = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticTest.a); 
		
	}
}

//int a , main a 모두 static. 메인 실행전 자바 메모리에 올라가있기때문.
//free loading lazy loading