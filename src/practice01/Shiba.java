package practice01;

class Cat {
	public void sleep() {
		System.out.println("개가 잠을 잡니다.");
	}
}

public class Shiba extends Cat {
	public void eat() {
		System.out.println("Shiba가 밥을 먹습니다.");
	}
	public void sleep() {
		System.out.println("Shiba가 잠을 잡니다.");
	}

	public static void main(String[] args) {
		Shiba s = new Shiba();
//		Dog d = new Shiba();
		s.sleep();
//		d.sleep();
	}

}

//Shiba는 Shiba,dog,object라는 이름으로 불릴수 있음
//
