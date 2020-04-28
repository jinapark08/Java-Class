package javaapp0428;

public class Store1 {
	
	//가게 코드 (문자열),가게이름(문자열),평점(실수),최소주문금액(정수),메뉴(문자열)
	//프로퍼티 생성
	private String code;
	private String name;
	private double grade;
	private int minOrder;
	private String menu;
	public Store1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store1(String code, String name, double grade, int minOrder, String menu) {
		super();
		this.code = code;
		this.name = name;
		this.grade = grade;
		this.minOrder = minOrder;
		this.menu = menu;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getMinOrder() {
		return minOrder;
	}
	public void setMinOrder(int minOrder) {
		this.minOrder = minOrder;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "Store1 [code=" + code + ", name=" + name + ", grade=" + grade + ", minOrder=" + minOrder + ", menu="
				+ menu + "]";
	}
	
	
	
	

}
