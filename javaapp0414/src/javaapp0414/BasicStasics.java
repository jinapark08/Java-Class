package javaapp0414;

public class BasicStasics {

	public static void main(String[] args) {
		// 60이 넘는 데이터의 합계, 개수, 평균을 구하기
		// 평균은 소수 첫째자리에서 반올림 해서 정수로 저장

		int[] data = { 68, 88, 35, 28, 84, 78 };

		int len = data.length;
		// 합계를 저장할 변수 생성

		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < len; i = i + 1) {
			// 60 이상인 경우에
			if (data[i] >= 60) {
				// 합계구하기
				sum = sum + data[i];
				// 개수 구하기
				cnt = cnt + 1;

			}
		}
		System.out.println("합계:" + sum);
		System.out.println("개수:" + cnt);
		
		//평균을 소수 첫째자리에서 반올림 해서 정수로 출력

        int avg = 0;
        
        if (cnt == 0 ) {
        	System.out.println("잘못된 입력입니다.");
        	
        	
        }else {
        	avg = (int)((double)sum/cnt +0.5);
        	
        }
        System.out.println("평균:"+avg);
        
        //최대 최소 구하기
        //데이터가 0에서 100사이라고 가정한경우 
        //int max = 0;
        //int min = 100; 
        //데이터의 범위를 모르는경우 - 첫번째 데이터로 초기화
        int max = data[0];
        int min = data[0];
        
        for (int i=0; i<len;i=i+1) { 
        	//최대값 구하기 
        	
        	if (max>=data[i]) { 
        }
	}

	}
	
}

        
        
