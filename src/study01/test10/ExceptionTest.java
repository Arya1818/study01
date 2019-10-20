package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {
		String strNum = "일이삼사";
		try {
			int num = Integer.parseInt(strNum);
		}catch(Exception e) {
			System.out.println(strNum + "은 숫자가 아닙니다.");
		}finally {
			System.out.println("난 무조건 실행돼!");
		}
		System.out.println("종료합니다.");
	}
}

//프로그램을 만들 때 예외 상황에 대해서도 코딩을 한다. =>예외처리 =try catch
//try문에서 오류가 생기면 바로 catch로 넘어간다. catch는 오류가 났을때만 동작 하는곳.
/*
 * 형태
 * 1 예외는 있지만 실행해봐야 안다. 
 * 2 무조건 한다. 
 * 
 */