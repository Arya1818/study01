package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {
	// 주로, DBCon, DBConnection 이렇게 이름을 붙임
	// Assuming that URL, ID, PWD wouldn't be changed.
	public static final String DRIVER_NAME;       
	public static final String URL;
	public static final String ID;
	public static final String PWD;
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
	
	public static void main(String[] args) {
	
		
		Connection con = null;  //finally에서 쓰려고
//		Connection con; //만약 선언만 한다면? 바라보는게없음. 지역변수이기 때문에 x
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD); //반드시순서대로
			String sql = "select*from user_info ";
			
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해줏요: ");
			String id = "'%"+scan.nextLine()+"%'";
			
			sql += "where id like " + id +" "; 						//앞의 변수에 뒤의 값을 더한다. num = num +100
			
			Statement stmt = con.createStatement();
//			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {									//처음과끝이 분명하지 않을때
				System.out.println(rs.getString("id"));
			
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null){ //database를 위해서 끊어줘야함.
				try {
					con.close(); //이때도 예외처리가 발생할수 있기 때문에 try catch.
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
//database는 자바 언어를 못알아먹음
//sql은 질의할 때만 사용할수있으음.
