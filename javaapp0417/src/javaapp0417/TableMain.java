package javaapp0417;

public class TableMain {

	public static void main(String[] args) {
		//3개의 Row데이터를 저장할 배열을 생성 
		//1개의 자료형 [] 배열이름 = new 1개의자료형 [개수]; 
		
		Row []data = new Row [3];
		//기본형 배열이 아니므로 인스턴스를 직접 생성해서 대입 
		data[0] = new Row ();
		data[0].setName("지나");
		data[0].setAge(28);
		
		data[1] = new Row ();
		data[1].setName("영희");
		data[1].setAge(25);
		
		data[2] = new Row ();
		data[2].setName("철수");
		data[2].setAge(13);
		
		//배열의 출력 
		for (int i=0; i<data.length; i=i+1) { 
			
			Row imsi = data [i]; 
			System.out.println(imsi.getNum()+":"+imsi.getName());
			System.out.println("-나이:"+imsi.getAge());
		}

	}

}
