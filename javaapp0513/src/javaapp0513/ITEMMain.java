package javaapp0513;


import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class ITEMMain {
	//static초기화 
	static {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//System.out.println("드라이버 클래스 로드 성공");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//키보드로 부터 입력받기 위한 인스턴스 생성 
		Scanner sc = new Scanner (System.in);
		//ITEMDAO 인스턴스 생성 
		ITEMDAO dao = ITEMDAO.sharedInstance();
		
		mainloop : while (true) { 
			System.out.println("메뉴입력(1.전체데이터보기 2.코드로 데이터조회하기 3.데이터삽입"
					+ "4.데이터수정 5.데이터삭제 6.이름이나 원산지로 조회 7.종료 )");
			String menu = sc.nextLine();
			//switch구문 내에서 사용할 수문 
			List<ITEM> list = null;
			ITEM item = null;
			int result =-1;
			String code = null;
			
		switch (menu) {
		case "1":
			//전체데이터 가져오는 메소드 호출 
			List<Map<String, Object>> maplist = dao.allITEM();
			//list 순회하면서 출력하기 
			for (Map t : maplist) {
					Set<String>Keyset = t.keySet();
					for (String key: Keyset) {
						System.out.println(t.get(key)+"\t");
					}System.out.println();
					
				//System.out.println(t.get("code")+":"+
			                      // t.get("name")+"/"+
						          // t.get("country"));
			}

			//System.out.println("전체데이터 출력");
			break; 
		case "2":
			//코드 1개 입력받기 
			System.out.println("조회할 코드 입력:");
			code = sc.nextLine();
			//dao호출하기 
			ITEM item1 = dao.getITEM(code);
			if ( item1 == null ) {
				System.out.println("코드에 해당하는 데이터 없음.");
			}
			else {
				System.out.println(item1);
			}
			break;
		case "3":
			System.out.println("삽입할 코드 입력:");
			code = sc.nextLine();
			item = dao.getITEM(code);
			if (item == null) {
				//나머지데이터입력
				System.out.println("이름입력:");
				String name = sc.nextLine();
				System.out.println("원산지입력:");
				String country = sc.nextLine();
				System.out.println("단위입력:");
				String unit = sc.nextLine();
				System.out.println("가격입력:");
				int price = sc.nextInt();
				Date receivedate = new Date(System.currentTimeMillis());
				
				//삽입할 데이터 생성 
				item=new ITEM();
				item.setCode(code);
				item.setName(name);
				item.setCountry(country);
				item.setUnit(unit);
				item.setPrice(price);
				item.setReceivedate(receivedate);
				
				//sql 실행
				result = dao.insertITEM(item);
				if (result >0) {
					System.out.println("데이터 삽입 성공");
				}else {
					System.out.println("데이터 삽입 실패 ");
				}
				
			}
			break;
		case"4":
			while (true) {
				System.out.println("수정할 코드 입력:");
				code = sc.nextLine();
				
				item =dao.getITEM(code);
				//데이터가 존재하는 경우 
				if (item != null) {
					//수정할 이름
				    System.out.println("수정할 이름:");
				    String name = sc.nextLine();
				    item.setName(name);
				    
				    //수정할 원산지 
				    System.out.println("수정할 원산지:");
				    String country = sc.nextLine();
				    item.setCountry(country);
				    
				    //수정할 단위 
				    System.out.println("수정할 단위:");
				    String unit = sc.nextLine();
				    item.setUnit(unit);
				    
				    //수정할 가격
				    //숫자데이터는 되도록이면 문자열로 받은 후 
				    //정수로 변환하는 것을 권장 
				    System.out.println("수정할 가격:");
				    String imsi = sc.nextLine();
				    item.setPrice(Integer.parseInt(imsi));
				    
		
				    System.out.println(item);
				    result = dao.updateITEM(item);
				    if (result >0) {
						System.out.println("데이터 수정 성공");
					}else if (result ==0){
						System.out.println("조건에 맞는 데이터없음");
					}
				   
				    else {
						System.out.println("데이터 수정 실패 ");
					}
				    
					break;
				}else {
					System.out.println("수정할 수 없는코드입니다.");
				}
			}

			break;
			
		case"5":
			System.out.println("삭제할 코드입력:");
			code = sc.nextLine();
			item =dao.getITEM(code);
			if(item == null) {
				System.out.println("없는 코드입니다.");
			}else {
				//대화상자를 출력해서 묻기 
				int r = JOptionPane.showConfirmDialog
						(null, "정말로삭제", "삭제", JOptionPane.YES_NO_OPTION);
				//System.out.println(r);
					if(r == JOptionPane.YES_OPTION) {
						//데이터삭제
						result = dao.deleteITEM(code);
						if(result > 0) {
							JOptionPane.showConfirmDialog(null, "삭제성공");
						}
					}
				}

			break;
		case "6":
			System.out.println("이름이나 원산지를 입력:");
			String word = sc.nextLine();
			
			//데이터베이스 처리메소드 호출 
			List <ITEM> ar = dao.search(word);
			for (ITEM g:ar) {
				System.out.println(g);
			}
			break;

			case "7":
				System.out.println("프로그램 종료");
				
				break mainloop;
				default : 
					System.out.println("잘못된 메뉴를 입력하셨습니다.");
					break; 
		}
		}
		//사용이 끝나면 키보드 연결해제
        sc.close();
	}

}
