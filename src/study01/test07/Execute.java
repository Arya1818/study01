package study01.test07;

class Calc {                  //접근제어자default
	int num1;
	int num2;

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

public class Execute {
	public static void main(String[] args) {
		Calc calc = new Calc(); //넘1 넘2가 Calc안에 있으니 알려주는것임
		calc.num1 = 5;
		calc.num2 = 2;
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
		
	}
}

/*
5/2 2는 제수. 제수는 0이 될 수 없음.
코드의 재사용!!
*/