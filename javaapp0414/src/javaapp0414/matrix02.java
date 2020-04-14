package javaapp0414;

public class matrix02 {

	public static void main(String[] args) {

		int[] ar = new int[20];
		// 1부터 20까지 숫자로 배열의 값을 대입

		for (int i = 0; i < 20; i = i + 1) {
			ar[i] = i + 1;
		}
		
		// 데이터 출력
		
		for (int i = 0; i < 20; i = i + 1) {
			
			System.out.printf("%3d\t",ar[i]);
			// 한 줄에 5개씩 출력할 때 마다 줄 바꿈
			if (i %5 == 4) {
				System.out.print("\n");
			}
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}
}