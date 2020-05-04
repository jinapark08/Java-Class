package javaapp0504;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc =new Scanner (System.in);
			while (true) {
				//보낼메세지 입력
				System.out.println("전송할메세지:");
				String msg= sc.nextLine();
				//데이터전송하기위한 패킷을 생성
				InetAddress addr = InetAddress.getByName("192.168.0.94");
				DatagramPacket dp = 
						new DatagramPacket(
								msg.getBytes(),msg.getBytes().length,addr,9001); 
				//보내는 소켓 생성
				DatagramSocket ds = new DatagramSocket();
				//보내기 
				ds.send(dp);
			}
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}


