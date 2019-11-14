package practice01;

public class testtest {
	
	int num = 3;
	public void cons() {
		System.out.println(num);
		System.out.println("나 불렸어.");
	}
	public void cons(int num) {
		System.out.println("나도 불렸어");
	}
	public static void main(String[] args) {
		testtest t = new testtest();
		t.cons();
		t.cons(5);
		System.out.println(t.num);
		
	}
}
