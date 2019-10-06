package study01.test02;

public class Swap {
	public static void main(String[] args) { //int a는 main영역에 포함.
		int a = 3;
		int b = 4;
		int c = a;   // c = 3
		a = b;       // a = 4
		b = c;       // b = 3	--->결과적으로 a와 b가 바뀜	
		System.out.println(a+","+b);
		
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 3;
		nums[2] = 5;
		int[]tmpNums = nums;
		nums = new int[4];
		nums[0] = tmpNums[0];
		nums[1] = tmpNums[1];
		nums[2] = tmpNums[2];
		nums[3] = 7;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
	}
}
