package study01.test08; 


public class Inherit extends Atom{       
	public static void main(String[] args) {
		Inherit i = new Inherit();
		i.defaultTest(); //Atom과 같은 패키지 내에 있으니 가능
		i.protectedTest(); //Atom에게 상속 받아서 가능.
		i.publicTest();
	//	i.privateTest(); -->1. 상속해도못씀. 있는건 알지만 사용못한다.
		
	}

}
