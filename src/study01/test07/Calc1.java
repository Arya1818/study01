package study01.test07;

public class Calc1 { // class명 앞에 public은 자바 파일명과 같을 때 쓸 수 있다.
	private int num1;
	private int num2;     

	Calc1 (int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void add() {
		System.out.println(num1 + num2);
	}

	public void minus() {
		System.out.println(num1 - num2);
	}

	public void multiple() {
		System.out.println(num1 * num2);
	}

	public void division() {
		System.out.println(num1 / num2);
	}
}

class Execute1 { // Execute가 이미 다른 파일의 이름이므로 Execute1로 바꿔줌
	public static void main(String[] args) {
		
		Calc1 calc = new Calc1(4,2);
		calc.add();
		calc.minus();
		calc.division();
		calc.multiple();
	
	}

}

/* 같은 패키지 내에서는 public 생략 가능
 */