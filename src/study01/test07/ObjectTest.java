package study01.test07;

public class ObjectTest { //클래스 명이랑 같을때 에러가 안남, public은 옵션

	int a; //맴버변수, 죽지않음
	
	public void test() {
		int a=1;                //영역이 끝나버리면 죽음
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a); //여기서죽음
	}
	public void test2() {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest(); //메소드인가?
		ot.test();
		ot.test2();
	}
}


/* 자바 파일 만들 때 대소문자 꼭 같게 해줘야함. 자바가 알아서 하긴 함. 
 * 멤버변수 - 클래스 영역 안에 있으나 다른 영역에는 포함되지 않는것 */