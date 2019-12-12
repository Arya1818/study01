package review2;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("가나다"); 
		strList.add("나다");   
		strList.add("가다");
		strList.add("오라");

		String searchStr = "가";
		for(int i=0; i<strList.size(); i++) {
			 int idx = strList.get(i).indexOf(searchStr);
			 if(idx==-1) {
				 strList.remove(i);
			 }	 
		}
		System.out.println(strList);
		
		//int idx = strList.indexOf("다"); //
		//strList.remove(idx);
		//System.out.println(strList);
	}

}
