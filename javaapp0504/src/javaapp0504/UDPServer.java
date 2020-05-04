package javaapp0504;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		try {
			//UDP받는 소켓생성
			//소켓생성 시 포트번호 지정해줘야함 9001
			DatagramSocket ds = new DatagramSocket(9001);
			while(true) {
				System.out.println("서버대기중이지롱");
				//받은 데이터를 저장할 배열
				byte[]data = new byte[1024];
				//데이터 받기 
				DatagramPacket dp = new DatagramPacket(data,1024);
				ds.receive(dp); 
				//보낸곳의 주소와 내용출력
				System.out.println("보낸곳:"+dp.getAddress().getHostAddress());
				//바이트 배열을 문자열로 만들기
				String msg = new String (data);
				System.out.println("보낸메세지:"+msg);
				
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		

		}
	}
}


