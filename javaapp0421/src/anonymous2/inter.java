package anonymous2;
//인터페이스 
//final 상수와 추상 메소드를 소유한 개체 
//변수는 만들면 상수가 되고 메소드는 모양만 만들어야합니다.
//default를 붙이며 내용이 있는 메소드를 만들 수 있고 이 메소드는 필요에 따라 재정의합니다. 
//하나의 클래스에 여러개의 인터페이스를 implements할 수 있습니다. 
//사용하는 이유는 템플릿 메소드 패턴이나 다형성 구현 
//템플릿 메소드 패턴은 모양을 만들고 내용을 구현하는 것이고 
//템플릿일때 (단일상속)> Starcraft ->StarcraftImpl
//다형성은 동일한 코드가 대입된 인스턴스에 따라 (비슷하지만 상황에 맞추어)다르게 반응하는 것 
//다형성일때 (단일상속)
//Starcraft -> Zerg
//Starcraft -> terran
//Starcraft -> protoss 


public interface inter {
	public void method (); 
	//절대 내용만들면 안돼! 

}
