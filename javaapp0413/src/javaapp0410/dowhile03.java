package javaapp0410;

public class dowhile03 {

	public static void main(String[] args) {
		// 배열의 데이터 합계를 구해서 출력하고 평균을 십의자리까지 반올림

		// 700->ar[0], 600->ar[1], 500->ar[2], 430->ar[3]

		int[] ar = { 700, 600, 500, 430 };

		int idx = 0;
		int sum = 0;

		do {
			sum = sum + ar[idx];
			idx = idx + 1;

		} while (idx < 4);
		System.out.println("합계:" + sum);

		// 평균 구하기 - 합계 나누기 개수 
		int avg = sum / 4;

		System.out.println("평균:" + avg);
		
		// 반올림할 자리를 소수 첫째자리로 보내고 
		//5.57
		double imsi = avg/100.0;
        
		//0.5를 더해 소수릴 버림
		//6.0
		imsi = (int)(imsi + 0.5) ;
		
		//원래자리로 되돌리는 연산을 수행
		avg = (int)imsi*100;

		
		System.out.println("평균:" + imsi);
		
		
		
		

	}

}
