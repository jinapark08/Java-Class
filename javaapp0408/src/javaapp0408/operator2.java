package javaapp0408;

public class operator2 {

	public static void main(String[] args) {
		int idx =0;
		while(true) {
			//mod�� idx�� 5�� ���� ������ 
			int mod = idx % 5;
			if(mod==0)
				System.out.println("������");
			else if (mod==1)
				System.out.println("ȭ����");
			else if (mod==2)
				System.out.println("������");
			else if (mod==3)
				System.out.println("�����");
			else if (mod==4)
				System.out.println("�ݿ���");
		 try { 
			 //1�ʴ��
			 Thread.sleep(1000);
		 }catch(Exception e) {}
		 
		 idx++;
		 }
		}

	int time = 87600;
	int hour = time /3600;//�ð�
	int minute = (time-hour*3600)/60; //��
    int second1 = (time-hour*3600-minute*60); //��
    
    int second = time % 60;
    

    
   
    
  
	
	}


