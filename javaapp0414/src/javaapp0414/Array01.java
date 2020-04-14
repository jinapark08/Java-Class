package javaapp0414;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		//사람이름 배열을 생성
		//초기값을 가지고 생성 
		
		Scanner sc = new Scanner (System.in); 
		

		
		String [] name = {"지나","철수","영희"}; 
				
				for (int i=0; i<3; i=i+1) {
					System.out.println (name[i]);
		}
		
		//인덱스를 잘못사용한 경우 
		//ArrayIndexOutOfBoundsException발생                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		//System.out.println(name[3]); 
		
		//배열이 생성되기 전에 속성을 호출 
		//NullPointerException
		//int [] ar = null;
		//System.out.println(ar.length); 
				
				System.out.println ("======================="); 
				
				//문자열 배열을 생성 
				int []money = { 1000,5000,10000,300 }; 
				
				//배열의 데이터를 전부 출력 - 리터럴 사용
				//데이터의 개수가 변경되면 코드를 변경
				//변경하지 않으면 에러가 발생하거나 데이터를 
				//전부 출력하지 못하게 됩니다. 
				for (int a=0; a<3; a=a+1) {
					System.out.println (money[a]); 
				}
				
				System.out.println ("======================="); 
				
				//배열의 속성을 이용해서 전부 출력 
				//데이터를 출력할 때 데이터의 속성을 이용하면 데이터가 변경되었을때 자동으로 적용됩니다.
				//데이터가 변경되더라도 출력하는 코드를 수정할 필요가 없어집니다.
				//이러한 방식을 MVC Pattern이라고 합니다.
				//Model - 데이터를 만드는 부분 
				//(Back End, BusinessLogic)
				
				//View
				//(Front End, Presentation Logic)
				
		
				//length > 데이터의 갯수를 몰라도 저장되어있는 수 를 전부 출력해줌
				//Controller - Model과 View를 연결하는 부분 
				for (int a=0; a<money.length; a=a+1) {
					System.out.println (money[a]); 
					
			    //리터럴 사용하는 것이 실행속도면으로는 빠르나, 모델의 유지보수 및 개발의 편의성은 length가 더 편함 
				}
				System.out.println ("======================="); 
			    
				//length를 바깥으로 빼놓고 쓰면 더 빠름 
				//여러개의 데이터 안에 포함된 length를 1개의 데이터인 len에 복사합니다.
				//다음부터 len을 이용하게 되면 length보다 메모리 접근 횟수가 줄어들어서 
				//더 효율적은 반복문 사용이 될 수 있습니다.
				
				int len = money.length;
				for (int a=0; a<len; a=a+1) {
					System.out.println (money[a]); 
				}
				sc.close();
				
	}

}
