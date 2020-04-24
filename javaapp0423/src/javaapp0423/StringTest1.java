package javaapp0423;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		// 문자열 인스턴스 생성 -리터럴을 직접입력해서 생성
		String str = "JinaZzang!93";
		// 문자열의 길이(length)를 출력
		int len = str.length();
		System.out.println("길이는" + len);

		// 문자열 안에서 특정한 위치의 문자를 출력
		// char charAt(int idx)
		char a = str.charAt(2);
		System.out.println("2번째 데이터:" + a);

		// str에 있는 모든 문자를 순서대로 출력
		// charAT과 length를 사용해서
		// 대문자 개수를 저장할 변수 생성
		int big = 0;
		int sm = 0;
		int su = 0;
		int etc = 0;

		for (int i = 0; i < len; i++) {
			char a1 = str.charAt(i);

			// 대문자 확인
			if (a1 >= 'A' && a1 <= 'Z') {
				big = big + 1;
			}
			// 소문자 확인
			else if (a1 >= 'a' && a1 <= 'z') {
				sm++;
			}
			// 숫자 확인
			else if (a1 >= '0' && a1 <= '9') {
				su++;
			}
			// 특수문자 확인
			else {
				etc++;
			}
		}
		System.out.println("대문자개수는" + big + "개");
		System.out.println("소문자개수는" + sm + "개");
		System.out.println("숫자 개수는" + su + "개");
		System.out.println("특수문자 개수는" + etc + "개");

		// 영문 대문자, 소문자, 숫자,특수문자가 1개 이상있으면 사용 가능한 비밀번호
		// 4가지 중 한가지라도 없으면 사용불가

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("비밀번호를 입력해주세요: ");
				String a3 = sc.nextLine();

				// if (big>0 && sm>0 &&su>0&&etc>0) {
				if (big * sm * su * etc != 0) {
					System.out.println("사용 가능한 비밀번호입니다");
					break;
					
				}
			catch (Exception e) {
				int num = Integer.parseInt(a3);
					System.out.println("사용 불가능한 비밀번호입니다");
				}
				

			}

		}
}

		/*String b1 = "ios";
		String b2 = "iOS";
		String b3 = "Window";

		System.out.println(b1.toUpperCase().equals("IOS"));
		System.out.println(b2.toUpperCase().equals("IOS"));
		System.out.println(b3.toUpperCase().equals("iOS"));*/

