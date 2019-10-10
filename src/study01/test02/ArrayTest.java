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

		System.out.println(moneys.length);
		for(int i=0; i<moneys.length; i++) {
			System.out.println(moneys[i]);
		}
		
		
		
		
		double[] dbs = new double[5];
		dbs[0] = 3.3;
		System.out.println(dbs[0]);     // 3.3
		dbs = new double[1];
		System.out.println(dbs[0]);     // 0.0

		System.out.println(moneys.length);  // 4
		for(int i=0; i<moneys.length; i++) {
			System.out.print(moneys[i]);  // 0,100,500,1000
			if(i!=3) {
			System.out.print(",");
			}
		}
	}
}