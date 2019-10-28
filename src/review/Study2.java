package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Study2 {
	int a;
	public String test(int a) {
		return "abc";
	}
	
	public static void changeMember(Study2 s) {
		
		s = new Study2();
		s.a = 10;
		
	}
	
	
	public static void main(String[] args) {
		HashMap<String,String> human = new HashMap<String,String>();
		human.put("이름","조은애");
		human.put("나이","25");
		human.put("이름","박하늘");
		human.put("성별","여자");
		
		List<HashMap<String,String>> people = new ArrayList<HashMap<String,String>>();
		people.add(human);
		people.add(human);
		
		human = new HashMap<String,String>();
		
		
		Study2 s;
		changeMember(s);
		
		
		System.out.println(human); //{}
		System.out.println(people); //[{이름=박하늘, 나이=25, 성별=여자},{이름=박하늘, 나이=25, 성별=여자}]
		System.out.println(s.a); //
	}
}
