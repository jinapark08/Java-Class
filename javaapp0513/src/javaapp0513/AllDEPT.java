package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AllDEPT {

	public static void main(String[] args) {
		try {
			// 1.드라이버클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.데이터베이스 연결
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@192.168.0.200:1521:xe", 
							"user02", "user02");
			//System.out.println("접속성공");
			//3.SQL 실행객체 생성 
			PreparedStatement pstmt = 
					con.prepareStatement(
							"select  deptno, dname, loc"
							+  " from  dept");
			//4.SQL
			ResultSet rs = pstmt.executeQuery();
			//5.결과
			if(rs.next()) {
				do {
					int deptno = rs.getInt("deptno");
					String dname =rs.getString("dname");
					String loc =rs.getString("loc");
					System.out.println(deptno + "\t"+ dname + "\t" + loc);
				}while(rs.next());
				System.out.println("조회된 데이터 있음");
			}else {
				System.out.println("조회된 데이터 없음");
			}
			
			//6.사용이 끝난 객체 정리 
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			//예외메세지 빨간색으로 출력
			System.out.println(e.getMessage());
		}

	}

}
