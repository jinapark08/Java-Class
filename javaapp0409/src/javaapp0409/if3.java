package javaapp0409;

public class if3 {

	public static void main(String[] args) {
		// ���̵�� ��й�ȣ�� �Է¹ް� 
		// ���̵� jina�̰�
		// ��й�ȣ�� cong�̶�� �α��� �����̶�� ���
		// �׷��� ������ ���� ���̵�ų� 
		// �߸��� ��й�ȣ��� ���
		
		//���̵�� ��й�ȣ �Է¹޴� �κа� ���ϴ� �κ����� ����� ó�� 
		java.util.Scanner sc =
				new java.util.Scanner (System.in); 		
		
		System.out.print("���̵�:");
		String id = sc.nextLine();
		//���̵� �Է�
		System.out.print("��й�ȣ:");
		String pw = sc.nextLine();
		//��й�ȣ�� �Է�
		
		//id�� jina���� pw�� cong���� ��
		
		if (id.equals("jina") && pw.equals("cong")) { 
			System.out.println("�α��� ����"); 
		}else {
			System.out.println("�α��� ����"); 
		}
		//�Է°�ü �ݱ�
	   sc.close();
		

	}

}
