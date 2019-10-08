package study01.test10;

class FF{
	FF(){
		System.out.println("난 new FF()를 하던 new FinalTest01()를 하던 다 실행됨!");
	}
	public void test() {
		System.out.println("난 FF의 test()");
	}
}

public class FinalTest01 extends FF{
	FinalTest01(){
		System.out.println("난 new FinalTest01()를 해야만 실행됨!");
	}
	public void test() {
		System.out.println("난 FinalTest01의 test()");
	}
	final int num = 1;
	
	public static void main(String[] args) {
		FinalTest01 ft = new FinalTest01();
		//System.out.println(ft instanceof FinalTest01);
		//System.out.println(ft instanceof FF);
		//System.out.println(ft instanceof Object);
		FF ff = new FinalTest01(); //메모리는 Finaltest01 
		
		System.out.println(ff instanceof FinalTest01); //ff를 FinalTest01이라고 부를수있어?
		
		ft = (FinalTest01)ff; //형태에 따라 자름 
				
		ff = new FF(); 
		System.out.println(ff instanceof FinalTest01);
		
	}
	
}

//instanceof :