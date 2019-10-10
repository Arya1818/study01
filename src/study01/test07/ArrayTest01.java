package study01.test07;

public class ArrayTest01 {

	public static void main(String[] args) {
		String[] strs = new String[4]; 
		for (int i = 0; i < strs.length; i++) {
			strs[i] = (i + 1) * 10 + ""; 
			System.out.println(strs[i]);
		}
	}
}
