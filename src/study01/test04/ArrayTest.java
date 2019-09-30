package study01.test04;

import java.util.Random; //ctrl shift o

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[6]; // 방갯수, 같은데이터타입

		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(6) + 1; // 1~45
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] == nums[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}


//<중복제거> 계산, 검증 20분안에 끝나야함.
// int n = 12345678912;
// long l =12345678912l;
// double db = 1.1;
// float f1 = 1.1f;
