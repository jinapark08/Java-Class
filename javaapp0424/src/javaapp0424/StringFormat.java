package javaapp0424;

import java.io.UnsupportedEncodingException;

public class StringFormat {

	public static void main(String[] args) {
		
		
		//s﻿tatic String format(Strung format, Object data...)
		Integer x =100;
		Integer y =300;
		//인스턴스를 문자열로 변환 - toString
		//프로그래밍마다 이러한 메소드가 존재 
		String msg = x.toString();
		
		//문자열과 문자열 결합
		msg = x.toString()+y.toString(); 
		System.out.println(msg);
		
		//x: 100 v: 300로 출력 
		//숫자는 무조건 5자리로 표현 
		//되도록이면 변수에 저장하고 출력
		//지금은 콘솔에 출력하기 때문에 printf를 이용하지만 
		//GUI프로그램에서는 뷰에 텍스트를 설정하기 때문에 문자열 대이터를 대입하는 구조로 출력합니다. 
		
		//바로출력
		msg = String.format("x:%5d y:%5d",x,y);
		System.out.println(msg);
		//저장하고 출력
		System.out.printf("x:%5d y:%5d",x,y);
		
		System.out.println("\n"+"==================================");
		//﻿Encoding
		//한글을 저장한 문자열인스턴스 
		String hangul = "진아짱";
		//바이트 배열로 변환
		try {
			byte [] bytes = hangul.getBytes("UTF-8");
			/*위의 바이트 배열의 데이터를 전부출력 
			for(byte b : bytes) {
				System.out.println(b);
			}*/
			//바이트 배열을 문자열로 변환 
			String str = new String(bytes,"EUCKR");
			System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
