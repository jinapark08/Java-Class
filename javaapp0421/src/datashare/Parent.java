package datashare;

public class Parent {
	public String ParentVar;
	
	//parent 클래스 안에서 Child클래스의 인스턴스를 생성
	//이런경우를 has a관계라고 하고 
	//포함관계라고 합니다.
	public Child Child;

	public Parent() {
		ParentVar = "부모의데이터";
		//포함하고있는 인스턴스의 데이터를 포함된 인스턴스에서 사용하고자 할 때는 
		//포함된 인스턴스를 만들 때 생성자에 데이터를 넘겨주면 됩니다. 
		Child = new Child(ParentVar);
		Child.ChildVar = "부모에서 자식을 설정";
		Child.disp();
	}
}
