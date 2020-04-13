package javaapp0413;

public class for03 {

	public static void main(String[] args) {
		/*
		for ( int i=0; i<=4; i=i+1) {
			for(int j=0; j<=-1*i+4; j=j+1) { //변화량*i를 하고 개수 확인 후 계산이 맞지않는 경우는 더하기나 빼기를 해주면 됩니다. (4-i로호환)
				System.out.print("*");
			}
			System.out.print("\n");
			}
		
		    //연습문제 1
		    //반복구조 안에서 패턴이 변경되는 경우에는 패턴이 변경되는 지점에서 
	    	//분할해서 해결
	     	//복잡한 문제가 주어지면 해결할 수 있는 단위로 분할을 하고 해결한 후 하나로 합치면 됩니다. 
		    for ( int a=0; a<=5; a=a+1) {
			//3번째 줄까지 감소적용
			if (a<=3 ) {
			   for (int b=0; b<a; b=b+1)
				System.out.print("*");
		    //나머지는 증가
			}else {
	    		 for (int b=0; b<= 5-a; b=b+1) //변화량*i
			    	System.out.print("*");

			}
			System.out.print("\n");
			}
		    
		    //연습문제2
		    //한줄에 공백을 출력하고 별을 출력하는 형태가 같이 존재  
		    //반복문을 2개 사용하면 됩니다. 
		    //공백은 하나씩 줄고 별은 하나씩 늘어남 
		    for ( int c=0; c<=4; c=c+1) {
               //공백출력
					   for (int d=0; d<=3-c; d=d+1) {
						System.out.print(" ");
		    }

		    //별출력
					   for (int d=0; d<=c; d=d+1) {
							System.out.print("*");
		    	}
						System.out.print("\n");
		    */
		
		
		
		
		    //연습문제 3
			for (int e=0; e<=3; e=e+1) {
				if (e < 3) {
				//공백출력
				for (int f=0; f<=2-e; f=f+1) {
					System.out.print(" ");
					for (int g=0; g<=f; g=g+1) {
						System.out.print("*");
					}
					}
				}else {
					for (int f=0; f<=2+e; f=f+1) {
						System.out.print(" ");
						for (int g=0; g<=f; g=g+1) {
							System.out.print("*");
						
					}
						System.out.print("\n");
					
				}
					
			}
						
		    
		    
		    
			}
		
			
	}
		    
	}
	

	

	


