package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("입력해주세요");
		String str = s.nextLine();
		
		int cnt = 0;
		
		while(str.indexOf("test")!=-1) {
			str.substring(str.indexOf("test")+4);
			cnt++;
		}
			
		System.out.println(cnt);
	}
}
