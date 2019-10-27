package study01.test11;

public class ContinueTest {
	public static void main(String[] args) {
		for(int i=0; i<=20; i++) {
			if(i%2==0) continue;   //중간에 skip시켜야할때
			System.out.println(i);
		}
	}
}
//i가 2의 배수일때 걍 넘어가고 아닌것만 출력시켜라~
