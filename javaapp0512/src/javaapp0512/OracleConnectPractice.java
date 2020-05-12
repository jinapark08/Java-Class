package javaapp0512;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleConnectPractice {

	public static void main(String[] args) {
		// 오라클 드라이버 클래스 로드
		// 예외가 발생하면 오라클 드라이버 파일의 프로젝트의 build path에 추가하지 않았거나
		// 드라이버 클래스 이름이 틀린것임
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 클래스 로드 성공");
			// 데이터베이스 접속
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe", "user02", "user02");
			PreparedStatement pstmt = con.prepareStatement(
					"INSERT INTO SIGNUP(" + "NUM,COMPANY,CONTENT,DETAIL,COMPANYPHONE,ADDRESS,NAME,SAMPLE,CONSTRUCT) "
							+ "VALUES (?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, 1);
			pstmt.setString(2, "성안디앤씨");
			pstmt.setString(3, "PAINT");
			pstmt.setString(4, "스페셜페인트");
			pstmt.setString(5, "025086611");
			pstmt.setString(6, "서울 강남구 학동로20길124");
			pstmt.setString(7, "양성환과장");
			pstmt.setString(8, "Y");
			pstmt.setString(9, "Y");
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("삽입성공");
				// 데이터베이스 접속해제
			} else {
				System.out.println("삽입실패");
			}

			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println("접속실패");
			System.err.println(e.getMessage());C
		}

	}

}
