package javaapp0504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		try {
			//소켓만들기 
			InetAddress addr = InetAddress.getByName("192.168.0.94"); 
			Scanner sc = new Scanner(System.in);
			while(true) {
				//소켓 연결
				Socket socket = new Socket(addr, 9999);
				//전송할 메시지 입력
				System.out.print("메시지:");
				String msg = sc.nextLine();
				
				//메시지 전송
				PrintWriter pw = new PrintWriter(
					socket.getOutputStream());
				pw.println(msg);
				pw.flush();
				pw.close();
				
				//메시지 읽기
				BufferedReader br = 
					new BufferedReader(
						new InputStreamReader(
							socket.getInputStream()));
				String receiveMsg = br.readLine();
				System.out.println(receiveMsg);
				br.close();
				//socket.close();
			
			}
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}

