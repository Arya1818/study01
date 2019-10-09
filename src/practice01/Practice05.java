package practice01;

public class Practice05 {
	
		int num1;
		int num2;
		String str = new String("");
		
		public static void main(String[] args) {
			Practice05 ot = new Practice05();
			ot.num1 = 5;
			ot.num2 = 10;
			System.out.println(ot.num1);
			System.out.println(ot.num2);

			ot = new Practice05();
			System.out.println(ot.num1);
			System.out.println(ot.num2);

			Practice05 ot2 = new Practice05();
			System.out.println(ot.str == ot2.str);
		}
	}
