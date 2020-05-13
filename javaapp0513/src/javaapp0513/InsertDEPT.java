package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDEPT {

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
							"insert into dept (deptno,dname,loc)"
							+"values(?,?,?)");
			//메뉴얼 커밋으로 변경
			con.setAutoCommit(false);
			pstmt.setInt(1, 66);
			pstmt.setString(2, "회계");
			pstmt.setString(3, "평택");
			
			//4.SQL
			int rownum = pstmt.executeUpdate();
			//5.결과
			//rollback을 사용하는 경우 작업취소이기 때문에 테이터 삽입성공이라고 출력되나
			//데이터는 저장되지 않습니다. 
			if(rownum>=1) {
				System.out.println("데이터 삽입성공");
				
			}else {
				System.out.println("데이터 삽입실패");
			}
			//6.사용이 끝난 객체 정리 
			pstmt.close();
			con.close();
		} catch (Exception e) {
			//예외메세지 빨간색으로 출력
			System.out.println(e.getMessage());
		}

	}

}
