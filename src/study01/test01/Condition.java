package study01.test01;

public class Condition {

	public static void main(String[] args) {
		int num =3;
		if (num == 1) {
			System.out.println("1입니다.");

		} else if (num == 2) {
			System.out.println("2입니다.");
		} else {
			System.out.println("1도 2도 아닙니다.");
		}

		System.out.println("끝");

		String trans = "나비";
		
		if (trans == "나비") {
			System.out.println("나비입니다.");
		} else if (trans == "호랑이") {
			System.out.println("호랑이입니다.");
		}
	}
}
