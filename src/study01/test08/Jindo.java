package study01.test08;

class Animal{

}
class Dog extends Animal{
	public void test() {
		System.out.println("난 도그의 테스트 메소드야!");
	}
}
public class Jindo extends Dog{
	int i;
	public void test() {
		System.out.println("난 진도의 테스트 메소드야!");
	}
	
	public static void main(String[] args) {
		Jindo j = new Jindo();
		Dog d = new Jindo();
		//Animal a = new Jindo();
		
		j.test();
		d.test();
		//a.test(); //자식은 할아버지를 아는데 할아버지는 자식을 모름 
		

		
	}
}



//자바 파일은 jindo 인데 public은 dog에 붙어있음 -> 클래스명과 같은 곳에 public 붙일 수 있다.
//new jindo new dog 다 가능
//Animal도 Object의 상속을 받고 있는 것이다(자바가 알아서 다 해줌, 눈에 보이지 않음) - 아무것도 상속받지 않아 보이는 클래스도 object의 상속을 받는다!!
//Jindo클래스는 4가지의 이름으로 불리울 수 있다. Dog 클래스는 3가지 이름으로, Animal은 2가지 이름으로.
//반대로 불릴 수 없다.



//자바는 한 클래스에 두가지 클래스를 상속받을 수 없다. 무조건단일상속!