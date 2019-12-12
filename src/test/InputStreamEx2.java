package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InputStreamEx2 {
	public static void main(String[] args) {
		String iPath = "c:\\ict/sample.log";
		String oPath = "c:\\ict/result.log";

		try {
			FileInputStream fis = new FileInputStream(iPath);
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String str = null;
			String string = "";
			String res = "";
			String result = "";
			String url = "http://apis.sample.com/search/";

			int blCnt = 0;
			int bkCnt = 0;
			int imgCnt = 0;
			int knwCnt = 0;
			int newsCnt = 0;
			int vcCnt = 0;

			double ie_cnt = 0;
			double ch_cnt = 0;
			double sf_cnt = 0;
			double ff_cnt = 0;
			double op_cnt = 0;
			double total = 0;

			
			List<String> strList = new ArrayList<>();
			while ((str = br.readLine()) != null) {
				string = str + "\r\n";
				strList.add(string);
			}
			
			// 최다호출 API KEY
			// 키워드 카운트? 
			

			// API ServiceID와 요청수
			for (int i = 0; i < strList.size(); i++) {
				if (strList.get(i).contains("200") && strList.get(i).contains(url)) {
					if (strList.get(i).indexOf("blog") != -1) {
						blCnt++;
					} else if (strList.get(i).indexOf("book") != -1) {
						bkCnt++;
					} else if (strList.get(i).indexOf("image") != -1) {
						imgCnt++;
					} else if (strList.get(i).indexOf("knowledge") != -1) {
						knwCnt++;
					} else if (strList.get(i).indexOf("news") != -1) {
						newsCnt++;
					} else if (strList.get(i).indexOf("vclip") != -1) {
						vcCnt++;
					}
				}
			}

			
			int[] nums = { blCnt, bkCnt, imgCnt, knwCnt, newsCnt, vcCnt };
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] < nums[j]) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}

			Map<Integer, String> map = new HashMap<>();
			map.put(blCnt, "blog :" + blCnt);
			map.put(bkCnt, "book :" + bkCnt);
			map.put(imgCnt, "image :" + imgCnt);
			map.put(knwCnt, "knowledge :" + knwCnt);
			map.put(newsCnt, "news :" + newsCnt);
			map.put(vcCnt, "vclip :" + vcCnt);

			
			res += "상위 3개의 API ServiceID와 요청수" + "\r\n";

			Iterator<Integer> it = map.keySet().iterator();
			while (it.hasNext()) {
				for (int i = 0; i < 3; i++) {
					Integer key = it.next();
					if (nums[i] == key) {
						res += map.get(key) + "\r\n";

					}

				}

			}

			// 웹 브라우저 사용비율
			for (int i = 0; i < strList.size(); i++) {
				if (strList.get(i).contains("200") && strList.get(i).contains(url)) {

					if (strList.get(i).indexOf("IE") != -1) {
						ie_cnt++;
					} else if (strList.get(i).indexOf("Chrome") != -1) {
						ch_cnt++;
					} else if (strList.get(i).indexOf("Safari") != -1) {
						sf_cnt++;
					} else if (strList.get(i).indexOf("Firefox") != -1) {
						ff_cnt++;
					} else if (strList.get(i).indexOf("Opera") != -1) {
						op_cnt++;
					}
					
				} total ++;

			}
			res += "\r\n" + "웹브라우저 사용 비율" + "\r\n";
			res += "IE: " + Math.round(ie_cnt / total * 100) + "% \r\n";
			res += "Chrome: " + Math.round(ch_cnt / total * 100) + "% \r\n";
			res += "Safari: " + Math.round(sf_cnt / total * 100) + "% \r\n";
			res += "Firefox: " + Math.round(ff_cnt / total * 100) + "% \r\n";
			res += "Opera: " + Math.round(op_cnt / total * 100) + "% \r\n";

			
			//result파일로 출력하기
	
			FileOutputStream fos = new FileOutputStream(oPath);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			result = res;
			bw.write(result);
			bw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
