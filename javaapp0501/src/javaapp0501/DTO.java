package javaapp0501;

import java.io.Serializable;

public class DTO implements Serializable {
	
	//영화코드(문자열), 영화제목(문자열), 영화평점(double)을 저장하는 클래스 
	public String code; 
	public String title; 
	public double grand;
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DTO(String code, String title, double grand) {
		super();
		this.code = code;
		this.title = title;
		this.grand = grand;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getGrand() {
		return grand;
	}
	public void setGrand(double grand) {
		this.grand = grand;
	}
	@Override
	public String toString() {
		return "DTO [code=" + code + ", title=" + title + ", grand=" + grand + "]";
	} 
	

}
