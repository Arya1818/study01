package review2;

class Mother {
	int a = 3;

	Mother() {
		System.out.println("엄마1");
	}

	Mother(int a) {
		System.out.println("엄마2");
	}

}

public class MethodTest extends Mother {
	int a = 123;

	MethodTest(int a) { // super();
		System.out.println("난실행되겠지");
	}

	public void sleep() {
		System.out.println("아들이 밥을 먹는다");
	}

	public static void main(String[] args) {
		Mother m = new MethodTest(5);
		if (m instanceof MethodTest) {
			MethodTest mt = (MethodTest) m;
			mt.sleep();
		}

	}
}
