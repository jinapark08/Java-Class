package javaapp0416;

public class Studant03 {
	
	public int num; 
	public String name;
	public int kor;
	public int mat;
	public int eng; 

	//3개의 정수를 받아서 kor,mat,eng에 대입하는 메소드
			public void set ( int n1 , int n2, int n3) { 
				kor = n1; 
				mat = n2;
				eng = n3;
			}
			// kor,mat,eng의 합계를 구해주는 메소드
			public int sum () { 
				int tot = kor + mat + eng ; 
				System.out.println("합계:"+ tot);
				return tot ; 
			}
	
	
	//데이터를 출력하는 메소드 
	public void disp( ) {
		System.out.println("번호:"+num); 
		System.out.println("이름:"+name); 
		System.out.println("국어:"+kor); 
		System.out.println("수학:"+mat);
		System.out.println("영어:"+eng); 
	}

}
