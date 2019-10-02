package study01.test07;

class Cat {
	private int age; // private 나한테 직접 값을 바꿀 생각 하지마!
	private String name; // 문법적으로 애매한것들. 원인을 알려줌.
	private String type;

	public void setAge(int age) { // set은 주입이니까 return값 필요없으니 void.
		this.age = age; // 위에 있는 age를 쓰고 싶을 때 this 사용.
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}

public class Access {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("체리");
		c.setType("페르시안");
		//int age = c.getAge();
		
		System.out.println("고양이의 나이는 "+c.getAge()); 
		System.out.println("고양이의 이름은 "+c.getName()); 
		System.out.println("고양이의 종류는 "+c.getType()); 
	}
	
}



/* set주입(대입) get가져옴 => getset메서드 
 * 변수는 무조건 private로 선언한다.
 * 호출하는 메소드는 public으로 선언한다.
 * getAge() setAge()
 * set메서드에는 절대로 로직을 집어넣지 않는다.
 * 자바에서는 생성자, 소멸자 중 생성자만 알면됨.
 * 
 * 접근제어자 
 * 메소드의 dt - void/void x
 * 메소드의 선언과 호출
 * 메소드 이름만 가지고 구분하지 않는다. 
 * 
 */
 