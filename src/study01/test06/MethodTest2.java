package study01.test06;

public class MethodTest2 {
	int num;
	
	int getNum() { //getNum()은return값이 필요함/ 괄호친 부분은 선언만 됨
		System.out.println(num);
		int num = 3;
		System.out.println(num);
		System.out.println(this.num);
		return 1;
	}
	public static void main(String[] args) {
		MethodTest2 mt2 = new MethodTest2(); //int를 0으로 초기화 시힘(자바가)
		mt2.getNum();
	}
}




//num이 선언된 위치와 getNum()이 선언된 위치가 같음. 


/*
1.모든 변수와 메소드는 독고다이로 존재할 수 없다.
반드시 어떤 영역안에 들어가야 한다.
2. 메서드는 클래스 바로 밑 영역에서만 선언 가능하다.(메소드안메소드 x)
3. 변수는 클래스 안에서 선언해도 되고 메서드 안에서 선언해도 된다. 
	(클래스 안에만 있다면 어디서든 선언 가능)
*/