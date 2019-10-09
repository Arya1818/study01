package practice01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String age;
		String bl;

		System.out.println("몇살인가요?");
		age = scan.nextLine();               // nextLine :문자열을 입력받음
		int num = Integer.parseInt(age);

		if (num <= 10) {
			System.out.println("어린이");
		} else if (num <= 20) {
			System.out.println("청소년");
		} else if (num <= 30) {
			System.out.println("구직중이신가요? (네/아니오)");
			bl = scan.nextLine();
	/////모르겠다!!!!!String배열관련된건가?
			if (bl == "네") {
				System.out.println("환영합니다");
			} else {
				System.out.println("구직자만 가능합니다");
			}
		} else {
			System.out.println("꼰대");
		}

	}
}