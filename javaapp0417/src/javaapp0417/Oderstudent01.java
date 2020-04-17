package javaapp0417;

public class Oderstudent01 {

	// 제품이름,사이즈,가격을 저장
	// 인스턴스가 직접 핸들링 할 수 없도록 private으로생성
	private String name;
	private String size;
	private int price;

	// 전체 제목으로 사용할 변수를 생성
	// 전체가 공통된 이름을 사용하기때문에 static
	// 변경할 수 없도록 final
	private static final String title = "주문서";

	// property(인스턴스변수)를 private로 만들어서
	// 인스턴스가 사용할 수 없기때문에
	// 인스턴스가 사용할 수있도록 접근자 메소드를 생성
	// 접근자 메소드 - getter,setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getTitle() {
		return title;
	}

	// 제품명,사이즈,가격을 받아서 set하는 메소드
	public void setProperty(String name, String size, int price) {
		// 메소드 매개변수가 name,size,price
		// 프로퍼티 이름도 동일
		// 메소드 안에서 만든 지역 변수가 아닌
		// 프로퍼티로 가져올때는 this.을 붙여서 가져오면 됩니다
		// this를 생략하면 메소드 안에서 찾고
		// 없으면 프로퍼티로 갑니다.

		this.name = name;
		this.size = size;
		this.price = price;
	}

	// 제품명과 가격만 입력받고 사이즈는 Free로 설정하는 메소드
	// 위에 String,String,Int를 매개변수로 하는
	// setproperty가 이미 존재
	// String, Int를 매개변수로 받는 setproperty
	// 이런 경우를 MethodOverloding이라고 합니다.
	
	public void setProperty(String name, int price) {

		this.name = name;
		this.price = price;
		this.size = "Free";
	}

	// 제품명과 사이즈 그리고 가격을 출력하는 메소드
	public void display() {
		System.out.println("제품명:" + name + " / " 
	   + "사이즈:" + size + " / " + "가격:" + price+ ("원"));

	}

}
