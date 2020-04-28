package javaapp0428;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//1993년8월8일을 Calender 클래스의 인스턴스로 생성
		GregorianCalendar birthday = 
				new GregorianCalendar(1993,8,8); 
		//년도만 가져오기 
		System.out.println(birthday.get(Calendar.YEAR));
		//Date로 변환
		//Calendar가 날짜는 정확한데 데이터베이스와 연동은 Date로 해여합니다. 
		Date date = new Date(birthday.getTimeInMillis());
		System.out.println(date);
		//현재 날짜 및 시간만들기 
		GregorianCalendar today = new GregorianCalendar();
		System.out.println(today);
        //날짜의 차이 계산
		long gap = today.getTimeInMillis()-birthday.getTimeInMillis();
		gap = gap / 1000; 
		gap = gap/86400;
		System.out.println("태어난지"+gap+"일째");
	}

}
