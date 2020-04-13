package javaapp0409;

public class if2 {

	public static void main(String[] args) {
		//정수 1개를 입력받아서 
		//입력받은 정수가 짝수이면 짝수 
		//그렇지 않으면 홀수라고 출력
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 정수 입력받기
		System.out.print("score:");
		int score = sc.nextInt();
		// 입력받기위한 문장
		// System.out.println("score:"+score);

		// 입력받은 정수가 짝수인지 확인  
		
			
			if(score % 2 == 0) {
			System.out.println("짝수");
	}
			else if (score % 2 != 0) {
		System.out.println("홀수");
	}
		// 입력객체 닫기
		sc.close();

	}

}
