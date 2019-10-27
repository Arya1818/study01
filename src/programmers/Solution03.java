package programmers;

import java.util.Scanner;

class Solution03 {

	public int solution(int n) {
		int answer = n;
		for (int i = 2; i < answer; i++) {
			if(i/i==1 &  i%1==0) {
				System.out.println(i);
			}
		}
//		System.out.println(n);
			return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = scan.nextLine();
		int n = Integer.parseInt(num);

		Solution03 sl = new Solution03();
		sl.solution(n);
	}
}
