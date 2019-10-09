package practice01;

public class MethodTest2 {

	static void test() {
		System.out.println(1);
	}

	static int getNum() {

		return 0;

	}

	public static void main(String[] args) {
		// test();
		int a = getNum();  //getNum의 반환값이 int니까 int 형 변수에 대입할수 있다!!★
		// System.out.println(getNum());
	}

}
