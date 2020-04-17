package javaapp0417;

public class Row {
	// 전체제목 생성
		private static final String title = "회원등록";

	// 번호와 이름을 저장하기 위한 프로퍼티
	private int num;
	private String name;
	private int age;
    //static변수를 1씩 증가시키면서 프로퍼티에 대입하면 일련번호가 됩니다. 
	private static int idx = 1;

	// 생성자 - 매개변수가 없는 생성자와 매개변수가 있는 생성자
	public Row() {
		super();
		num = idx;
		idx = idx + 1;
		// idx는 계속해서 하나씩 증가
	}

	// set 메소드 생성
	public Row(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		num = idx;
		idx = idx + 1;
	}

	// 접근자 메소드 생성 get, set
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 출력 메소드

}
