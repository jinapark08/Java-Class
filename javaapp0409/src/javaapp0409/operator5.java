package javaapp0409;

public class operator5 {

	public static void main(String[] args) {
        //���׿����� ���
		int a =10; 
		int b =20;
		//a>b�̸� a �׷��� ������ b 
        int result = a>b ? a:b; 
	    System.out.println("result:"+result); 
	    
	    
	    String w1 = "�ݶ�";
	    String w2 = "���̴�";
        //2���� ���빰�� swap
	    //������ ����� �ݶ� ����
	    String temp =w1 ; 
	    //�ݶ� ����ִ� �ſ� ���̴ٸ� ����
	    w1 = w2 ; 
	    //���̴ٰ� ����ִ� �ſ� �ݶ� ���� 
	    w2 = temp ; 
	    
	    
	    System.out.println("w1:"+w1);
	    System.out.println("w2:"+w2);
	
	
	}

}
