package javaapp0501;

import java.io.Serializable;

//영화 정보를 저장할 클래스 - VO,DTO,Domain클래스라고도 합니다.
public class MovieDTO implements Serializable {
	//데이터를 구성할 프로퍼티를 private로 선언 
	//번호(정수),영화이름(문자열),누적관람객(정수),별점(정수),리뷰(문자열)
	private int 번호;
	private String 영화이름;
	private int 누적관람객;
	private int 별점; 
	private String 리뷰;
	public MovieDTO() {
	
	
	//이번 작업은 대부분 데이터베이스를 사용하기 전에만 수행
	//인스턴스를 빠르게 만들기 위한 생성자 추가 
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieDTO(int 번호, String 영화이름, int 누적관람객, int 별점, String 리뷰) {
		super();
		this.번호 = 번호;
		this.영화이름 = 영화이름;
		this.누적관람객 = 누적관람객;
		this.별점 = 별점;
		this.리뷰 = 리뷰;
		
		//프로퍼티를 private로 만들었기 때문에
		//인스턴스가 직접접근이 안되서 프로퍼티에 접근하기 위해만든 메소드
	}
	public int get번호() {
		return 번호;
	}
	public void set번호(int 번호) {
		this.번호 = 번호;
	}
	public String get영화이름() {
		return 영화이름;
	}
	public void set영화이름(String 영화이름) {
		this.영화이름 = 영화이름;
	}
	public int get누적관람객() {
		return 누적관람객;
	}
	public void set누적관람객(int 누적관람객) {
		this.누적관람객 = 누적관람객;
	}
	public int get별점() {
		return 별점;
	}
	public void set별점(int 별점) {
		this.별점 = 별점;
	}
	public String get리뷰() {
		return 리뷰;
	}
	public void set리뷰(String 리뷰) {
		this.리뷰 = 리뷰;
	}
	
	//이 메소드를 만들지않으면 인스턴스 이름을 가지고 인스턴스를 출력할때 
	//클래스 이름과 해시코드가 리턴 
	//프로퍼티의 값을 빠르게 확인하기 위해서 만드는 메소드
	
	@Override
	public String toString() {
		return "MovieDTO [번호=" + 번호 + ", 영화이름=" + 영화이름 + ", 누적관람객=" + 누적관람객 + ", 별점=" + 별점 + ", 리뷰=" + 리뷰 + "]";
	}
	
	
	
	

}
