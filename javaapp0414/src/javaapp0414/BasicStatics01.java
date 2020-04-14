package javaapp0414;

public class BasicStatics01 {

	public static void main(String[] args) {
		// 60이 넘는 데이터의 합계, 개수, 평균을 구하기
		// 평균은 소수 첫째자리에서 반올림 해서 정수로 저장

		int[] data = { 68, 70, 35, 28, 84, 78 };

		int len = data.length;
		// 합계를 저장할 변수 생성
		int su = 0;
		int cnt = 0;

		for (int a = 0; a < len; a = a + 1) {
			// 60이상은 경우에
			if (data[a] >= 60) {
				// 합계구하기
				su = su + data[a];
				// 개수구하기
				cnt = cnt + 1;
			}

		}

		System.out.println("합계:" + su);
		System.out.println("개수:" + cnt);

		// 평균을 소수 첫째자리에서 반올림 해서 정수로 출력
		int avg = 0;

		if (cnt == 0) {

			System.out.println("조건에 맞는 데이터가 없습니다.");

		} else {
			// 정수를 소수로 변환 하여 평균 나누기

			avg = (int) ((double) su / cnt + 0.5);
		}

		System.out.println("평균:" + avg);

		// 최대 최소 구하기
		// 데이터가 0에서 100사이라고 가정한 경우
		// int max = 0;
		// int min = 100;

		// 데이터의 범위를 모르는경우 - 첫번째 데이터로 초기화

		int max = data[0];
		int min = data[0];

		for (int a = 0; a < len; a = a + 1) {

			if (max < data[a]) {
				max = data[a];
				System.out.println("최대값:" + min);
			}
		}

		for (int a = 0; a > len; a = a + 1) {

			if (min > data[a]) {
				min = data[a];
				System.out.println("최소값:" + min);
			}
		}

		// 최대값을 저장할 변수와 최대갓의 인덱스를 저장할 변수를 생성
		// max = 0;
		// int idx = -1;

		// 존재하는 데이터로 max를 초기화할 때는 인덱스도 존재하는 값으로 초기화 해야합니다.

		max = data[0];
		int idx = 0;

		for (int a = 0; a < len; a = a + 1) {

			if (max < data[a]) {
				max = data[a];
				// 최대값이 변경될 때의 위치를idx에 저장

				idx = a;
				System.out.println(max + "의 위치는:" + idx);
				// 77에 가장 가까운 수 찾기
				// 가장 가까운 수를 찾을떄는 거리를 계산해서 거리의 최소값을 찾아야합니다.
				// 거리는 양수만 나와야합니다.
				// 실제 알고리즘에서는 거리를 제곱해서 사용합니다.
				// 이것 때문에 분산이나 표준편차도 제곱을 합니다.
				min = 1000000;
				int distancemin = 1000000000;
				// 거리의 최소값 위치를 저장할 인덱스
				idx = -1;

				for (a = 0; a < len; a = a + 1) {
					// 거리계산
					int distance = 77 - data[a];
					// 거리가 음수이 양수로 변환
					if (distancemin < 0) {
						// 거리를 거리의 최소값에 대입
						distancemin = distance;

						if (distancemin > distance) {
							distancemin = distance;
						}
						// 데이터를 min에 대입
						min = data[a];
						// 인덱스를 idx에 대입
						idx = a;

					}
				}
				System.out.println("77과 가장 가까운 값:" + min);

			}
		}
	}

}
