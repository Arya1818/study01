package study01.test03;

public class Increment {
	public static void main(String[] args) {
		int num = 1;
		//num = num + 1; // 기존에쓰던방법
		//num += 1; // 새로운방법1 - 1외에 수를 더할때
		num++; // 새로운방법2 - 1씩더할때
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num++); // 출력을하고 더해라 후순계산 (질문) 출력을 먼저 

		num = num - 1;
		num -= 1;
		num--;
		//System.out.println(num);
		//System.out.println(--num);
		//System.out.println(num--);

		for (int i = 1; i <= 10; i++) { //선언부;조건부(만족할때만실행);증감부
			//System.out.println(i);

		}
	}
}
