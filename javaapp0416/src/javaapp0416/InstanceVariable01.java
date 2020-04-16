package javaapp0416;

public class InstanceVariable01 {

	public static void main(String[] args) {
		//메인 메소드에 다른것 만들면 안됩니다. 오직 실행만 합니다. 
		// Student01 클래스의 인스턴스를 생성
		//클래스이름 변수명 = new 클래스 이름 ();
		Student01 obj1 = new Student01 (); 
		
		obj1.num =1; 
		obj1.name = "박진아";
		
		//다른 인스턴스 생성 
		Student01 obj2 = new Student01 (); 
		
		obj2.num =2; 
		obj2.name = "콩이";
		
		//클래스안에 static없이 
		//
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
		

	}

}
