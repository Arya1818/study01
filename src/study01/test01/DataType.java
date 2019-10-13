package study01.test01;

public class DataType {

	public static void main(String[] args) {
		int num = 10;
		num = 9;
		num = 7;
		
		System.out.println(num);             //7
		
		num = 8;
		System.out.println(num); 			//8
		double doubleNum = 1;
		System.out.println(doubleNum);        //1.0

		String str = "안녕하세요";
		boolean bl = true;
		bl = false;
		System.out.println(bl);        //false

		System.out.println(num + str);  //'8안녕하세요'

	}
}
//