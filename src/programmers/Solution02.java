package programmers;

public class Solution02 {

	public int solution(int n) {
		String answer = n + "";
		int sum=0;
		for (int i = 0; i < answer.length(); i++) {
//			answer = n + "";
			String str = answer.substring(i, i + 1);
			int t = Integer.parseInt(str);
			sum = sum + t;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Solution02 sl = new Solution02();
		sl.solution(123);
	}
}


//String s1 = answer.substring(0,1);
//String s2 = answer.substring(1,2);
//String s3 = answer.substring(2,3);
//int i1 = Integer.parseInt(s1);
//int i2 = Integer.parseInt(s2);
//int i3 = Integer.parseInt(s3);
//System.out.println(i1+i2+i3);