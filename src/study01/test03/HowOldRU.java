package study01.test03;

import java.util.Scanner;//ctrl shift o ->Scanner를 위해

public class HowOldRU {
	public static void main(String[] args) { //정해져있지않은 데이터타입:첫글자대문자(스캐너,배열,시스템,스트링
		Scanner scan = new Scanner(System.in); //변수의선언, 변수의초기화 //시스템에 입력객체
		System.out.println("How old are you~?"); //시스템의 출력객체
		String age = scan.nextLine();
		System.out.println("I'm "+age+" years old~");
	}

}

