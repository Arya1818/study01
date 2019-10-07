package study01.test08;

class Father {
	int a;
	Father(){
		System.out.println("1.난 아빠클래스의 생성자임!");
	}
}

public class Constructor extends Father {  //(문법)public 쓰는 이유: 이 파일이 대표라는걸 알려줘야함. 클래스명과 같은 곳에 public 옵션으로~
	int b = 10;
	//Father() -->오버라이딩 불가능(애초에 성립조건이 안됨)
	Constructor(){
		System.out.println(a); //아빠꺼를 먼저 읽기 때문에 가능
		System.out.println("2.난 생성자 클래스의 생성자임!");
	}
	
	public static void main(String[] args) {
		//Father f = new Father(); // --->에러가 나지 않는 이유는 Father class의 기본 생성자가 존재함 (보이지는않지만)
		Constructor c = new Constructor();// ---->위와같음
			//데이터타입이 Constructor임 -> Constructor라고 부를수 있는 것들만 들어갈수있음
		
	}
}

//생성자조건
//클래스이름과같아야한다
//return타입이 없다(생략)
//return타입 없는거 제외하고는 메서드와 상당히 비슷하다.
//

//오버로딩,오버라이딩 객관식  -> 답은 많을수도 적을수도 있다
//같은영역에서 일어나냐? 상속 관계에서 일어나냐? 를 먼저 따지기 (오버로딩,오버라이딩차이)
