package study01.test07;

public class OverLoading {

	public String test() { //파라메터 0개
		return "나비";
		//System.out.println("test() 메소드 호출!");			
	}
	public void test(int num) { //파라메터 1개
		System.out.println("test(int num)메소드 호출!");	
	}
	public void test(String str) {  //파라메터 1개 
		System.out.println("test(String) method call!");

	}
	public void test(String str, int num) {  //파라메터 2개 
		System.out.println("test(String str, int num) method call!");
	}
	public void test(int num, String str) { //파라메터 2개 
		System.out.println("test(int num, String str) method call!");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();

		//ol.test(1.1); // double이 없기 때문에 안됨
		System.out.println(ol.test()); // void때문에 안됨 (void라는 데이터타입이 없다.)
		//ol.test(5);
		//ol.test("하하",1);
	}
}	


/*  <오버로딩>
 * 접근제어자, return타입 상관없다.
 * 전제조건>메소드명 같아야 함,파라메터 갯수 달라야함(같더라도~
 * () 안에 들어가는것 :파라메트 
 * 파라메터 갯수가 같더라도 데이터타입이 다르면된다
 * 갯수같고 데이터타입 같아도 위치가 다르면된다
 * println() 메서드는? 안에 들어있는 파라메터가 많음.
 * 데이터 타입이 무엇인지, 어떤 값을 return하는지 
 * 
 */
//계속해서봐야지!!!!!!!!!!!!!