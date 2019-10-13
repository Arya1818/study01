package practice01;

public class MethodTest2 {

	static void test() {
		System.out.println("나비");
	}

	static int getNum() {
		return 5;

	}

	public static void main(String[] args) {

		getNum();
		test();
		
		
	//	 getNum(); //아무 값도 입력되지 않음
		 int a = getNum(); //getNum의 반환값이 int니까 int 형 변수에 대입할수 있다!!★
	//	 System.out.println(getNum());
	}

}
