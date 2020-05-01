package javaapp0501;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MovieDTOMain {

	public static void main(String[] args) {
		//MovieDTO 클래스의 인스턴스 2개 만들기 
		//번호(정수),영화이름(문자열),누적관람객(정수),별점(정수),리뷰(문자열)
		MovieDTO obj1 = new MovieDTO (1,"기생충",150000,5,"재밌어요");
		MovieDTO obj2 = new MovieDTO (2,"러브레터",80000,3,"볼만해요");
		MovieDTO obj3 = new MovieDTO (3,"토이스토리",100000,4,"귀여워요");
		MovieDTO obj4 = new MovieDTO (4,"트롤",60000,2,"재미없어요");
		
		//위의 2개를 배열로 묶기 
		//MovieDTO []ar = {obj1,obj2};
		
		//ArrayList로 묶기 
		ArrayList <MovieDTO> list = new ArrayList <>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		//위의 생성까지가 테이블구조를 만들기 위함이예용
		
		//오늘 날짜를 문자열로 만들기 
		Date date = new Date ();
		//날짜를 원하는 포맷의 문자열로 만들어주는 인스턴스 
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd"); //시간 hh:mm
		String today =sdf.format(date);
		System.out.println(today);
		
		//파일에 기록
		//ObjectOutputStream
		//FileOutputStream인스턴스를 이용해서 생성
		//파일의 경로를 가지고 생성 
		try(ObjectOutputStream oos =
				new ObjectOutputStream
				(new FileOutputStream (today+".dat"))){
			//파일에 기록 
					oos.writeObject(list);
		}catch(Exception e) {
			
		}
		
		
		
		
	}

}
