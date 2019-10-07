package study01.test09;

import study01.test08.Atom; //다른 패키지의 Atom을 바라본다.

public class Inherit extends Atom {   //패키지 다르면 ~ 모르기때문에 ctrl shift o
	
	public String toString() { //object에 toString이 있기 때문에 오류가 안나고 오버라이딩 가능!
		return "아 나는 메모리 주소 찍기 싫다고";
	}
	//static void test(Object i) {
		
//	}
	
	
	public static void main(String[] args) {
		//Inherit i = new Inherit();
		//i.defaultTest(); //안됨. 패키지가 달라서.
		//i.protectedTest(); //됨 패키지가 다르지만 상속 받아서.
		
		//System.out.println(i);  //메모리주소 출력됨
		//test("asdfasd"); //object니까다됨
		
		Object o = new Inherit();
		System.out.println(o);//1.가능
		System.out.println(new Inherit());//2이것도가능
	

	}
}



//모든 클래스는 오브젝트라고 불릴수 있구나. 오브젝트라고 블리는건 다 집어넣을수있구나.

//오버라이딩:상속받은 메서드의 내용을 변경하는ㄴ것.

7라인은 뭘 오버라이딩한거지?
         