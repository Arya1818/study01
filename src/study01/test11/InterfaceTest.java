package study01.test11;

interface Promise{
	public void test(); //인터페이스는 선언만 가능, 자기 영역을 가질 수 없다. //default라고 선언하지 않으면 default아니고 public이다.
	void test1();

}

public class InterfaceTest  implements Promise{
	
	public void test() {
		//아무것도 안해도 overriding 해 줘야 한다. (설계도에 구현하라고 나와있기 때문에)
	}
	
	protected void test1() { 
	}
}



//상속 개념이 아니라 implements

// 인터페이스 안의 모든 접근 제어자가 public 아니면 안된다.
// 상속이나 구현을 했을 때 거의 대부분 public이긴 함
// 하지만 아빠께 protected 인데 나는 default야 그럼 안돼


//return 타입, 옵러
	