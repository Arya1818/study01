package review;

import java.util.ArrayList;
import java.util.List;

public class WhileTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		List<String> strList = new ArrayList<String>();
		while (strList.size() < 7) {
			strList.add("암거나~");
			System.out.println(strList);
		}
		do {           
					
			strList.add("암거나");
		}while(strList.size()<7);
	}

}




//위는 조건 만족하지 않으면 실행을 안하지만 do while은 한번은 실행한 다음 비교함