package javaapp0416;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone클래스의 인스턴스를 생성
	    //Phone01 인스턴스 = new phone ();
	   Phone01 obj1 = new Phone01 ();
	   obj1.setNum(1);
	   obj1.setName("지나");
	   obj1.setPhoneNumber("01012345678");
	   obj1.setEmail("jina@cong.com");
	   //name을 가져와 출력 
	   System.out.println("번호:"+obj1.getNum()); 
	   System.out.println("이름:"+obj1.getName()); 
	   System.out.println("전화번호:"+obj1.getPhoneNumber()); 
	   System.out.println("이메일:"+obj1.getEmail()); 
	   //변수에 직접 접근 불가 
	   
	  
	   //Phone01클래스에 만든 static메소드 호출
	   //static메소드는 클래스 이름으로 호출 
	   Phone01.staticMethod();
	
		

	}

}
