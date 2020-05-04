package javaapp0504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//서버 소켓생성 -내 아이피주소:9999 
			ServerSocket ss = new ServerSocket (9999); 
			while(true) {
				System.out.println("서버 대기중..");
				//클라이언트 요청을 기다림 
				Socket socket = ss.accept();
				
				//전송된 메세지 읽기 
				BufferedReader br = 
						new BufferedReader(
								//데이터를 읽어오기 위한 스트림 리턴 
							new InputStreamReader(
								socket.getInputStream()));
				String msg = br.readLine();
				System.out.println("보낸곳:"+ socket.getInetAddress());
				System.out.println(msg);
				// BufferedReader을 사용한 후 아래 항목을 닫아주어야 오류가 안남
				br.close();
				
				//받은메세지 돌려보내기 
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				// PrintWriter을 사용한 후 아래 항목을 닫아주어야 오류가 안남
				pw.println("반사:"+msg);
				pw.flush();
				pw.close();
				//socket.close();
			}
			
		}catch(Exception e) {
			
		}

	}

}
