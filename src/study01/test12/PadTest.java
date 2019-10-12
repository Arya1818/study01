package study01.test12;

public class PadTest {

	public static void main(String[] args) {
		String str ="1";
		int max = 4 -str.length() ; //zerofill
		//str ="0" + str;
		//str ="0" + str;
		//str ="0" + str;
		for(int i=1; i<=max; i++) {
			str += "0";
			System.out.println(str);
		}
	}
}
