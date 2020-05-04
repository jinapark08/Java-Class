package javaapp0504;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DaumIPMain {

	public static void main(String[] args) {
		
		try {
			//hostName에는 프로토콜이 포함되지않습니다. 
			InetAddress [] daum = InetAddress.getAllByName("daum.net");
			for (InetAddress imsi:daum) {
			System.out.println(daum);
			}
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
