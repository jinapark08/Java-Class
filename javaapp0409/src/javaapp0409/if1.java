package javaapp0409;

public class if1 {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		// ���� �Է¹ޱ�
		System.out.print("������ �Է��ϼ���:");
		int a = sc.nextInt();
		// �Է¹ޱ����� ����
		// System.out.println("a:"+a);

		// ������ �Է¹޾� a�� 60�� �̻��̸� �հ�

		if (a >= 60)
		{
			System.out.println("�հ��Դϴ�");
		} 
		else if (a < 60){
			System.out.println("���հ��Դϴ�");
		}
		

		// �Է°�ü �ݱ�
		sc.close();

		
		
	}

}
