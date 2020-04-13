package javaapp0413;

import java.util.Scanner;

public class toggle01 {

	public static void main(String[] args) {
		// toggle (교번) -2개의 상태를 번갈아가며 변경
		// 2로 나눈 나머지를 이용해도 되고
		// 변수를 하나 만들어거 변수의 상태변화를 이용하기도 합니다.

		// Enter를 누를 때 마다 ON 과 OFF를 수행하는 처리
		Scanner sc = new Scanner(System.in);

		/*
		 * int idx = 0; 
		 * while (true) { 
		 * System.out.println("Enter를 누르세요:");
		 * sc.nextLine(); 
		 * if (idx % 2 == 0) 
		 * { System.out.println("ON");
		 * 
		 * } else { 
		 * System.out.println("OFF");
		 * 
		 * } 
		 * idx = idx + 1;
		 * 
		 * 
		 * // boolean을 이용하여 출력
		 * 
		 * 
		 * boolean flag = false; 
		 * while (true) { 
		 * System.out.println("Enter를 누르세요:");
		 * sc.nextLine(); 
		 * if (flag == false) {
		 *  System.out.println("ON");
		 * 
		 * } else { 
		 * System.out.println("OFF");
		 * 
		 * }
		 *  flag =!flag;
		 * 
		 * }
		 * 
		 * 
		 * // int를 이용하여 출력 1
		 * 
		 * int flag = 0; 
		 * while (true) { 
		 * System.out.println("Enter를 누르세요:");
		 * sc.nextLine(); 
		 * if (flag == 0) { 
		 * System.out.println("ON");
		 * 
		 * } else { 
		 * System.out.println("OFF");
		 * 
		 * } if (flag == 0) { 
		 * flag =1;
		 * 
		 * } else { 
		 * flag =0; }
		 */

		// int를 이용하여 출력 2
		int flag = 1;
		while (true) {
			System.out.println("Enter를 누르세요:");
			sc.nextLine();
			if (flag > 0) {
				System.out.println("ON");

			} else {
				System.out.println("OFF");

			}
			flag = -flag;
			// 최대한 이해가 쉽게 만드는 것이 좋습니다.
            //toggle은 뒤집는거지 바꾸는게 아니여!
		}

	}

}
