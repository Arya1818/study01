package study01.test07;

class Mother {
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라.");
	}
}
public class Son extends Mother { 
	
	public void cook(int a) {  
		System.out.println("물밥 지겹다.라면을 끓여 먹겠다.");
	}
	
	public static void main(String[] args) {       
		Son s = new Son(); //2.생성자의호출-에러안나는이유:자바가 public Son(){} 만들기때문-기본생성자
		s.cook();
		s.cook(1);
		//s.cook("123"); //1.메소드의호출
		
	}
}


/* Son(); Scanner(); -> 대문자 ->
 * 함수 아니고 생성자구나
 * 
 * 
 * */