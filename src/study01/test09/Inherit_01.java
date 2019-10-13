package study01.test09;           //상속과 오버라이딩

public class Inherit_01 {

	public String toString() { //object에 toString이 있기 때문에 오류가 안나고 오버라이딩 가능!
		return "아 나는 메모리 주소 찍기 싫다고"; //object를 덮어씌운게 아니라 object가 가지고 있는 toString을 덮어씌운것(오버라이딩)
		//return "Food
	}
	public static void main(String[] args) {
		Inherit i = new Inherit();
		System.out.println(i);
	}
}





/*
 * 1.변수가 private 접근제어자기 때문에 System.out.println(f.name);불가 
 * 2. System.out.println(f.getName()); 귀찮
 * 3. to String 사용
 */