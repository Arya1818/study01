package study01.test02;// 1단부터 9단까지 구구단 작성하기

public class GuGuDan01 {

	public static void main(String[] args) {
		String result = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result += i + "x" + j + "=" + (j * i);
				if (i != 9) {
					result += ",";
				}
			}

		}
		System.out.print(result);
	}
}
