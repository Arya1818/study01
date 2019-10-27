package review;

class Finalfather{
	Finalfather(){
		System.out.println("난 new Finalfather()를 하던 new FinalTest01()를 하던 다 실행됨!");
	}
	public void test() {
		System.out.println("난 Finalfather의 test()");
	}
}

public class FinalTest01 extends Finalfather{
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
		Finalfather ff = new FinalTest01(); //메모리는 Finaltest01 
		ft.test();
		ff.test();
		
		System.out.println(ff instanceof FinalTest01); //ff를 FinalTest01이라고 부를수있어?
		
		ft = (FinalTest01)ff; //형태에 따라 자름 
				
		ff = new Finalfather(); 
		ff.test();
		System.out.println(ff instanceof FinalTest01);
		
	}
	
}

//instanceof :