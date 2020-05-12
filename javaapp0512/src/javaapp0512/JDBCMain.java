package javaapp0512;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCMain {

	public static void main(String[] args) {
		try {
			// 1. 데이터베이스 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.데이터베이스 접속 인스턴스 생성
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe", "user02", "user02");

			//3.SQL실행객체 삭제
			PreparedStatement pstmt = con.prepareStatement
					("delete from signup" + "where num=?");
			
			pstmt.setInt(1,5);
			
			//4.SQL을 실행하고 결과를rownum에 저장 
			//select구문일 때는 executeQuery로 실행하고 ResultSet으로 받음 
			int rownum = pstmt.executeUpdate();
			//5.결과 사용 
			if (rownum >0) {
				System.out.println("삭제성공");
			}else if (rownum==0){
				System.out.println("조건에 맞는 데이터가 없음");
			}else {
				System.out.println("삭제실패");
			}
			
			//6.사용한 인스턴스 연결해제
			pstmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
