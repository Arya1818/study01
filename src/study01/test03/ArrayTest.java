package study01.test03;

public class ArrayTest {
	public static void main(String[] args) {
		int[] nums = new int[10]; //0~9번째 방 가지고 있다.
		//for (int i = 1; i <= 10; i++)
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=(i+1)*2;
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	}
}
