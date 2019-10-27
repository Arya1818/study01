package study01.test09;

import study01.test08.Atom;

public class Inherit01 extends Atom{
	
	public String toString() {
		return "아 나는 메모리 주소 찍기 싫다고";
	}
	
	public static void main(String[] args) {
		Inherit01 ih = new Inherit01();
		ih.protectedTest();
		System.out.println(ih);
//		
//		Object o = new Inherit01();
//		System.out.println(o);
//		
	}

}

