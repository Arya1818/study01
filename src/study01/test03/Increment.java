package study01.test03;

public class Increment {
	public static void main(String[] args) {
		int num = 1;
		//num = num + 1; // �������������
		//num += 1; // ���ο���1 - 1�ܿ� ���� ���Ҷ�
		num++; // ���ο���2 - 1�����Ҷ�
		System.out.println(num++);
		System.out.println(++num);
		System.out.println(num++); // ������ϰ� ���ض� �ļ���� (����) ����� ���� 

		num = num - 1;
		num -= 1;
		num--;
		//System.out.println(num);
		//System.out.println(--num);
		//System.out.println(num--);

		for (int i = 1; i <= 10; i++) { //�����;���Ǻ�(�����Ҷ�������);������
			//System.out.println(i);

		}
	}
}
