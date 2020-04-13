package javaapp0413;

import java.util.Scanner;

public class breakcontinue02 {

	public static void main(String[] args) {
		// 1~45까지의 수를 6번 입력
		// 그 외 수는 잘못된 입력

		Scanner sc = new Scanner(System.in);

		int idx = 1;
		while (idx < 7) {
			System.out.print("1부터 45까지의 숫자입력:");
			int su = sc.nextInt();
            //1보다 작거나 45보다 큰 수 입력 시 
			// 경고 창 생성
			if (su < 1 || su > 45) {
				System.out.print("1부터 45까지의 숫자를 입력하세요!");
				idx = idx - 1;
				continue;

			}
			System.out.println(idx + "번째:" + su);
			idx = idx + 1;
		}
		System.out.println("종료");

		sc.close();

	}
}
