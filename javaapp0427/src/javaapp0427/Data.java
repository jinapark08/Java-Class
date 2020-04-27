package javaapp0427;

public class Data {
	//번호,이름,전화번호,주소,이메일,생년월일 정보를 갖는 클래스 
	//번호를 제외하고는 전부 문자열 
	//번호는 정수 
	
	//이런 작업을 도메인 설계라고 합니다!
	//사용자 이름, 연락서, 도서코드, 도서명, 도서장르, 대출날짜 정보를 갖는 클래스 
	//속성을 저장할 프로퍼티 생성 
	private String name;
	private int num;
	private String phone;
	private String title;
	private String type;
	private String date;
	
	
	//인스턴스 생성을 위한 생성자를 작성 : 매개변수 없는 생성자 필수 (=디폴트생성자)
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}


   //매개변수를 받아서 만드는 생성자 (공부할때 주로 사용, 데이터가 없을때 사용) 
	public Data(int num, String name, String phone, String title, String type, String date) {
		super();
		this.name = name;
		this.num = num;
		this.phone = phone;
		this.title = title;
		this.type = type;
		this.date = date;
	}


    //프로퍼티 접근하기 위한 접근자메소드 (get,set은 private할때 주로 사용/ public에서는 잘 사용안함) 
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPhone() {
		return num;
	}



	public void setPhone(int phone) {
		this.num = num;
	}



	public String getBooknum() {
		return phone;
	}



	public void setBooknum(String booknum) {
		this.phone = phone;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}


    //디버깅을 위한 toString메소드 (논리적오류,예외발생 시 해결하기 위해 만드는 것) 
	@Override
	public String toString() {
		return "Data [name=" + name + ", num=" + num + ", phone=" + phone + ", title=" + title + ", type="
				+ type + ", date=" + date + "]";
	} 
	
	
	
	
 
}
