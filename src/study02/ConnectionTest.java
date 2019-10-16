package study02; //데이터베이스에 전화를 거는 방법

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 전화번호
		String id = "bdi";
		String pwd = "12345678";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 패키지.클래스 //메소드의 호출. 정해지지않은 데이터타입중 하나의 이름이 Class, 들어가기위해서 필요//--오라클선택
			Connection con = DriverManager.getConnection(url, id, pwd);// --접속

			String sql = "select * from user_info";// --쿼리문
			Statement stmt = con.createStatement();// --흰색철판
			ResultSet rs = stmt.executeQuery(sql);// --statement의 query를 실행해 뭐를? sql을. //rs가 메타데이터에대한 정보와 데이터 정보를 담고있음
			while (rs.next()) {
				System.out.println(rs.getString("id"));
			}

		} catch (ClassNotFoundException | SQLException e) { // 아까 오류가 난 이유는 예외처리해달라는 뜻. 문법적으로 강요할 수 있다.
			e.printStackTrace();
		}

	}
}

//@전: Oracle에 전화를 걸려면 이렇게 해야한다 뒤:ip주소
//http80포트와 다르게 1521이라는 포트번호 써줘야한다.
//express edition 
//forName 메모리 생성안했지만 삐딱하다--->static
//오류나는거 예외처리 