package practice01;

class Dog2 {
	public Dog2() {
		System.out.println("강아지!");
	}
}

public class Siberian extends Dog2 {
	public Siberian() {
		System.out.println("시베리안!");
	}

	public static void main(String[] args) {
	//	Dog2 sibe = new Siberian();
		Siberian sibe = new Siberian();
	}
}
