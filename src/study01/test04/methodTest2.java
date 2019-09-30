package study01.test04;

public class methodTest2 { // 어떤 동작을 할 때 메서드 사용

	static void test() { // void 는 뭐야? 정해지지않은 데이터타입인데 왜 소문자? 변수 dt로 쓸수 없음.
		System.out.println(1); // void:아무것도 리턴하지 않겠다
	}

	static int getNum() {
		return 0; // dt가 int인것을 하나 반환해야함.(값이 중요한게 아님)

	}

	public static void main(String[] args) { // 실행라인
		test(); // 위 test()는 자기영역 있으니 선언, 여기는 없으니 호출
		int a = getNum(); // int형 변수에 대입할수 있다. int a = 1 //getNum이 byte라면 대입가능. 물통비유.
		// getNum() = 0 안됨. 정의가 아니라 호출이기 때문에.
	}

}
