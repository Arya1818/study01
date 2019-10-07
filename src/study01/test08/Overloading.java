package study01.test08;

public class Overloading {

	public void a() {
		
	}
	public int a(int a) {
		return 1;
		
	}
	public void a(int a, String s) {
		
	}
	public void a(String a) {
		
	}
	public void a(String s,int a) {
		
	}
}


//<오버로딩 전제조건>
//1.같은 영역 같은 메서드명
//2.파라미터 갯수 또는 타입이 달라야한다.
//3.갯수, 타입 같아도 위치가 다르면 된다
//4.갯수 같더라도 데이터타입 다르면된다

//오버로딩----> System.out.println을 생각하면 쉽다