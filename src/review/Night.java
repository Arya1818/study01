package review;

class Test3 {

	public final static String STR = "123";
	static {
		System.out.println("나나나");
	}
}

public class Night {

	public static void main(String[] args) {
		System.out.println(Test3.STR);
	}
}
