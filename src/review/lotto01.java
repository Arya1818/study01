package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lotto01 {
	public static void main(String[] args) {
		List<Integer> lottoList = new ArrayList<Integer>();
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(6) + 1;
			if (lottoList.indexOf(num)==-1) {
				lottoList.add(num);
			} else {
				i--;
			}

		}System.out.println(lottoList);
	}
}
