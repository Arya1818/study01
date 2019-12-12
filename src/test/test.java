package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("글자를입력해주세요");
		String str = s.nextLine();
		
		int cnt = 0;
		while (str.indexOf("test") != -1) {
			str = str.substring(str.indexOf("test") + 4);
			cnt++;
		}
		System.out.println(cnt);
	}

}
