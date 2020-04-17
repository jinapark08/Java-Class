package javaapp0417;

public class Odermain {

	public static void main(String[] args) {
		//oderstudent01 클래스의 인스턴스 만들기 
		
		Oderstudent01 od1 = new Oderstudent01 ();
		//property에 데이터 저장
		od1.setName("자켓");
		od1.setSize("L");
		od1.setPrice(90000);
		//새로운 인스턴스 만들고 데이터 저장 
		Oderstudent01 od2 = new Oderstudent01 ();
		od2.setName("바지");
		od2.setSize("M");
		od2.setPrice(36000);
		
		
		//od2의 price를 가져와서 3000을 더한 후
		//다시 설정
		//값을 설정할땐set 가져올땐 get
		int temp = od2.getPrice();
		od2.setPrice(temp+2500);
		
		//출력
		Oderstudent01 od3 = new Oderstudent01 ();
		od3.setProperty("티셔츠","Free",20000);
		od3.display();
		
		Oderstudent01 od4 = new Oderstudent01 ();
		od4.setProperty("치마","M",50000);
		od4.display();
		
		Oderstudent01 od5 = new Oderstudent01 ();
		od5.setProperty("코트",350000);
		od5.display();
		
		

	}

}
