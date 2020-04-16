package javaapp0416;

public class InstanceMain {
	
    int n; // Instance Variable (인스턴스 변수)
           //인스턴스 변수는 자동 초기화 가능 숫자 데이터는 0 
	
 
	public static void main(String[] args) {
		// Student 클래스의 인스턴트 만들기
		//new를 이용해서 생성자를 호출하면 인스턴스가 생성
		//인스턴스를 다른 곳에서 사용하기 위해서 참조를 obj에 대입합니다.
		
		Student01 obj = new Student01(); 
		//int n; // 사용불가 지역변수는 자동 초기화 불가 
		//System.out.println(n);


	}

}
