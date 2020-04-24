package javaapp0423;

public class StringTest2 {

	public static void main(String[] args) {
		// 문자열분할
		// substring은 위치를 가지고 분할
		String msg = "HiJava";
		// 2번째 부터 끝까지 문자열을 분할
		System.out.println(msg.substring(2));
		// 2번째 부터 4번째까지 문자열을 분할
		System.out.println(msg.substring(2, 5));

		// 응용1
		String contextPath = "http://localhost:9000";
		String uriString = "http://localhost:9000/index.jsp";

		// uriString에서 contextpath 를 제외한 부분 출력
		// 잘라낼 글자 수 만들기
		int len = contextPath.length();
		// 잘라내기
		String result = uriString.substring(len);
		System.out.println(result);

		// split은 패턴을 가지고 분할
		String data = "10000,-,5600,4300,3700";
		// 위의 문자열을 ,단위로 분할해서 출력
		String[] ar = data.split(",");
		// ar의 데이터를 순서대로 temp에 하나씩대입

		// 숫자를 정수로 변환해서 합계 구하기
		// 문자열 > 정수 : Integer.parseInt
		int sum = 0;

		for (String temp : ar) {
			try {
				sum = sum + Integer.parseInt(temp);
			} catch (Exception e) {
				
			}{}
		}System.out.println("합계:" + sum);
		
		
		
		String coupang = 
				"0420,10000,0421,20000,0422,-,0423,14000";
		//위의 데이터는 날짜와 매출을 연속적으로 기록한 것임
		//위의 데이터를 가지고 매출의 평균을 구하시오. 
		//-는 매출이 없는 것이 아니라 영업을 하지 않은 경우이므로 
		//제외하고 매출의 평균을 구하시오  
		//1. ,단위로 분할해서 출력
		String []co =coupang.split(",");
		for(int i=0; i<co.length; i++) {
		System.out.println(co[i]);
		//2. 짝수번째 데이터만 출력 
		//3. 짝수번째 데이터의 평균을 구하기 
		
		
	}
	}
}
