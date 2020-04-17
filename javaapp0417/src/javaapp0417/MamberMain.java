package javaapp0417;

public class MamberMain {

	public static void main(String[] args) {
		
		Member mem1 = new Member ();
		System.out.println("id:"+mem1.getId());
		System.out.println("pw:"+mem1.getPw());
		
		
		
		Member mem2 = new Member ();
		mem2.setId("jina");
		mem2.setPw("5586");
		mem2.setName("관리자");
		
		//매개변수가 있는 생성자를 호출해서 인스턴스 생성 
		Member mem3 = new Member ("park","1234","운영자");
	}

}
