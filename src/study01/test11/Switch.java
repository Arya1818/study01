package study01.test11;

public class Switch {
	public static void main(String[] args) {
		
		int age = 20;
		switch(age) {
		case 10:
			System.out.println("10살이하");
			break;
		case 20:
			System.out.println("20살이하");
			break;
		case 30:
			System.out.println("30살이하");
			break;
		default:
			System.out.println("31살이상");	
			break;
		}
	}
}

//중간에 만족하면 그 뒤로 다 실행됨.
