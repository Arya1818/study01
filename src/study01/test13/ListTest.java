package study01.test13;

public class ListTest {
	private String[] strs; //<-이걸쓰려면 반드시 ListTest를 new해줘야한다./변수는 private로 주로 선언, 왜? main에서 맘대로 못바꾸게하려고, 메소드를 통해 하게하려고.
	
	public ListTest() {			//null값의 길이를 구하면 안도니까 이걸 꼭 추가해줘야함.
		this.strs = new String[0];  
	}
	
	public int size() { 	//str의 length를 return해야함
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
	
	
	public static void main(String[] args) {
//		ArrayList<String> arr = new ArrayList<String>();
		//System.out.println(arr.size());    //int형 데이터타입에 size가 있다.
		ListTest lt = new ListTest();
//		System.out.println(lt.size());
		lt.add("a"); // a
		
		lt.add("b"); // null b
		lt.add("c"); // null null c
//		System.out.println(lt.size());
		System.out.println(lt.strs[0]+','+lt.strs[1]+','+lt.strs[2]);
	}
}

// length는 속성이다.
// 메소드를 가지고 있는건 정해지지않은 데이터타입

//  (temp 변수에 전에 가지고 있던 방을 넣어두고 for문을 돌려 +1만큼 증가하게 만들고 출력할 때 더해준다?)
// 배열에는 length라는 속성이없음 정해진거임.
//String은 정해진데이터타입x 
//string이 length를 가지고있긴 하지만 



