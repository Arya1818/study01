package study01.test10;

class Dog {
	public void sleep() {
		System.out.println("개가 잠을 잡니다.");
	}
}

public class Pug extends Dog{ //pug는 pug,dog,object라는 이름으로 불릴수 있음
	public void sleep() {
		System.out.println("퍼그가 잠을 잡니다.");
	}
	public static void main(String[] args) {
		Pug p = new Pug();
		p.sleep();
	}
	
}