package study01.test05;

class Father {
	void work() {
		System.out.println("아버지가 일을 하십니다.");
	}
}

public class Son extends Father {
	void work() {
		System.out.println("나도 일을 한다!"); //오버라이딩-아빠꺼 그대로 두고 아들을 올림
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
