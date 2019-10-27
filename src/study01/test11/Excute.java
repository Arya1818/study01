package study01.test11;

public class Excute {

	public static void main(String[] args) {
		Remote r = new TvRemocon();
		r.on();
		
		Remote r2 = new AirconRemocon();
		r2.on();
		
	}
}

//remote는 메모리 생성이 안된다 왜? 인터페이스니까 
//데이터 타입으로는 사용 가능

//TvRemocon과 AirconRemocon이 remote를 구현하고(상속) 있기 때문에 메모리를 생성가능