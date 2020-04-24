package javaapp0424;

public class ArrayMain {

	public static void main(String[] args) {
		String[] data = { "3000", "2000", "-", "4500" };
		// 위의 4개를 정수로 변환하여 합계
		// 합계를 저장할 변수
		int sum = 0;
		for (String temp : data) {
			try {
			// 문자열을 정수로 변환해서 sum에 더하기
			sum = sum + Integer.parseInt(temp);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		// 출력할 메세지를 만들어 출력
		String msg = String.format("합계:%d", sum);
		System.out.println(msg);

	}

}
