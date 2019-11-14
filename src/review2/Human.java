package review2; //static과 아닌것 차이 정확히 알기

public class Human { //db주소,아이디,비번 처럼 하나만 바라보는 것 만들때
	private String name;
	private static int num;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		Human h1 = new Human();
		h.setName("홍길동");
		h1.setName("홍길랑");
		h.num = 10;
		h1.num = 20;
		Human.num = 30;
		System.out.println(h.num==h1.num); //true

	}

}
