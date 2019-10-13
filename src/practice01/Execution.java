package practice01;

class Calc03 {
	int num1 = 3;
	int num2;

	public void add() {
		System.out.println(num1 + num2);
	}
}

public class Execution {
	public static void main(String[] args) {
		
		Calc03[] calcs = new Calc03[3];
		
		System.out.println(calcs[2]);
			
//			calcs[2] = new Calc03();
//			System.out.println(calcs[2]);
//			calcs[2].add();

//			calcs[0].add();
	}
}