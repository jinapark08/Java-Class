package javaapp0408;

public class operator2 {

	public static void main(String[] args) {
		int idx =0;
		while(true) {
			//mod는 idx를 5로 나눈 나머지 
			int mod = idx % 5;
			if(mod==0)
				System.out.println("월요일");
			else if (mod==1)
				System.out.println("화요일");
			else if (mod==2)
				System.out.println("수요일");
			else if (mod==3)
				System.out.println("목요일");
			else if (mod==4)
				System.out.println("금요일");
		 try { 
			 //1초대기
			 Thread.sleep(1000);
		 }catch(Exception e) {}
		 
		 idx++;
		 }
		}

	int time = 87600;
	int hour = time /3600;//시간
	int minute = (time-hour*3600)/60; //분
    int second1 = (time-hour*3600-minute*60); //초
    
    int second = time % 60;
    

    
   
    
  
	
	}


