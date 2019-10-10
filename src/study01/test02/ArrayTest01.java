package study01.test02;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		String[] name = new String[3];
		name[0] = "jo";
		name[1] = "eun";
		name[2] = "ae";
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		//System.out.println(name); //주소값이 출력됨

		//String[] name = new String[] {“Jo”, “eun”, “ae”};

	}

}
