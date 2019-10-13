package practice01;

import java.util.Scanner;

public class Practice011 {
	static String nextLine(String inputStr) {
		return new String(inputStr);
	}

	public static void main(String[] args) {
		String answer = nextLine("네");
		System.out.println("네".equals(answer));
		
		
		Scanner sc = new Scanner(System.in);
		String age;
		String school;
		
		System.out.println("몇살인가요?");
		age = sc.nextLine();
		int num = Integer.parseInt(age);
		
		if(num<=30) {
			System.out.println("학생인가요?(네/아니오)");
			school = sc.nextLine();
			if(school.equals("네")) {
				System.out.println("입장하세요");
			} else {
				System.out.println("돌아가세요");
			}
		} else {
			System.out.println("30대 이하 학생만 가능합니다");
		}
		
	}
}
//new라고 생성안해줬으니까 이메모리인지 저 메모리인지어떻게 알아? 
//그니까 ㅇㅇㅇㅇㅇ
//quals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만,

== 연산자는 비교하고자 하는 대상의 주소값을 비교합니



출처: https://kmj1107.tistory.com/entry/JAVA-문자열string-비교-equals와-의-차이점-equals의-반대 [토순이네집]
