package review;


final class End{
	final void test() {
		System.out.println("난 End's test 메소드");
	}
}


public class Start extends End{ //클래스가 final 로 정의되어있어서 상속받을 수 x
	static final String STR_EXAM ="ABc"; //어디서도 값을변경할 수 업음. 상수니까 //이 기능을 바꾸게하고싶지 않을 때 
	void test() { //오버라이딩을 못함
		System.out.println("난 Start's test 메소드");
	}
	
	
	public static void main(String[] args) {
		//Start.STR_EXAM ="123";//어디서도 값을변경할 수 업음. 상수니까
		
		
		
		
	}
}


// interface몸통가지는방법
// 1. static
// 2. default
//상수는 메서드, 클래스에 들어갈 수 있음
//final
//메서드>
//클래스> 아예 상속받지 못함
//법은 아니나 막강한 기능을하게 만들어놓은거
//상속에서 final을 어디에 씀으로서 