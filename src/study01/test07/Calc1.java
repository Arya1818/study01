package study01.test07;

public class Calc1 { // class명 앞에 public은 자바 파일명과 같을 때 쓸 수 있다.
//	private int num1;
//	private int num2;     
//
//	Calc1 (int num1, int num2){
//		this.num1=num1;
//		this.num2=num2;
	
	public int num1;
	public int num2;
	
	Calc1(){          //생략된거 내가 추가해준것
		
	}
	
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void multiple(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}

class Execute1 { // Execute가 이미 다른 파일의 이름이므로 Execute1로 바꿔줌
	public static void main(String[] args) {
		
		Calc1 calc = new Calc1();
		calc.add(2,4);
	//	calc.minus();
	//	calc.division();
	//	calc.multiple();
	
	}

}

/* 같은 패키지 내에서는 public 생략 가능
 */