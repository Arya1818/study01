package study01.test02;

public class ArrayTest {
	public static void main(String[] args) {
		int money1 = 0;
		int money2 = 100;
		int money3 = 500;
		int money4 = 1000;
		
		int[] moneys = new int[4];
		
		moneys[0] = 0;
		moneys[1] = 100;
		moneys[2] = 500;
		moneys[3] = 1000;
		
		double[] dbs = new double[5]; //  = 배열 만들어줘 몇개? 5개
		dbs[0] = 3.3;
		System.out.println(dbs[0]);
		dbs = new double[1];
		System.out.println(dbs[0]);
		
		System.out.println(moneys.length); //moneys의 length(길이)
		for(int i=0 ; i<moneys.length ; i=i+1) {
			System.out.println(moneys[i]); //for문 순서 잘 알기
		}
	}
}
