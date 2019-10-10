package study01.test10;

public class Father{
	public void test() {
		System.out.println("난 아빠 클래스의 테스트");
	}
}

public class Son extends Father{
	public void test() {
		System.out.println("난 아들 클래스의 테스트");
	}
	public void sonsTest() {
		System.out.println("난 아빠 테스트");
	}
	public static void main(String[] args) {
		Father s = new Son();
		
		Son s2 = (Son)s;
		s2.sonsTest();
		
		Father f = new Father();
		if(f instanceof Son) {          //true가나와야 캐스팅을 할수있음.
			s2 = (Son)f;
			s2.sonsTest();
		}
	}
}


