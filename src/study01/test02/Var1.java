package study01.test02;

public class Var1 {
	public static void main(String[] args) {
		
		int num1 = 1;
		
		if(num1==1) {
			int num2 = 10;
			System.out.println("num1은");           // num1은
			System.out.println("1입니다");			// 1입니다					
			System.out.println(num2);               // 10
		}
		for(; num1<10; num1=num1+1) {
			System.out.println(num1);				// 1,2,3,4,5,6,7,8,9
		}
		System.out.println(num1);					// 	10 - for문 마지막에 num1값에 10이 저장됨
	}
}
