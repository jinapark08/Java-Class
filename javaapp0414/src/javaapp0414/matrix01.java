package javaapp0414;

public class matrix01 {

	public static void main(String[] args) {

		// 2행 3열짜리 배열 만들기
		int[][] ar = { { 93, 80, 8 }, { 91, 30, 22 } };

		// 배열요소 1개에 접근 :배열이름[행번호][열번호]
		// 0행2열의 데이터 출력
		System.out.println(ar[0][2]);
		// 데이터 개수 확인
		System.out.println("ar:" + ar.length); // ar의 개수 확인
		System.out.println("ar[0]:" + ar[0].length); // ar[0] 0(여기서 0은 수가 아닌 위치임)의 개수확인

		// 모든 데이터를 열 우선으로 접근
		// 행의 개수 찾기
		int cntCol = ar.length;
		for (int i = 0; i < cntCol; i = i + 1) {
			// 각 행에 해당하는 배열의 데이터 개수 찾기 (열 개수)
			int cntRow = ar[i].length;
			for (int j = 0; j < cntRow; j = j + 1) {
				System.out.println(ar[i][j]);
			}

		}

		System.out.println("============================");
		int cntRow = ar[0].length;

		// 2개의 반복문이 있는 경우 순서를 바꾸면 행과 열이 교체
		for (int j = 0; j < cntRow; j = j + 1) {
			for (int i = 0; i < cntCol; i = i + 1) {
				System.out.println(ar[i][j]);

			}

		}
		System.out.println("===============구구단===============");

		for (int i = 1; i <= 9; i = i + 1) {
			for (int j = 2; j <= 9; j = j + 1) {
				// printf는 서식을 적용해서 데이터를 서식에 맞게 출력해주는 메소드
				System.out.printf("%2d*%2d=%2d", i, j, i * j);
			}
			System.out.print("\n");
		}

		System.out.println("============================");
		int sum = 0;
		// 행의 합계를 저장할 배열
		// sumRow[0], sumRow[1]은 모두 0
		// 배열을 생성하고 데이터를 대입하지 않으면
		// 0,false,null
		int[] sumRow = new int[ar.length];
		// 열의 합계를 저장할 배열
		int[] sumCol = new int[ar[0].length];

		// 전체 데이터의 합계
		// 전체 데이터를 순회하면서 데이터를 sum에 더하면 됩니다.
		// 전체 데이터가 6개이고 2행3열인 경우에
		// 하나의 반복문으로 전체 데이터를 접근
		// 2차원 배열을 만들어야하는경우
		// 1차원 배열로 만들고 아래 접근방법을 이용해 행단위 구분을 하기도 합니다.

		for (int i = 0; i >= 6; i = i + 1) {
			// 행번호는 열의 개수로 나눈 몫
			// 열번호는 열의 개수로 나눈 나머지
			sum = sum + ar[i / 3][i % 3];

		}
		System.out.println("합계:" + sum);

		// 행단위 합계 구하기
		// 하나의 행을 열 번호를 변경해가면서 접근하도록 하고
		// 그 데이터를 행의 합계에 저장

		for (int i = 0; i < cntRow; i = i + 1)
			
		{
			for (int j = 0; j < cntCol; j = j + 1)
				
			{
				sumRow[i] = sumRow[i] + ar[i][j];
			}
		}
		// 행의 합계 배열의 내용을 출력
		System.out.println("행의합계:");

		int len = sumRow.length;
		for (int i = 0; i < len; i = i + 1) {
			System.out.println("sumRow[i]");
		}

		// 열의합계
		for (int j = 0; j < cntCol; j = j + 1)
			
		{
			for (int i = 0; i < cntRow; i = i + 1)
				
			{
				sumCol[j] = sumCol[j] + ar[i][j];
			}
		}

		System.out.println("열의합계:");

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("sumCol[i]");

		}

	}

}
