package study01.test07; //이거 호출하는 방법 뭐야!!!

public class Cons {
	int num = 5;
	
	
	public Cons() {
		System.out.println(num);
		System.out.println("아 내가 호출되었구나!");
	}
	public Cons(int num) {
		System.out.println("아 num파라메터가 나를 호출하였구나~!"); 
	}	
	
	public void add() {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		Cons c = new Cons();  //  메모리만듦, 변수초기화까지해줌
		
		c.add();////내가추가해줌
		
		System.out.println(c.num);
	
	}
}


/* 생성자의 존재조건
 * 반드시 클래스명과 동일해야한다.
 * return값 없다. -> void쓸 필요 없음.
 * 
 * Scanner은 System.in을 넣어야 사용할 수 있도록 설계.
 * 
 * main메소드 안 - 제일 먼저 시작 
 * 
 * 데이터베이스 접속하는 정보를 받아들여야할 때 생성자 사용
*/