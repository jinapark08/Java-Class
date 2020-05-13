package javaapp0513;

public class COMPANYDAO {
	//싱글톤 패턴 디자인 - 객체를 1개만 생성할 수 있도록 만든 패턴
		//외부에서 생성할 수 없도록 생성자를 private로
		private COMPANYDAO() {}
		//만들어진 객체의 참조를 저장하기 위함 변수 
		private static COMPANYDAO companyDAO = null; 
		//객체가 없으면 만들어서 리턴하고, 있으면 있는 것을 리턴하도록 하는 객체사용을 위한 메소드 
		public static COMPANYDAO  sharedInstance() {
			if(companyDAO == null) {
				companyDAO = new COMPANYDAO();
			}
			return companyDAO;
		}

}
