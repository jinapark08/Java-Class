package javaapp0428;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
         /*
		// Random 인스턴스 만들기 - seed를 동적으로 설정
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		// seed를 1로 고정
		Random r1 = new Random(1);
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		// 0-44 사이의 숫자를 랜덤하게 리턴
		System.out.println(r1.nextInt(45));
		System.out.println(r1.nextInt(45));
	} */

	String[] monster = { "라투", "오미크론", "다크스펙터", "나즈", "오미크론", "오미크론", "다크스펙터", "다크스펙터" };
	Random r2 = new Random();
	/*// 위의 배열의 데이터를 1초마다 랜덤하게 출력
	// 10번만 수행
	for(
	int i = 0;i<10;i=i+1)
	{
		try {
			Thread.sleep(1000);
			System.out.println(monster[r2.nextInt(monster.length)]);
		} catch (InterruptedException e) {
		}

	}

}*/
		String [] slot = {"!", "?", "*", "%"};
		String msg = "";
		for(int i=0; i<3;i=i+1) {
			msg = msg + slot[r2.nextInt(slot.length)];
		}
		System.out.println(msg);
		if(msg.charAt(0) == msg.charAt(1) 
				&& msg.charAt(1) == msg.charAt(2)) {
			System.out.println("축하합니다>-<");
		}else {
			System.out.println("꽝"); 
		}
	}
}
