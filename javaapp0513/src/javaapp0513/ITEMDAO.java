package javaapp0513;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//데이터베이스 연동메소드를 소유한 클래스 
public class ITEMDAO {
	// 싱글톤 패턴 디자인 - 객체를 1개만 생성할 수 있도록 만든 패턴
	// 외부에서 생성할 수 없도록 생성자를 private로
	private ITEMDAO() {
	}

	// 만들어진 객체의 참조를 저장하기 위함 변수
	private static ITEMDAO itemDAO = null;

	// 객체가 없으면 만들어서 리턴하고, 있으면 있는 것을 리턴하도록 하는 객체사용을 위한 메소드
	public static ITEMDAO sharedInstance() {
		if (itemDAO == null) {
			itemDAO = new ITEMDAO();
		}
		return itemDAO;
	}

	// 메소드들에서 공통으로 사용할 변수
	private Connection con;
	private PreparedStatement pstmt;

	// 데이터베이스 연결메소드
	private void connect() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.200:1521:xe", "user02", "user02");
		} catch (Exception e) {
			System.err.println("연결실패");
			System.err.println(e.getMessage());
		}
	}

	// 데이터 베이스 연결해제하는 메소드
	private void close() {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.err.println("연결해제실패");
			System.err.println(e.getMessage());
		}
	}

	// 여러개의 데이터를 가져오는 메소드
	// public 리턴타입 메소드이름(매개변수)
	// select * from ITEM , where절이 없으면 매개변수 생략
	// List를 리턴할 때는 인스턴스를 만들고 데이터를 추가한 후 리턴
	// 여러개의 데이터를 가져올 때는 데이터가 없는경우 size가 0 -중요!
	public List<Map<String, Object>> allITEM() {
		// 리턴할 데이터 생성
		// 여러개일때는 생성자를 호출해서 인스턴스를 생성

		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		// 데이터베이스 연결
		connect();
		// sql실행객체 생성
		try {
			pstmt = con.prepareStatement("select * from ITEM");
			// sql실행
			ResultSet rs = pstmt.executeQuery();
			// 데이터가 여러개
			while (rs.next()) {
				// 행단위 작업 수행
				//ITEM imsi = new ITEM();
				Map<String,Object> map = new HashMap<>();
				// code 열의 값을 문자열로 읽어서 imsi에 저장
				//imsi.setCode(rs.getString("code"));
				//imsi.setName(rs.getString("name"));
				//imsi.setCountry(rs.getString("country"));
				//imsi.setUnit(rs.getString("unit"));
				//imsi.setPrice(rs.getInt("price"));
				//imsi.setReceivedate(rs.getDate("receivedate"));
				map.put("코드", rs.getString("code"));
				map.put("name", rs.getString("name"));
				map.put("Country", 
					rs.getString("Country"));
				map.put("price", rs.getInt("price"));
				map.put("receivedate", 
					rs.getDate("receivedate"));
				// list에 삽입
				list.add(map);
			}
		}

		catch (Exception e) {
			System.err.println("SQL 실행에러");
			System.err.println(e.getMessage());
		}
		// 데이터베이스 연결해제
		close();

		return list;
	}

	// code를 가지고 데이터를 찾아오는 메소드
	// code는 기본키
	// select * from ITEM where code =?
	// 하나의 행만 리턴하는 경우에는 데이터가 없으면 null을 리턴 -중요!
	public ITEM getITEM(String code) {
		ITEM item = null;
		
		//데이터베이스 연결 
		connect ();
		//데이터베이스 작업 
		try {
			//sql실행객체 생성 
			//pstmt = con.prepareStatement("﻿select * from ITEM where trim(code)=?");
			pstmt = con.prepareStatement("select * from item where Upper(trim(code)) = ?");
			pstmt.setString(1, code.toUpperCase());
			//sql실행
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				item = new ITEM();
				item.setCode(rs.getString("code"));
				item.setName(rs.getString("name"));
				item.setCountry(rs.getString("country"));
				item.setUnit(rs.getString("unit"));
				item.setPrice(rs.getInt("price"));
				item.setReceivedate(rs.getDate("receivedate"));
				
			}
		} catch (Exception e) {
			System.err.println("상세보기 에러");
			System.err.println(e.getMessage());
		}
		//데이터 연결해제
		close();
		return item;
	}



	

	// 데이테를 삽입하는 메소드
	// 삽입이나 수정은 매개변수가 DTO아니면 MAP
	// -1이 리턴되면 실패
	// 0이 리턴되면 조건에 맞는 데이터가 없음
	// 양수가 리턴되면 작업을 수행
	public int insertITEM(ITEM item) {
		int result = -1;
		//데이터 연결
		connect();
		try {
			pstmt = con.prepareStatement (" insert into item ("
					+ " code,name,country,unit,price,receivedate) values("
					+ "?,?,?,?,?,?)" );
				
			pstmt.setString(1, item.getCode());
			pstmt.setString(2, item.getName());
			pstmt.setString(3, item.getCountry());
			pstmt.setString(4, item.getUnit());
			pstmt.setInt(5, item.getPrice());
			pstmt.setDate(6,item.getReceivedate());
			//실행 
			result = pstmt.executeUpdate();
		}catch(Exception e){
			System.out.println("삽입에러");
			System.out.println(e.getMessage());
		
	}
		close();	
		return result;
	}

	// 데이터를 수정하는 메소드
	// 십입하는 메소드와 동일한 모양
	public int updateITEM(ITEM item) {
		int result = -1;	
		connect();
		try {
			pstmt = con.prepareStatement ( " update item "
					+ " set name = ?, country = ?, unit = ?, price =? "
					+ "where Upper(trim(code)) =? ");
			
			pstmt.setString(1, item.getName());
			pstmt.setString(2, item.getCountry());
			pstmt.setString(3, item.getUnit());
			pstmt.setInt(4, item.getPrice());
			pstmt.setString(5, item.getCode().toUpperCase().trim());
			
			//실행
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("데이터 수정에러");
			System.out.println(e.getMessage());
		}
		close();
		return result;
	}
	

	// 데이터를 삭제하는 메소드
	// 삭제는 대부분의 경우 기본키만으로 수행
	public int deleteITEM(String code) {
		int result = -1;
		connect();
		try {
			pstmt = con.prepareStatement (
					"delete from item"
					+ "where code = ?");
			pstmt.setString(1, code);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("데이터 삭제에러");
			System.out.println(e.getMessage());
		}
		close();
		return result;
	}
	//매개변수가 name이나 country에 포함된 데이터를 조회하는 메소드 
	//list, dto 나 map,Scala(기본형,String,Date)
	public List <ITEM> search(String word){
		//List를 생성해서 리턴 
		List<ITEM> list = new ArrayList<ITEM>();
		connect();
		
		try {
			//대소문자 구분을 하지않는 검색은 
			//sql에서도 대문자나 소문자로 바꾸고 
			//언어에서의 문자열도  변경해야해
		
			pstmt = con.prepareStatement (
					"select* from item where Upper(name) like ? or Upper(country) like ?");
			pstmt.setString(1, "%" + word.toUpperCase() + "%");
			pstmt.setString(2, "%" + word.toUpperCase() + "%");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ITEM item = new ITEM ();
				
				item.setCode(rs.getString("code"));
				item.setName(rs.getString("name"));
				item.setCountry(rs.getString("country"));
				item.setUnit(rs.getString("unit"));
				item.setPrice(rs.getInt("price"));
				item.setReceivedate(rs.getDate("receivedate"));
				
				list.add(item);
				
			}
			
			rs.close();
		} catch (Exception e) {
			System.out.println("데이터검색오류");
			System.out.println(e.getMessage());
		}
		
		
		close();
		return list; 
		
		
		
		
		
		
		
		
		
		
}
}
