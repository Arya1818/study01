package study01.test12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class LibTest {


	public static void main(String[] args) {
		List<String> ages = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("나이를 입력해 주세요 :");
			//ages.add(scan.nextLine());
			String age = scan.nextLine();
			age = StringUtils.leftPad(age, 3, "");     //추가
		//	age = StringUtils.leftPad(age, 10, "*");    
			ages.add(age);
		}
		Collections.sort(ages);
		for (int i = 0; i < ages.size(); i++) {
			System.out.println(ages.get(i));
		}

	}
}


//StringUtils
// leftpad 메모리 생성안했음 ->static , 상속받은거아님 public