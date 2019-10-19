package study02.user; //전화거는 로직 자체를 클래스에서 하겠다// 다 신경안쓰고 전화거는것만 신경쓰면됨

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon { //Data Base Connection
	private static final String DRIVER_NAME;       
	private static final String URL;
	private static final String ID;
	private static final String PWD;
//	Connection con; //멤버변수 일때만 인스턴스생성할대 null 자바가 넣어줌
	
	static {
		URL= "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(DRIVER_NAME);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	private static Connection con;
	
//	public static Connection getCon1() throws SQLException {
//		if(con == null) {
//			con = DriverManager.getConnection(URL,ID,PWD);
//		}
//		return con;
//	}
	public static Connection getCon() {   //connection적인 오류는 throws할 필요가 없다.더 효율적
		if(con == null) {
			try {
				con = DriverManager.getConnection(URL,ID,PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static void main(String[] args) {
		Connection con = getCon();
	}
}

