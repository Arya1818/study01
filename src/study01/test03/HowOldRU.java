package study01.test03;

import java.util.Scanner;//ctrl shift o ->Scanner�� ����

public class HowOldRU {
	public static void main(String[] args) { // �������������� ������Ÿ��:ù���ڴ빮��(��ĳ��,�迭,�ý���,��Ʈ��
		Scanner scan = new Scanner(System.in); // �����Ǽ���, �������ʱ�ȭ //�ý��ۿ� �Է°�ü
		System.out.println("몇살이세요~?"); // �ý����� ��°�ü
		String age = scan.nextLine();
		int num = Integer.parseInt(age);
		if (num <= 10) {
			System.out.println("어린이");
		} else if (num <= 20) {
			System.out.println("청소년");
		} else if (num <= 40) {
			System.out.println("청년");
		} else {
			System.out.println("꼰대");
		}

	}

}
