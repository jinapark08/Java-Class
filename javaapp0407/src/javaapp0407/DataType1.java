package javaapp0407;

public class DataType1 {

	public static void main(String[] args) {
		//���̸� Main Memory�� ���� 
		int age = 28; 
		//Ű������ - Ű�� �Ҽ� ù°�ڸ����� ���� 
		double height = 165.5; 
		//� ������ true�� ���� 
		//boolean�� �ٸ� �Ͱ� �����ϱ� ���ؼ� 
		//�̸��տ� is�� ���̴� ���� ����
		boolean isPass = true; 
		
		//�ϳ��� ���� ({}) �ȿ��� ������ �̸��� 
		//������ 2�� ����� �ȵ˴ϴ�.
		//int age= 27;
		
		age = 27; //age�� 27�� ����
		
		//age�� ���� ���
		System.out.println("���̴�" + age + "��");
		
		//ĳ���ʹ� ���ڸ� �����ϰ� �ִٰ�
		//����� ���� ���ڿ� �ش��ϴ� ���ڸ� ���
		char ch = 65;
		int i = 65;
		System.out.println(ch);
		System.out.println(i);
		
		//22�� �̻��� ������ long ������ ǥ�� 
		long n = 2200000000L;
		

		//final�� ���� ������ �����͸� ������ �� �����ϴ�. 
		//�̸��� ��� �빮�ڷ� ���ٴ� ���� ���� 
		//final int AGE 27; 
		//�̹����� ���� 
		//AGE=27
		
		//���� ������ ������ 
		int balance = 1000;
		//���� �Ұ����� ������ 
		final int readOnly = balance;
		
	    //���� ũ���� �ڷ��� �����ʹ� ū �ڷ����� ���� ����
		double d = readOnly;
		
		//ū ũ���� �ڷ��� �����͸�
		//���� �ڷ����� �����ϴ� ���� �ȵ� 
		//int i = 3.14; // �Ǽ��� ���������� ���Ծȵ� 
		
		//byet���� 2�� ���� 
		
		byte b1 = 10;
		byte b2 = 13;
		
		//�� ������ ���� 
		//int���� ���� �����ʹ� int�� ��ȯ�ؼ� ����
		//b1�� b2�� int�� ��ȯ�ؼ� �����ߵ� ������ 
		//����� int�� �˴ϴ�. 
		//int�� byte�� ����Ұ�
		//byte result = b1+b2; 
		int result = b1 + b2;
		//int / int = int
		result = 10 / 3;
		System.out.println("result:"+result);
        //double/int �� int�� doubl�� �����ؼ� ����
		//����� 3.333333
		System.out.println("result:"+(10.0/3));		
		
		//20.7�� ������ ������ ��ȯ�ؼ� x�� ����
		//�Ҽ��� �������Ƿ� 20�� ����
		int x = (int)20.7;
		System.out.println("x:"+x);
		
		byte b5 = 10;
		byte b6 = 13;
		//������ ����� byte�� ����
		//���� �� ��ȯ�� �̿��ؼ� �ذ�
		//byte b7 = b5+b6 ; 
		//byte b7 = (byte)b5+(byte)b6; > Ʋ�� ���� 
		
		byte b7 = (byte)(b5+b6);
		//���� �ƴ� ����� �ٲپ� ����Ʈ�� ������ȯ 
		
		double d = (double) 10 / 3;
		System.out.println("d:"+d)
		// ���ϴ� ����� 3.333�̱� ������ ���� ����� ������ȯ 
		
		
		
		
		
		
		
		
		

	}

}
