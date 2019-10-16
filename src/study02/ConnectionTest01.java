package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest01 {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //패키지.클래스 //메소드의 호출. 정해지지않은 데이터타입중 하나의 이름이 Class//--종류선택(oracle)
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; //전화번호
			String id = "bdi";
			String pwd = "12345678";
			
			Connection con = DriverManager.getConnection(url,id,pwd);//--접속
			
			Statement stmt = con.createStatement();//--흰색칠판
			
			String sql = "select * from user_info";//--쿼리문
			ResultSet rs = stmt.executeQuery(sql);//--statement의 query를 실행해 뭐를? sql을. 
			//ResultSet rs는 메타데이터에대한 정보와 데이터 정보를 담고있음
			//////////////////////////여기까지가 실행대기
			
			List<Map<String,String>> userList
				= new ArrayList<Map<String,String>>();
			
			while(rs.next()) { //--처음에서 시야를 내려줘야함.메모리가 다 찰때까지 한 시야만 바라봄.true나오면 밑에꺼 실행하는거임.마지막 시야에 id가 없다면 false가나옴. //데이터타입 boolean 
				
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);
				
			}
			System.out.println(userList);
			
		} catch (ClassNotFoundException | SQLException e) {	//아까 오류가 난 이유는 예외처리해달라는 뜻. 문법적으로 강요할 수 있다.								
			e.printStackTrace();
		} 
		
	
	}
}

//배열>리스트>맵 키값을 변수처럼 쓸 수 있음. 
//순입순출 빠른거 Arralist
//중간에 빼고 추가하고 하기엔 Linkedlist
//키값 밸류값만 알면 될 때 hashmap
//linkedhashmap


