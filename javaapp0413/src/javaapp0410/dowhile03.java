package javaapp0410;

public class dowhile03 {

	public static void main(String[] args) {
		// �迭�� ������ �հ踦 ���ؼ� ����ϰ� ����� �����ڸ����� �ݿø�

		// 700->ar[0], 600->ar[1], 500->ar[2], 430->ar[3]

		int[] ar = { 700, 600, 500, 430 };

		int idx = 0;
		int sum = 0;

		do {
			sum = sum + ar[idx];
			idx = idx + 1;

		} while (idx < 4);
		System.out.println("�հ�:" + sum);

		// ��� ���ϱ� - �հ� ������ ���� 
		int avg = sum / 4;

		System.out.println("���:" + avg);
		
		// �ݿø��� �ڸ��� �Ҽ� ù°�ڸ��� ������ 
		//5.57
		double imsi = avg/100.0;
        
		//0.5�� ���� �Ҽ��� ����
		//6.0
		imsi = (int)(imsi + 0.5) ;
		
		//�����ڸ��� �ǵ����� ������ ����
		avg = (int)imsi*100;

		
		System.out.println("���:" + imsi);
		
		
		
		

	}

}
