package javaapp0417;

public class MethodMain {

	public static void main(String[] args) {
		// MethodClass의
		// static void callByValue ( int )
		// 메소드 호출해서 사용
		// static이 붙으면 인스턴스 생성필요 없음
		// 매개변수는 int>>정수 한개
		// return 타입은 void
		int n = 10;
		MethodClass.callByValue(1);
		// MethodClass.callByValue(정수);
		System.out.println("n:" + n);

		int[] xr = { 30, 20, 25 };
		// 메소드에게 배열을 넘겨주었습니다.
		// 배열의 내용이 변경되었을 수도 있습니다.
		MethodClass.callByReference(xr);
		System.out.println("xr[0]:" + xr[0]);

		//MethodClass의 
		//int sum1(int) 메소드 호출 
		
		MethodClass obj = new MethodClass(); 
		//리턴타입이 정수이므로 결과를 정수 변수에 저장 
		//int result = obj.sum1(100);
		//결과를 출력 
		//System.out.println("합계:"+result); 
		
		//재귀는 메소드의 수행이 종료되기 전에 
		//다시 메소드를 호출하기 때문에 
		//메모리를 많이 사용해서 메모리 부족이 일어남 
	    //int result = obj.sum2(1000000);
		System.out.println("합계:"+obj.sum2(1000000)); 
	}
	
	
	
}

