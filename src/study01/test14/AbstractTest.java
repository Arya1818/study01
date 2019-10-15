package study01.test14;

class Son extends AbstractTest { //추상클래스의 추상메서드를 선언

	public void test() {
		System.out.println("test");
	}
}	
public abstract class AbstractTest{
	
	public abstract void test(); // 몸통을 가져야하는 이유? 
	
	public static void main(String[] args) {
	//	AbstractTest at = new AbstractTest(); //안됨, interface와 같은 이유로...
		AbstractTest at = new Son();
		at.test();
	}
}


// interface에 몸통 없어도 되는 이유? interface에 new르 할수 없어서 애초에 메모리에 올릴수가 없으니 할 필요가 없음. 
// new를 했을 때 정의를 기억함 (어딘가에 저장을 할 수있따는 뜻)
// 