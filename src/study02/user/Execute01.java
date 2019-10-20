package study02.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute01 {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);

	void insert() {
		System.out.println("아이디를입력해주세요");
		String id = scan.nextLine();
		System.out.println("패스워드를입력해주세요");
		String pwd = scan.nextLine();
		System.out.println("이름을입력해주세요");
		String name = scan.nextLine();
		System.out.println("나이를입력해주세요");
		String age = scan.nextLine();
		System.out.println("기타를입력해주세요");
		String etc = scan.nextLine();

		String sql = "insert into user_info(id,pwd,name,age,etc)";
		sql += "values ('" + id + "','" + pwd + "','" + name + "','" + age + "','" + etc + "')";

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("저장된갯수 :" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void delete() {
		System.out.println("삭제할 아이디를 입력해주세요");
		String id = scan.nextLine();
		
		String sql = "delete from user_info where id = '" + id +"'";
		
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void update() {
		System.out.println("바꾸고 싶은 이름의 아이디를 입력해주세요");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("이름을 무엇으로 바꾸시겠습니까?");
		String name = "'" + scan.nextLine()+ "'";
		String sql = "update user_info set name ="+name+"where id ="+id;
		
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("업데이트된 갯수:"+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void select() {
		System.out.println("성이 무엇인가요?");
		String name = scan.nextLine();
		String sql = "select * from user_info where name like'" + name +"%"+"'";

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("입력된갯수: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Execute01 ex = new Execute01();
	//	ex.insert();
	//	ex.update();
		ex.select();
	}

}
