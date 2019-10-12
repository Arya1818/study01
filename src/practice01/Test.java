//int형 배열변수 nums 선언
//nums의 length는 10
// 
//for문을 사용하여 1부터 10까지의 랜덤 숫자를 생성하여
//배열변수 nums에 0번 index부터 9번 index까지 입력한뒤
// 
//for문을 사용하여 nums에 대입된 숫자를 출력해주면됩니다.
// 
//*nums에 입력되는 for문과 출력되는 for문은 별개로 작성해주셔야 합니다.
// 

package practice01;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int[] nums = new int[10];

		Random r = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10) + 1;

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