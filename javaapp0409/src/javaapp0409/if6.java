package javaapp0409;

public class if6 {

	public static void main(String[] args) {
		// ���̵� jina�̰� ��й�ȣ�� cong�̸� �α��� ����
		// ���̵� jina�̰� ��й�ȣ��cong�� �ƴϸ� �߸��� ��й�ȣ 
		// ���̵� jina�� jina�� �ƴϸ� ���� ���̵��� ��� 
		
		java.util.Scanner sc =
				new java.util.Scanner (System.in); 		
		//���̵�� ��й�ȣ�� �Է��ϴ� �κ� 
		System.out.print("���̵�:");
		String id = sc.nextLine();
		//���̵� �Է�
		System.out.print("��й�ȣ:");
		String pw = sc.nextLine();
		//��й�ȣ�� �Է�
		
		
		if (!id.equals("jina")){
			System.out.println("���̵����"); 
		}
		else if (pw.equals("cong")) {
			System.out.println("�α��μ���");
		}
		else { 
			System.out.println("�߸��Ⱥ�й�ȣ");
		}
	}

}
