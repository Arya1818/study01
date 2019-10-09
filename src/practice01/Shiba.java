package practice01;

class Dog {
	public void sleep() {
		System.out.println("개가 잠을 잡니다.");
	}
}

public class Shiba extends Dog {
	public void eat() {
		System.out.println("Shiba가 밥을 먹습니다.");
	}

	public static void main(String[] args) {
		Shiba s = new Shiba();
		s.sleep();
	}

}

//Shiba는 Shiba,dog,object라는 이름으로 불릴수 있음
//
