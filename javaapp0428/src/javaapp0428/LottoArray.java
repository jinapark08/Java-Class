package javaapp0428;

import java.util.Arrays;
import java.util.Scanner;

public class LottoArray {

	public static void main(String[] args) {

		// lotto 만들기!
		// 1부터 45까지의 숫자를 중복되지않게 6개 입력받아서
		// 오름차순 정렬해서 출력

		// ArrayList를 사용해도 되지만 배열로 할거야
		int[] lotto = new int[6];
		// ArrayList <Integer> lotto = new ArrayList<>();

		// 콘솔로부터 입력을 받을 수 있는 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 데이터 개수저장
		int num = lotto.length;
		// int num = lotto.num();

		// 6개의 숫자 입력받기
		for (int i = 0; i < num; i++) {
			// 문자로 입력 시 오류를 알리기 위한 예외처리 try-catch
			try {
				// 정수 입력받기
				System.out.println("정수입력:");
				// 문자 입력 시 오류가 나지않게 정수로 변환
				String input = sc.nextLine();
				lotto[i] = Integer.parseInt(input);
				// iotto.add (Itnteger.parseInt(input));

				// 1부터 45숫자가 아니면 무효
				if (lotto[i] < 1 || lotto[i] > 45) {
					System.out.println("1부터 45까지의수만 입력하세요.");
					// 무효화
					i = i - 1;
					// 1부터 45사이의 숫자가 아니면 중복체크를 하지 않도록 다음 반복문으로 이동
					continue;
				}
				// 중복체크
				boolean flag = false;
				for (int j = 0; j <= i - 1; j++) {
					// 동일한 데이터를 만나면 반복문 종료
					if (lotto[i] == lotto[j]) {
						flag = true;
						break;

					}
				}
				if (flag == true) {
					System.out.println("중복된 숫자입니다.");
					i = i - 1;
				}

				// 문자 입력시 정수를 입력하세요 라고 출력
			} catch (Exception e) {
				System.out.println("정수를 입력하세요!");
				// 문자 입력 시 6번에 포함되지않게 무효화
				i = i - 1;
			}

		}
		/*
		// 삽입정렬
		// 2번째 데이터부터 마지막 데이터까지
		for (int i = 0; i < num; i++) {
			// 현재 데이터를 임시변수에 복사
			int standard = lotto[i];
			int j = i - 1;
			for (; j >= 0; j++) {
				
				
				if (standard < lotto[j]) {
					// 비교하는 데이터가 클 때는 비교하는 데이터를 다음자리로 이동
					lotto[j + 1] = lotto[j];
					// 비교하는 데이터가 작거나 같으면 반복문 중단
				} else {
					break;
				}
			}
			// 앞쪽의 데이터와 비교가 끝나면 기준데이터를 비교가 끝난 다음자리에 복사
			lotto[j + 1] = standard;
		} */
		
		//정렬하는 메소드를 호출 
		Arrays.parallelSort(lotto);

		// 배열의 데이터를 출력
		for (int imsi : lotto) {
			System.out.printf(imsi + "\t");
		}

		sc.close();

	}
}
