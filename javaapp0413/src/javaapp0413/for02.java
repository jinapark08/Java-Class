package javaapp0413;

public class for02 {

	public static void main(String[] args) {
		// 연습문제
		// System.out.print("*");
		// System.out.print("\n");
		// *****엔터 //*을 한개씩 줄여가기
		// *
		// ***
		// ****

		/*
		 * for (int b = 0; b <= 5; b = b + 1) { 
		 * // b<=4 b는 4와 같거나 작은 수 까지 로 변환해도 같은 값 출력
		 * for (int a = 0; a < b+1; a = a + 1) 
		 * { // a<=b a는 b와 같거나 작은 수
		 * System.out.print("*");
		 * 
		 * } System.out.print("\n");
		 * 
		 * 
		 * // 연습문제 // System.out.print("*"); 
		 * // System.out.print("\n"); 
		 * // *****엔터 //**을 두개씩 늘려가기 
		 * // * 
		 * // *** 
		 * // *****
		 * 
		 * 
		 * for (int c = 0; c <= 4; c = c + 1) { 
		 * for (int d = 0; d <= 2 * c; d = d + 1) {
		 * System.out.print("*");
		 * 
		 * } System.out.print("\n");
		 * 
		 * 
		 * // ***** 
		 * // **** 
		 * // *** 
		 * for (int c = 0; c <= 4; c = c + 1) { 
		 * for (int d = 0; d <= 4 - c; d = d + 1) {
		 *  System.out.print("*");
		 * } 
		 * System.out.print("\n");
		

		// *********
		// *******
		// *****
		/*for (int c = 0; c <= 8; c = c + 1) {
			for (int d = 0; d <= -2 * c + 8; d = d + 1) {
				System.out.print("*");

			}
			System.out.print("\n");

		}*/
		
		for(int e=0; e<=4; e=e+1) {
			if (e<-2) {
				System.out.print("*");
				
			}else {
				System.out.print("*");
				
			}
		   System.out.print("\n");
		}

	}
}
