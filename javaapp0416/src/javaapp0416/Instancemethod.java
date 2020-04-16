package javaapp0416;

public class Instancemethod {

	public static void main(String[] args) {
		Studant03 obj = new Studant03 ();
		
		obj.num = 1; 
		obj.name = "지나";
		//매개변수가 정수 3개인 메소드 호출 
		obj.set ( 100,90,80 ); 
	
		
		//위의내용출력
		System.out.println(obj.num); 
		System.out.println(obj.name); 
		System.out.println(obj.kor); 
		System.out.println(obj.mat); 


		System.out.println("============="); 
		//위의내용을 출력하는 메소드를 호출 
		obj.disp();
		System.out.println("============="); 
		
	   //정수를 리턴하는 메소드를 호출
	   //메소드의 호출결과를 다른 변수에 저장 
		int tot =obj.sum ();
		double avg = tot /3.0; 
		System.out.println("평균:"+ avg);
	}

}
