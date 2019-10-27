
package review; //String 배열을 만들고 각 방에 10,20,30,40,50이 출력되게 하기, test7 ArrayTest참고

public class ArrayTest01 {
	public static void main(String[] args) {
		String[] strs = new String[5];
		for(int i=0; i<strs.length; i++) {
			strs[i]= (i+1)*10 + "";
			System.out.println(i +"번째 방에 있는 수는 "+ strs[i]);
		}
	}
}