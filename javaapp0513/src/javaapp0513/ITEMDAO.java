package javaapp0513;

import java.awt.List;
import java.util.ArrayList;

//데이터베이스 연동메소드를 소유한 클래스 
public class ITEMDAO {
	//싱글톤 패턴 디자인 - 객체를 1개만 생성할 수 있도록 만든 패턴
	//외부에서 생성할 수 없도록 생성자를 private로
	private ITEMDAO() {}
	//만들어진 객체의 참조를 저장하기 위함 변수 
	private static ITEMDAO itemDAO = null; 
	//객체가 없으면 만들어서 리턴하고, 있으면 있는 것을 리턴하도록 하는 객체사용을 위한 메소드 
	public static ITEMDAO  sharedInstance() {
		if(itemDAO == null) {
			itemDAO = new ITEMDAO();
		}
		return itemDAO;
	}
	//여러개의 데이터를 가져오는 메소드 
	//public 리턴타입 메소드이름(매개변수) 
	//select * from ITEM , where절이 없으면 매개변수 생략
	//List를 리턴할 때는 인스턴스를 만들고 데이터를 추가한 후 리턴 
	//여러개의 데이터를 가져올 때는 데이터가 없는경우 size가 0 -중요!
	public List<ITEM> allITEM() {
		List<ITEM> list = new ArrayList<ITEM>();
		
		return list; 
	}
	//code를 가지고 데이터를 찾아오는 메소드 
	//code는 기본키 
	//select * from ITEM where code =?
	//하나의 행만 리턴하는 경우에는 데이터가 없으면 null을 리턴 -중요! 
	public ITEM getITEM(String code){
		ITEM item =null;
		return item; 
	}
	//데이테를 삽입하는 메소드 
	//삽입이나 수정은 매개변수가 DTO아니면 MAP
	//-1이 리턴되면 실패 
	//0이 리턴되면 조건에 맞는 데이터가 없음 
	//양수가 리턴되면 작업을 수행 
	public int insertITEM(ITEM item) {
		int result = -1;
		return result;
	}
	//데이터를 수정하는 메소드 
	//십입하는 메소드와 동일한 모양
	public int updateITEM(ITEM item) {
		int result = -1;
		return result;
	}
	//데이터를 삭제하는 메소드 
	//삭제는 대부분의 경우 기본키만으로 수행 
	public int deleteITEM(String code) {
		int result = -1;
		return result;
	}
}
