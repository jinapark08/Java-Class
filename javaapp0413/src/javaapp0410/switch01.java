package javaapp0410;

public class switch01 {

	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		
		final String Korea = "1" ; 
		final String China = "2" ;
		final String Japan = "3" ; 
    
		//메뉴입력
		System.out.print("메뉴입력 (1.한식 2.중식 3.일식):");
		String menu = sc.nextLine(); 
		
		
        //switch를 이용한 처리 
		switch(menu) {
		case Korea: 
		System.out.println("한식");
		break;
		
		case China:
		System.out.println("중식");
		break;
		
		case Japan:
		System.out.println("일식"); 
		break;
		
		default: System.out.println("잘못된메뉴");
		
		
		
		}

	
	
	java.util.Scanner a = 
			new java.util.Scanner(System.in); 
	
	final int APPLE = 1;
	final int BANANA = 2;
    final int TOMATO = 3; 
    
    System.out.print("좋아하는 과일(1.사과 2.바나나 3.토마토):");
    int b = a.nextInt(); 
    
    switch (b) {
    case APPLE:
      System.out.println("사과");
      break; 
      
    case BANANA:
    	System.out.println("바나나");
    	break;
    	
    case TOMATO:
    	System.out.println("토마토");
    	break;
    	
    	default:
    		System.out.println("잘못된입력"); 
    		
    
      
      
    }
   a.close();
	}
    
    
    
}





  
