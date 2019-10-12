package study01.test11;

public class ArrayTest {
	//int [][] nums;      //이중배열
	//nums[0];   //nums 0 의 데이터타입은 인트배열
	public static void main(String[] args) {
		
		int [][] nums = new int[4][]; //4행 0열
		nums[0] = new int[3];              //0층의 방갯수 3개
	//	System.out.println(nums[0][1]);
		nums[1] = new int[10];             //1층의 방갯수 10개
		
		System.out.println(nums[0].length); //
		System.out.println(nums[1].length); //10
	
	}
}














//각 층마다 가질 수 있는 배열의 길이는 달라도된다.


