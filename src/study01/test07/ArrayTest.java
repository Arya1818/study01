package study01.test07;

public class ArrayTest {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String[] strs = new String[5];  //? string을 저장할 수 있는 공간을 5개 만드는 것이다. 메모리생성x, null 들어가있음		
	
		for(int i =0; i<strs.length; i++) {
			strs[i] = (i+1)*10 + "";  //스트링배열이기때문에
			
		}
		for(int i =0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}

/* null, 0, "" 는 다른 것이다.
 */
// String age = scan.nextLine();
// int num = Integer.parseInt(age)  -->관련은 있지만 아직 배우지않음

//문자하고 더하면 문자가 된다.
