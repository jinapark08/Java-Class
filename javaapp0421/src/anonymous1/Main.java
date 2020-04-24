package anonymous1;

public class Main {

	public static void main(String[] args) {
		Anony01Ex obj = new Anony01Ex();
		obj.method();
		// anony01 클래스를 상속받는 anonymous class생성
		Anony01 obj1 = new Anony01() {

			@Override
			public void method() {
				System.out.println("anonymous를 이용한 상속 구현");

			}

		};

		obj.method();

	}

}
