package javaapp0409;

public class f5 {

	public static void main(String[] args) {
		//점수를 입력 받아서 80~100이면 우수 
		//60~79이면 보통
		//0~59이면 노력 
		//나머지는 잘못된 점수 입력
		//이라고 출력하는 프로그램을 작성

		//점수를 입력 
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		
		int score =sc.nextInt(); 
		System.out.print("점수입력(0~100):");
	
	
		//80~100이면 우수 
		if (score >= 80 && score <= 100){
			System.out.println("우수");
		    }
			//60~79이면 보통
			else if (score >= 60 && score <=79 ){
			System.out.println("보통");
			}
			//0~59이면 노력 
			else if (score >=0 && score <=59){
			System.out.println("노력");
			} 
			//나머지는 잘못된 점수 입력
			else {
			System.out.println("잘못된 점수입니다. 다시입력해주세요");
			}
			sc.close();
			}

		}
	
		
