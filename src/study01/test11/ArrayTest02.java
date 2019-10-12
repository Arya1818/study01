package study01.test11;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		int[][] nums = new int[4][]; //두번째 차원의 길이 지정x
		nums[0] = new int[3];		//0층에 방3개 생성
		nums[1] = new int[10];		//1층에 방10개 생성
		
		System.out.println(nums.length); //4
		System.out.println(nums[0].length); //3 

	}

}
