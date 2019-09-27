package study01.test02;

public class Var1 {
	public static void main(String[] args) {
		int num1 = 1;//변수의 선언 - 데이터타입 int 변수명 num이다. & 변수의초기화
		if(num1==1) {
			int num2 = 10;
			System.out.println("num1은");
			System.out.println("2입니다");
			System.out.println(num2);
		}
		for(;num1<10;num1=num1+1) {
			System.out.println(num1);
		}
		System.out.println(num1);
	}
}
