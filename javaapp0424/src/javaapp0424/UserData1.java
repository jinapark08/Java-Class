package javaapp0424;

//이름,나이,연봉을 저장하는 클래스 
//프로퍼티,construct,getter&setter,toString
public class UserData1 {
	private String Name;
	private int age;
	private int salary;

	// 생성자

	public UserData1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData1(String name, int age, int salary) {
		super();
		Name = name;
		this.age = age;
		this.salary = salary;
	}

	// 접근자 메소드
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 디버깅을 위한 메소드
	@Override
	public String toString() {
		return "UserData1 [" + "Name=" + Name + ", age=" + age + ", salary=" + salary + "]";
	}

}
