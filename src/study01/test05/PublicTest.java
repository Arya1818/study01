package study01.test05;

import study01.test04.PrivateTest; //ctrl shift o

public class PublicTest {
	
	public int num;
	
	public static void main(String[] args) {
		PublicTest publicTest = new PublicTest();
		System.out.println(publicTest.num);
		PrivateTest publicTest2 = new PrivateTest();
		System.out.println(publicTest2.num); //오류 -private를  public int num;로 바꾸니 안남
	}
}
