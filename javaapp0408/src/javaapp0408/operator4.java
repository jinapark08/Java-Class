package javaapp0408;

public class operator4 {

	public static void main(String[] args) {
		// &&:and, ||:or
		int score = 78;
		//���� ������ 60���� 100�������� Ȯ�� 
		System.out.println
		 (score>=60&&score<=100);
		//score�� 0���� �۰ų� 100���� ū�� Ȯ��
		
	    System.out.println(score<0 || score>100);
	    
	    //&&�� ���� ����� false�̸� ���� ��� Ȯ�ξ���
	    //||�� ���� ����� true�̸� ���� ��� Ȯ�ξ���
	    
	   int idx = 0;
	   boolean result = 10 > 5 && (idx++) > 0;
			   System.out.println("result:"+result);
	           System.out.println("idx:"+idx);
	           
	       idx = 0;
	       result = 10>5 || (idx++)>0;
	       System.out.println("result:"+result);
           System.out.println("idx:"+idx);
		

           //���� üũ
          
           // year�� �������� �Ǻ�
           // ������ ����
           // 1) 4�� ����̰� 100�� ����� �ƴѰ�� 
           // 2) 400�� ����� ��� 
           // 1�� �Ǵ� 2���� ������ �����ϴ� ����
           // ������� Ȯ���ϴ� ����� �� ���ڷ� ���� �������� 0 
           // �׸��� - &&, �Ǵ�- || 
           
           int year = 2020;
           if (year %4 == 0 && year %100 !=0 || year %400 == 0)
           
           {
           System.out.println(year+"�� ����");
           } else {
           System.out.println(year+"�� ����ƴ�");
           
           }    

}
}

	