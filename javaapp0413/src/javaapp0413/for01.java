package javaapp0413;

public class for01 {

	public static void main(String[] args) {
		// 1부터 10까지 반복문을 이용해서 출력
		for (int idx = 1; idx < 11; idx = idx + 1) {
			System.out.println(idx);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

		// 1부터 5까지 반복
		// 0,2,4,6,8출력

		for (int su = 0; su < 10; su = su + 2) {
			System.out.println(su);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

		// 9부터 0까지 반복문을 이용해서 출력
				for (int idx = 1; idx < 11; idx = idx + 1) {
					System.out.println(10-idx);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				
				//0,1반복
				for (int idx = 1; idx < 11; idx = idx + 1) {
					int nmg = idx %2 ; 
					System.out.println(nmg);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				
				//0,0,1,1 반복
				
				for (int idx = 1; idx < 11; idx = idx + 1) {
					int mok = idx /2 ; 
					//나머지를 구하면 값이 제한됩니다.
					int nmg = mok %2 ; 
					//일정한 횟수가 반복되는 것은 나누기 
					//일정한 패턴을 반복시키는 것은 퍼센트
					System.out.println(nmg);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				
				

		
	}

}
