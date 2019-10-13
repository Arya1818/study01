package practice01;

public class Object03 {

	String str1 = "";  //클래스영역에 있지만 static이 안붙음->인스턴스변수
	String str2 = "";
	boolean bl1 = true;
	boolean bl2 = false;

	Object03(){
		
	}
	public static void main(String[] args) {
//		String str1 = new String("");
//		String str2 = new String("");
		
//		System.out.println(str1==str2);
	
		Object03 ot = new Object03(); //생성자 
		
//		System.out.println(ot.str1==str1); 
//		System.out.println(ot.str2=="");
		
//		str1.equals(str2);
//		"".equals(str1);
		
		Object03 ot2 = new Object03();
//		ot.toString();
//		System.out.println(ot);
//		System.out.println(ot2);
		
//		System.out.println(ot.str2);  //""
//		System.out.println(ot2.str1); //""
//		System.out.println(ot == ot2); // false-주소값이다름
		
//		System.out.println(ot.str1 == ot.str2); // true
//		System.out.println(ot.str1 == ot2.str1); //true
//
		ot.str1 = new String("b");
		ot2.str1 = new String("b");

		System.out.println(ot.str1 == ot2.str1); //false 주소값이다름
		System.out.println(ot.str1);  //b
		System.out.println(ot.str2);  //""
		System.out.println(ot2.str1); //b
		System.out.println(ot2.str2); //""
		System.out.println(ot.str1 == ot.str2); //false
		System.out.println(ot.str1 == ot2.str1);//false
		System.out.println(ot2.str1 == ot2.str2);//false
		System.out.println(ot.str2 == ot2.str2);//true
		System.out.println(ot == ot2); //false
//	
	}
}
