package datashare;

public class tjoeun {
	// static이 없는 프로퍼티라서 인스턴스가 각자 소유
	public String noShare;

	// static이 있어서 클래스를 만들고 인스턴스가 공유
	static public String Share;

	public void globalChange() {
		// 클래스이름.변수명으로 접근할 수 있도록 함
		GlobalClass.globalmsg = "전역변수수정";
	}

}
