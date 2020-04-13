package javaapp0409;

public class if3 {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력받고 
		// 아이디가 jina이고
		// 비밀번호가 cong이라면 로그인 성공이라고 출력
		// 그렇지 않으면 없는 아이디거나 
		// 잘못된 비밀번호라고 출력
		
		//아이디와 비밀번호 입력받는 부분과 비교하는 부분으로 나누어서 처리 
		java.util.Scanner sc =
				new java.util.Scanner (System.in); 		
		
		System.out.print("아이디:");
		String id = sc.nextLine();
		//아이디를 입력
		System.out.print("비밀번호:");
		String pw = sc.nextLine();
		//비밀번호를 입력
		
		//id가 jina인지 pw가 cong인지 비교
		
		if (id.equals("jina") && pw.equals("cong")) { 
			System.out.println("로그인 성공"); 
		}else {
			System.out.println("로그인 실패"); 
		}
		//입력객체 닫기
	   sc.close();
		

	}

}
