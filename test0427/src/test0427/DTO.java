package test0427;

public class DTO {

	//번호,이름,점수,생년월일을 저장 할 프로퍼티 생성 
	private int num;
	private String name;
	private int score;
	private String birthday;
	
	//매개변수 없는 생성자 
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DTO(int num, String name, int score, String birthday) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
		this.birthday = birthday;
	}


	//프로퍼티에 대한 접근자 메소드를 생성

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	//디버깅을위한 메소드 생성
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", score=" + score + ", birthday=" + birthday + "]";
	}
	
	
	
	
	
}
