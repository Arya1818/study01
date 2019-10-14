package study01.test13;

import java.util.ArrayList;

public class ListTest02 {
	private String[] strs;
	
	public ListTest02(){
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1] = str;
		
		for(int i=0; i<tmpStr.length; i++) {
			this.strs[i]=tmpStr[i];
		}
	}
		
	
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		ListTest02 lt = new ListTest02();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		
		System.out.println(lt.strs[0]+","+lt.strs[1]+","+lt.strs[2]);
	}
}
