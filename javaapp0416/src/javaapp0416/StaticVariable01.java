package javaapp0416;

public class StaticVariable01 {

	public static void main(String[] args) {
        Student02 obj1 = new Student02 (); 
		Student02 obj2 = new Student02 (); 
		
 
		obj1.name = "박진아";
		obj2.name = "홍길동";
		
	
        //static변수를 인스턴스를 이용해서 접근하면 경고
		//되도록이면 클래스 이름으로 접근 
		//obj1.schoolName = "a";
		//obj2.schoolName ="b"; 
		
		obj1.schoolName = "메가스터디"; 
		
		System.out.println(
				obj1.schoolName+ ":"+obj1.name);
		System.out.println(
				obj2.schoolName+ ":"+obj2.name);
		

	}

}
