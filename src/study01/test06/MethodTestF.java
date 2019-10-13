package study01.test06;

public class MethodTestF {

	public static void main(String[] args) {
		String str = "1234567";
		int idx = str.indexOf("12");
		int idx2 = str.indexOf("234"); // indexOf 데이터타입이int니까 int에 대입 가능한 것
		System.out.println("str의 " + idx + " index자리에 있네요");
		System.out.println("str의 " + idx2 + " index자리에 있네요");

		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(","); // 메소드의 호출, 데이터타입:스트링배열
		for (int i = 0; i < strs.length; i++) {
			System.out.println("이름:" + strs[i]);
			//System.out.println(strs.length);

		}
	}
}

//index 정말많이쓰임

//콤마(,)를 기준으로 잡으면 애매해짐. 콤마 너무 많이써서.