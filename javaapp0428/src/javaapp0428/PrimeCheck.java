package javaapp0428;

public class PrimeCheck {

	public static void main(String[] args) {
		//2부터 1000까지에서 소수의 개수 구하기 
		//소수 (prime) : 2부터 자신의 절반이 되는 숫자까지 나누어 
		//나누어 떨어지지않으면 소수 
		
		
		//데이터 개수를 저장할 변수 
		int cnt = 0; 
		
		//2부터 1000까지 
		for (int i=2;i<1000;i++) {
			//나누어지는지 확인하기 위한 변수 
			boolean flag = false; 
			//2부터 자신의 절반이 되는 숫자까지 
			for(int j=2;j<=i/2;j++) {
				//나누어 떨어진 경우
				if (i%j==0) {
					flag =true;
					break; 
				}
			}
			//나누어진적이 없으면 소수 
			if (flag == false) {
				System.out.printf("%4d",i);
				cnt++;
				
				
			}
		}
		
		System.out.println("\n 소수개수:"+cnt);

		
		//나누어 떨어진것 더해사 나와 같아야해
		//문제2
		//2부터 1000까지 완전수의 개수 구하기 :3개
		
		//데이터 개수를 저장할 변수 
		int num =0; 
		int sum =0; 
		//2부터 1000까지 
		for (int i=2;i<1000;i++) {
			//나누어지는지 확인하기위한 변수 
			boolean temp = false;
			//2부터 자신의 절반이 되는 숫자까지 
			for(int j=2; j<=i/2; j++) {
				//나누어 떨어진 경우 
				if(i%j==0) {
					temp = true;	
					num = num+j;
					break;	
				}
				//if()
				
			}
			/*if (temp==false) {
				System.out.printf("%4d",i);
				num++;
			}*/
		
		}
		System.out.println("\n완전수개수:"+num);
		
		
		
		
		
		
		
		
		
	}

}
