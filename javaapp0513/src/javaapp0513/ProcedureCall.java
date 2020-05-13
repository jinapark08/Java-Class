package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProcedureCall {

	public static void main(String[] args) {
	
		try {
			// 1.드라이버클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.데이터베이스 연결
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.200:1521:xe", 
							"user02", "user02");
			//System.out.println("접속성공");
			//메뉴올 Commit으로 변경 
			con.setAutoCommit(false);
			
			//3.SQL 실행객체 생성 
			PreparedStatement cstmt = 
					con.prepareStatement(
							"{call insert_dept_proc(?,?,?)}");
			cstmt.setInt(1,2);
			cstmt.setString(2, "설계");
			cstmt.setString(3, "독도");
			
			//4.실행
			int rownum = cstmt.executeUpdate();
			//5.결과
			if(rownum>0) {
				
					System.out.println("데이터 삽입성공!");
			}else {
				System.out.println("데이터 삽입실패!");
			}
			
			//6.사용이 끝난 객체 정리 

			cstmt.close();
			con.commit();
			con.close();
		} catch (Exception e) {
			//예외메세지 빨간색으로 출력
			System.out.println(e.getMessage());
		}

	}

}
