package javaapp0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) {
		// 파일의 인스턴스 단위로 기록

		try (ObjectInputStream oos = 
				new ObjectInputStream(new FileInputStream("./oo.dat"))) {
			// DTO클래스의 인스턴스를 생성
			DTO dto = (DTO)oos.readObject();
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
