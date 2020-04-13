package javaapp0409;

public class if1 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		// 점수 입력받기
		System.out.print("점수를 입력하세요:");
		int a = sc.nextInt();
		// 입력받기위한 문장
		// System.out.println("a:"+a);

		// 점수를 입력받아 a가 60점 이상이면 합격

		if (a >= 60)
		{
			System.out.println("합격입니다");
		} 
		else if (a < 60){
			System.out.println("불합격입니다");
		}
		

		// 입력객체 닫기
		sc.close();

		
		
	}

}
