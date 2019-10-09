package practice01;

public class Access04 {

	int num = 5;

	public void cons() {
			System.out.println(num);
			System.out.println("I'm called.");
		}

	public void cons(int num) {
			System.out.println("Oh well, I'm called as well.");
		}

	public static void main(String[] args) {
		Access04 c = new Access04();
		c.cons();
		c.cons(3);
		System.out.println(c.num);
	}
}
