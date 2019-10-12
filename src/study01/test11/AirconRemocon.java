package study01.test11;



interface Remote {
	public void on();
	public void off();
}


public class AirconRemocon implements Remote {

	@Override
	public void on() {
		System.out.println("에어컨을 킵니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		System.out.println("에어컨을 끕니다.");
		// TODO Auto-generated method stub
		
	}

}
