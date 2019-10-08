package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();

		// 입력부
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}

		// 정렬 (큰 숫자부터 정렬)

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int tmpNum = nums[i];
					nums[i] = nums[j];
					nums[j] = tmpNum;
				}
			}
		}
		ArrayList<Double> doubleList = new ArrayList<Double>();
		for(int i =0; i<doubleList.size(); i++) {
			if(doubleList.get(i) > doubleList.get(j)) {
				double tmpDouble = doubleList.get(i));
				doubleList.set(i, doubleList.get(j));
				doubleList.set(j, tmpDouble);
			}
			//numList.add(Double.parseDouble(nums[i]));
			
		}
		
		// 출력부
		for (int i = 0; i < doubleList.size(); i++) {
			System.out.println(doubleList);
		}
	}
}

//래퍼클래스
//Arraylist 추가 삭제 너무 빨라
//size(); get(); set(); 메서드
//<>안채워주면 에러가 난다 우리는 채워준다. 


