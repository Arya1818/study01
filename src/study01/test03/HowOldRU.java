package study01.test03;

import java.util.Scanner;//ctrl shift o ->Scanner�� ����

public class HowOldRU {
	public static void main(String[] args) { //�������������� ������Ÿ��:ù���ڴ빮��(��ĳ��,�迭,�ý���,��Ʈ��
		Scanner scan = new Scanner(System.in); //�����Ǽ���, �������ʱ�ȭ //�ý��ۿ� �Է°�ü
		System.out.println("How old are you~?"); //�ý����� ��°�ü
		String age = scan.nextLine();
		System.out.println("I'm "+age+" years old~");
	}

}

