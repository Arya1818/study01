package study02.user; //여태까지 한걸 일ㅋㅔ간단하게 열결해보림

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con = DBCon.getCon(); // 메소드 어디서나 쓰려고
	Scanner scan = new Scanner(System.in);
	// System.out.println("")

	void insert() {
		System.out.println("id를 입력해주세요");
		String id = scan.nextLine();
		System.out.println("pwd를 입력해주세요");
		String pwd = scan.nextLine();
		System.out.println("name를 입력해주세요");
		String name = scan.nextLine();
		System.out.println("age를 입력해주세요");
		String age = scan.nextLine();
		System.out.println("etc를 입력해주세요");
		String etc = scan.nextLine();

		String sql = "insert into user_info(id,pwd,name,age,etc)";
		sql += " values('" + id + "','" + pwd + "','" + name + "','" + age + "','" + etc + "')";

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql); // 에러가 날 수 있는 상황에 대비해 TRY CATCH
//			System.out.println(sql);
			System.out.println("저장된 갯수 :" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void update() {
		System.out.println("업데이트할 아이디를 작성해주세요: ");
		String id = "'" + scan.nextLine()+ "'";
		System.out.println("이름을 무엇으로 바꾸시겠습니까?: ");
		String name = "'" + scan.nextLine() + "'";
		String sql = "update user_info set name =" + name + "where id =" + id;


		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("업데이트된 갯수: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void delete() {
		System.out.println("삭제할 아이디를 작성해주세요: ");
		String id = scan.nextLine();
		String sql = "delete from user_info where id = '" + id + "'";

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 갯수: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void select() {
		System.out.println("성이 무엇인가요? (성으로 시작하는 이름을 가져올게요) ");
		String name = scan.nextLine();
		String sql = "select * from user_info where name like '" + name + "%" + "'";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("입력된갯수: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void initResponse() {
		String res = ""; //일단 값이 없음 이따가 scan으로 넣어줌
		System.out.println("원하는 서비스 번호를 입력하세요.");
		System.out.println("1.유저생성");
		System.out.println("2.유저삭제");
		System.out.println("3.유저수정");
		System.out.println("4.유저조회");
		System.out.println("q.종료");
		res = scan.nextLine();
		if("1".equals(res)) {
			
		}else if("2".equals(res)) {
			
		}else if("3".equals(res)) {
			
		}else if("4".equals(res)) {
			
		}else if("q".equals(res)) {
			System.out.println("시스템이 종료됩니다.");
		}else {
			System.out.println("번호를 다시 입력해주세요.");
		}
		
	}

	public static void main(String[] args) {
		Execute ex = new Execute();
		ex.insert(); //void insert가 static이 아니라서 위치를 모름. 메모리 생성 후 호출. 
//		ex.delete();
//		ex.update();
//		ex.select();
	}
}
