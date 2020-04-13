package javaapp0410;

public class dowhile02 {

	public static void main(String[] args) {
		// 배열의 데이터 합계를 구해서 출력하고 평균을 소수 2째자리에서 반올림 해서 소수 1째자리까지 출력

		// 30->ar[0], 40->ar[1], 20->ar[2], 17->ar[3], 76->ar[4], 60->ar[5]

		// 배열의 합계 구하기
		int[] ar = { 30, 40, 20, 17, 76, 62 };

		int idx = 0;
		int sum = 0;

		do {

			sum = sum + ar[idx];
			idx = idx + 1;
		} while (idx < 6);
		System.out.println("합계:" + sum);

		// 평균 구하기 > 소수까지 나오도록 계산
		// 나누는 수를 실수로 해서 소수가 나오도록 계산 
		
		double avg = sum/6.0;
		System.out.println("평균:"+avg);
		
		//직접 반올림을 구현하고자 할 때는 
		//반올림 할 자리를 소수 첫째 자리로 보내고 0.5를 더합니다.
		//위 숫자를 정수로 변환해서 소수를 버립니다.
		//원래 숫자 형태로 변환하기 위해서 소수 첫째자리로 보내는 연산의 반대를 수행
		
		//반올림 할 자리를 소수 첫째자리로 보내고 +0.5
		avg = avg*10+0.5; 
		//정수로 변환해서 소수를 버림
		avg = (int)avg; 
		//반대작업 수행
		avg = avg/10;
		
		System.out.println("평균:"+avg);
		
		
		
		}
		
		
		
	}


