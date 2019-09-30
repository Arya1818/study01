package study01.test04;

public class MethodTest { // public은 옵션
	static int num = 1; // static 있어야 함

	static int num() { // 메서드명:num (변수와 메서드명은 다름-역할이 다르기때문에) 6~8라인 메서드의 선언
		return 1;
	}

	public static void main(String[] args) { // main():메서드
		System.out.println(num);

	}

}
