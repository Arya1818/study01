package programmers;

public class Solution {
	
	public int solution(String s) { //static이 붙지 않았으니 인스턴스 메서드
		int answer = Integer.parseInt(s);
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Solution sl = new Solution();
		sl.solution("1234");
	}
}

/*
 * 클래스 메서드도 클래스 변수처럼, 객체를 생성하지 않고도
 * 
 * '클래스이름.메서드이름(매개변수)'와 같은 식으로 호출이 가능하다.
 * 
 * 반면에 인스턴스 메서드는 반드시 객체를 생성해야만 호출할 수 있다.
 */

