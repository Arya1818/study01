package practice01;

public class Practice07 {

		int num1 = 3;
		int num2 = 3;
		
		public static void main(String[] args) {
			Practice07 ot = new Practice07();
			Practice07 ot2 = new Practice07();
			
			System.out.println(ot == ot2); //false
			System.out.println(ot); //주소
			System.out.println(ot2); //주소
			
			System.out.println(ot.num1); //3
			System.out.println(ot.num2); //3	
			System.out.println(ot2.num1); //3
			System.out.println(ot2.num2); //3
			}
	}

