package study01.test13;     //리스트(List)가 어떻게 동작하는지   배열로 까보자!!

public class ListTest02{
	private String[] strs;
	
	public ListTest02() {
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[this.strs.length+1];   //this는 붙이는게 좋다.내꺼! 
		this.strs[this.strs.length-1] = str;
		
		for(int i =0; i<tmpStr.length; i++) {
			this.strs[i]=tmpStr[i];
		}
	}

	public String toString(){  //상속받은거니까 접근제어자가 중요!! 그리고 toString의 데이ㅓ타입이 String
		//String str = "";   //lt가 가지고있는 strs에 뭐가있느냐가 알고싶은거임
		//return str;
		String str = "[";
		for(int i=0; i<strs.length; i++) { //strs의 length
			str += strs[i]+",";
		}
		str = str.substring(0,str.length()-1); //str의 length 다른것임//끝자리만 잘라내는걸 하고싶어서 -1해줌
		str += "]";
		return str;
	}
//	public int indexOf(String str) {
//		for(int i=0; i<strs.length; i++) {
//			if(str.equals(strs[i])) {
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	public void remove(String str) {
//		int idx = indexOf(str);
//		if(idx!=-1){
//			remove(idx);
//	}
//}	

	public void remove(int idx) {
		String[] tmp = strs;
		for(int i=0; i<idx; i++) { //(1보다 작을때까지 돌림)
			strs[i] = tmp[i];
		}
		for(int i=idx+1; i<tmp.length;i++) {
			strs[i-1] = tmp[i];
		}
	}

	public static void main(String[] args) {
//		ArrayList<String> arr = new ArrayList<String>();
		ListTest02 lt = new ListTest02();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		lt.remove(1);
		for(int i=0; i<lt.size(); i++) {
			System.out.println(lt);
		}
		
	}
}

//index of, substring