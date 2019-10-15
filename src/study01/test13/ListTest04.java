package study01.test13;

public class ListTest04 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "1";
		strs[0] = "2";
		strs[0] = "3";
		String[] tmp = strs;
		strs = new String[strs.length-1];  //길이보다 하나 작은 방을 만든다. (방 존재자체를 없애기)
		for(int i=0; i<1; i++) {
			strs[i]=tmp[i];
		}
		for(int i=1+1; i<tmp.length; i++) {
			strs[i-1] = tmp[i];
		}
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}

