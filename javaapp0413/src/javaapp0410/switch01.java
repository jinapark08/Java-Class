package javaapp0410;

public class switch01 {

	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		
		final String Korea = "1" ; 
		final String China = "2" ;
		final String Japan = "3" ; 
    
		//�޴��Է�
		System.out.print("�޴��Է� (1.�ѽ� 2.�߽� 3.�Ͻ�):");
		String menu = sc.nextLine(); 
		
		
        //switch�� �̿��� ó�� 
		switch(menu) {
		case Korea: 
		System.out.println("�ѽ�");
		break;
		
		case China:
		System.out.println("�߽�");
		break;
		
		case Japan:
		System.out.println("�Ͻ�"); 
		break;
		
		default: System.out.println("�߸��ȸ޴�");
		
		
		
		}

	
	
	java.util.Scanner a = 
			new java.util.Scanner(System.in); 
	
	final int APPLE = 1;
	final int BANANA = 2;
    final int TOMATO = 3; 
    
    System.out.print("�����ϴ� ����(1.��� 2.�ٳ��� 3.�丶��):");
    int b = a.nextInt(); 
    
    switch (b) {
    case APPLE:
      System.out.println("���");
      break; 
      
    case BANANA:
    	System.out.println("�ٳ���");
    	break;
    	
    case TOMATO:
    	System.out.println("�丶��");
    	break;
    	
    	default:
    		System.out.println("�߸����Է�"); 
    		
    
      
      
    }
   a.close();
	}
    
    
    
}





  
