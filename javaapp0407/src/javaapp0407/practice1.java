package javaapp0407;

public class practice1 {

	public static void main(String[] args) {
		double d1 = 10.776;
	    //���� ���ڸ� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ���� 
		int result =(int)(d1+0.5);
		System.out.println("result:"+result);

		//�Ҽ� ù° �ڸ� �ø� 
		//�������� ������ ���� -1 / �������� ������ ���� 
		int count = 110;
		double pageCnt = 10.0;
		result = (int)(count/pageCnt+(pageCnt-1)/pageCnt);
		System.out.println("result:"+result);
		
		//short�� -32768 ~ 32767���� ���尡�� 
		//overflow �߻� -32768
		 short s1 = (short)32768;
		System.out.println("s1:"+s1);
		 
		 int a =10;
		 int b =10;
		 int c =20;
		System.out.println("a:"+
		        System.identityHashCode(a));
		System.out.println("b:"+
		        System.identityHashCode(b));
		System.out.println("c:"+
		        System.identityHashCode(c));
		
	
	}

}
