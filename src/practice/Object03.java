package practice;

public class Object03 {

	String str1 = "나비";
	String str2 = "나비";

	public static void main(String[] args) {
		Object03 ot = new Object03();
		Object03 ot2 = new Object03();

		System.out.println(ot == ot2); // false
		System.out.println(ot.str1 == ot.str2); // true
		System.out.println(ot.str1 == ot2.str1);// true

		ot.str1 = new String("나비");
		ot2.str1 = new String("나비");

		System.out.println(ot.str1 == ot2.str1); //false 위치다름
		System.out.println(ot.str1);  //나비
		System.out.println(ot.str2);  //
		System.out.println(ot2.str1); //나비
		System.out.println(ot2.str2); //
		System.out.println(ot.str1 == ot.str2); //false
		System.out.println(ot.str1 == ot2.str1);//false
		System.out.println(ot2.str1 == ot2.str2);
	
	}
}
