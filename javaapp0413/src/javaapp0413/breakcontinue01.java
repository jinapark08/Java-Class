package javaapp0413;

import java.util.Scanner;

public class breakcontinue01 {

	public static void main(String[] args) {

		// break와 continue의 차이를 알아보자
		for (int i = 0; i <= 10; i = i + 1) {
			if (i % 3 == 0) {
				// 3의 배수를 만나면 반복문이 종료
				// break;
				// 1,2까지 출력

				// 3의 배수만 빼고 반복문 출력
				continue;
				// 1,2, 4,5, 7,8, 10 출력
			}
			System.out.println(i);

		}

		// break 연습문제
		// root가 아닌 데이터를 입력할 때 까지 계속입력받기
		Scanner sc = new Scanner(System.in);

		// 무한반복
		while (true) {
			System.out.print("아이디입력:");
			String id = sc.nextLine();
			if (id.equals("root") == true) {
				break;
			}
		}

		System.out.println("사용 가능한 아이디입니다.");

		// 위의 문제를 반대로 출력
		// root가 맞으면 사용불가 아이디

		// 무한반복
		while (true) {
			System.out.print("아이디입력:");
			String id = sc.nextLine();
			if (id.equals("root") == false) {
				break;
			}

			System.out.println("존재하는 아이디입니다.");

		}
		System.out.println("사용 가능한 아이디입니다.");

		// 스캐너 사용종료
		sc.close();

		

	}

}
