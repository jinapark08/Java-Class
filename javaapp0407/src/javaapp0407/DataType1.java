package javaapp0407;

public class DataType1 {

	public static void main(String[] args) {
		//나이를 Main Memory에 저장 
		int age = 28; 
		//키를저장 - 키는 소수 첫째자리까지 저장 
		double height = 165.5; 
		//어떤 변수에 true를 저장 
		//boolean은 다른 것과 구분하기 위해서 
		//이름앞에 is를 붙이는 것을 권장
		boolean isPass = true; 
		
		//하나의 영역 ({}) 안에서 동일한 이름의 
		//변수를 2번 만들면 안됩니다.
		//int age= 27;
		
		age = 27; //age에 27를 대입
		
		//age의 값을 출력
		System.out.println("나이는" + age + "세");
		
		//캐릭터는 숫자를 저장하고 있다가
		//출력할 때만 숫자에 해당하는 문자를 출력
		char ch = 65;
		int i = 65;
		System.out.println(ch);
		System.out.println(i);
		
		//22억 이상의 정수는 long 형으로 표현 
		long n = 2200000000L;
		

		//final이 붙은 변수는 데이터를 수정할 수 없습니다. 
		//이름은 모두 대문자로 만다는 것을 권장 
		//final int AGE 27; 
		//이문장은 에러 
		//AGE=27
		
		//수정 가능한 데이터 
		int balance = 1000;
		//수정 불가능한 데이터 
		final int readOnly = balance;
		
	    //작은 크기의 자료형 데이터는 큰 자료형에 대입 가능
		double d = readOnly;
		
		//큰 크기의 자료형 데이터를
		//작은 자료형에 대입하는 것은 안됨 
		//int i = 3.14; // 실수는 정수변수에 대입안됨 
		
		//byet변수 2개 생성 
		
		byte b1 = 10;
		byte b2 = 13;
		
		//이 문장은 에러 
		//int보다 작은 데이터는 int로 변환해서 연산
		//b1과 b2를 int로 변환해서 연산했디 때문에 
		//결과도 int가 됩니다. 
		//int는 byte에 저장불가
		//byte result = b1+b2; 
		int result = b1 + b2;
		//int / int = int
		result = 10 / 3;
		System.out.println("result:"+result);
        //double/int 는 int를 doubl로 변경해서 실행
		//결과가 3.333333
		System.out.println("result:"+(10.0/3));		
		
		//20.7을 강제로 정수로 변환해서 x에 저장
		//소수가 버려지므로 20이 저장
		int x = (int)20.7;
		System.out.println("x:"+x);
		
		byte b5 = 10;
		byte b6 = 13;
		//덧셈한 결과를 byte에 저장
		//강제 형 변환을 이용해서 해결
		//byte b7 = b5+b6 ; 
		//byte b7 = (byte)b5+(byte)b6; > 틀린 연산 
		
		byte b7 = (byte)(b5+b6);
		//식이 아닌 결과를 바꾸어 바이트로 강제변환 
		
		double d = (double) 10 / 3;
		System.out.println("d:"+d)
		// 원하는 결과가 3.333이기 때문에 식을 더블로 강제변환 
		
		
		
		
		
		
		
		
		

	}

}
