package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
}
public class Koshort extends Cat {                //koshort은 koshort,Cat,Object 3가지의 이름으로 불릴수있음
	public void sleep() {
		System.out.println("코숏 고양이가 잡니다.");  
	}
	public static void main(String[] args) {
		Koshort ks = new Koshort(); 
		Cat c = new Koshort();
		Object ob = new Koshort();
		
		
		ks.sleep();
		c.sleep(); //코숏 고양이가 잡니다.
	//	ob.sleep();
		
		
		
		Cat[] cats = new Cat[4]; //데이터타입이 Cat배열
		cats[0] = new Cat(); //---------->가능 0번째방의 데이터타입은 cat ->cat이라고 불리는 것들 다 들어갈수있음.
		cats[1] = new Koshort(); 
		cats[0].sleep();  // cats[0]에 뭐가 들어갔는지가 중요. new Cat(); !!  //고양이가잡니다.
		cats[1].sleep();                                             //코숏고양이가잡니다.
	}
}



//기능적으로 자식이 더 큼. 메소드 갯수가 똑같더라도 자식은 아빠꺼를 상속받아서 더 할 수 있기 때문에.
//노트 참조!