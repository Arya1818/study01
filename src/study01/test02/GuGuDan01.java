package study01.test02;// 1단부터 9단까지 구구단 작성하기

public class GuGuDan01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(1 + "x" + i + "=" + 1 * i);
			if(i!=9) {
				System.out.print(",");
			}
		}
	}
}
