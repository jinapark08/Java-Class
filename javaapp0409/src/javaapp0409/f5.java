package javaapp0409;

public class f5 {

	public static void main(String[] args) {
		//������ �Է� �޾Ƽ� 80~100�̸� ��� 
		//60~79�̸� ����
		//0~59�̸� ��� 
		//�������� �߸��� ���� �Է�
		//�̶�� ����ϴ� ���α׷��� �ۼ�

		//������ �Է� 
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		
		int score =sc.nextInt(); 
		System.out.print("�����Է�(0~100):");
	
	
		//80~100�̸� ��� 
		if (score >= 80 && score <= 100){
			System.out.println("���");
		    }
			//60~79�̸� ����
			else if (score >= 60 && score <=79 ){
			System.out.println("����");
			}
			//0~59�̸� ��� 
			else if (score >=0 && score <=59){
			System.out.println("���");
			} 
			//�������� �߸��� ���� �Է�
			else {
			System.out.println("�߸��� �����Դϴ�. �ٽ��Է����ּ���");
			}
			sc.close();
			}

		}
	
		
