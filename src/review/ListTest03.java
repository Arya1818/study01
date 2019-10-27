package review;

public class ListTest03 {
	public static void main(String[] args) {
		String test = "12345"; //char배열
//		test.substring(1); //2345
		//test가 가져있는 값중에서 1번째 방부터 가져오긴 하는데 새로운 스트링을 만들고return해준것
//		test.substring(2);
		test = test.substring(2); //345
		test = test.substring(1,3); //23 //원하는 시작값 부터 종료하기 전까지 잘라서 뽑아낸다
//		System.out.println(test.substring(1)); //2345
//		System.out.println(test.substring(2)); //345
		System.out.println(test); 
	}
}
//substring 문자열을 잘라서 뽑아오는 기능
//3이 있는 위치가 어디야? 2