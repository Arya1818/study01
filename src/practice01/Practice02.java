package practice01;

import java.util.Random;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1번째 로또 번호를 입력해주세요.");
		int num1 = Integer.parseInt(scan.nextLine());

		System.out.print("2번째 로또 번호를 입력해주세요.");
		int num2 = Integer.parseInt(scan.nextLine());

		System.out.print("3번째 로또 번호를 입력해주세요.");
		int num3 = Integer.parseInt(scan.nextLine());

		System.out.print("4번째 로또 번호를 입력해주세요.");
		int num4 = Integer.parseInt(scan.nextLine());

		System.out.print("5번째 로또 번호를 입력해주세요.");
		int num5 = Integer.parseInt(scan.nextLine());

		Random r = new Random();
		System.out.println("이번주 로또 번호는 두두둥~");
		int correctCnt = 0;
		for (int i = 1; i <= 5; i++) {
			int rNum = r.nextInt(4) + 1;
			System.out.println(i + "번째:" + rNum);
			if (rNum == num1 || rNum == num2 || rNum == num3 || rNum == num4 || rNum == num5) {
				correctCnt++;
			}
		}
		System.out.println("총 맞은 갯수: " + correctCnt);
	}
}
