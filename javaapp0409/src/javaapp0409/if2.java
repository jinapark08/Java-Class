package javaapp0409;

public class if2 {

	public static void main(String[] args) {
		//���� 1���� �Է¹޾Ƽ� 
		//�Է¹��� ������ ¦���̸� ¦�� 
		//�׷��� ������ Ȧ����� ���
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// ���� �Է¹ޱ�
		System.out.print("score:");
		int score = sc.nextInt();
		// �Է¹ޱ����� ����
		// System.out.println("score:"+score);

		// �Է¹��� ������ ¦������ Ȯ��  
		
			
			if(score % 2 == 0) {
			System.out.println("¦��");
	}
			else if (score % 2 != 0) {
		System.out.println("Ȧ��");
	}
		// �Է°�ü �ݱ�
		sc.close();

	}

}
