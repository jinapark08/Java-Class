package javaapp0409;

public class if6 {

	public static void main(String[] args) {
		// 아이디가 jina이고 비밀번호가 cong이면 로그인 성공
		// 아이디가 jina이고 비밀번호가cong이 아니면 잘못된 비밀번호 
		// 아이디가 jina가 jina가 아니면 없는 아이디라고 출력 
		
		java.util.Scanner sc =
				new java.util.Scanner (System.in); 		
		//아이디와 비밀번호를 입력하는 부분 
		System.out.print("아이디:");
		String id = sc.nextLine();
		//아이디를 입력
		System.out.print("비밀번호:");
		String pw = sc.nextLine();
		//비밀번호를 입력
		
		
		if (!id.equals("jina")){
			System.out.println("아이디없음"); 
		}
		else if (pw.equals("cong")) {
			System.out.println("로그인성공");
		}
		else { 
			System.out.println("잘못된비밀번호");
		}
	}

}
