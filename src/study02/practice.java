package study02;

class practice2 {
	static int num2 = 2;

}
public class practice {
	int num1;
	static int num2 = 20;
	
	public static void main(String[] args) {
		practice2 pt = new practice2();
		practice prt = new practice();
		prt.num1 = 10;
	//	System.out.println(pt.num1);
		System.out.println(pt.num2); 
		System.out.println(num2); 
		System.out.println(prt.num1); 
	}
}