package javaapp0423;

public class SystemMain {

	public static void main(String[] args) {
		//Hello Java를 10만번 출력하는데 걸리는 시간
		//Hello Java를 10만번 출력 
		//시간을 측정 - 테스트를 해주는 프로그램을 이용하기도 함 

		//현재시간을 가져오는 메소드를 호출해서 결과를 저장 
		long start = System.nanoTime();
		for (int i=0; i<100000; i++) {
			System.out.println("Hello Java");
		}
		//현재 시간을 가져오는 메소드를 호출 
		long end = System.nanoTime();
		System.out.println("걸린시간(나노초단위):"+ (end-start));
		
		//프로세스 실행과 관련된 클래스의 인스턴스 생성 
		//Runtime r = Runtime.getRuntime();
		//r.exec(notepad.exec());
		//아래 오류가 뜨면 눌러서 thread >> try~ 완성! 
		//MAC : r.exec (
		//"open/System/Applications/TextEdit.app");
		
	}

}
