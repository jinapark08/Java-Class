package javaapp0416;

public class MethodMain {

	/* public static void main(String[] args) {
		
		for (int i=0; i<3; i=i+1) {
			System.out.println("hello java"); 
			
		}
		System.out.println("hello eclipse"); 
		
		for (int i=0; i<3; i=i+1) {
			System.out.println("hello java"); 
			
		} */
		
		public static void main(String[]args) {
			//인스턴스 생성 
			MethodClass01 obj = new MethodClass01();
			
			//메소드 호출
			obj = disp(2);
			System.out.println ("hello eclipse");
			
			obj = disp(3);
			System.out.println ("hello java");
		}

	}


