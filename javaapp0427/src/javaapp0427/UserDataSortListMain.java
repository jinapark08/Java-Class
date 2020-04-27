package javaapp0427;

import java.util.ArrayList;
import java.util.Comparator;

public class UserDataSortListMain {

	public static void main(String[] args) {
		// Data 여러 개 저장하는 Arraylist를 생성 
		
		ArrayList <Data> list = new ArrayList <> ();
			
		list.add(new Data(0, "박진아","01012345678","건축가가사는집","디자인/미술","20200411"));
		list.add(new Data(1, "정경호","01033112255","퇴근길인문학","인문","20200410"));
		list.add(new Data(2, "박보검","01010048615","색체학","디자인/미술","20200417"));
		list.add(new Data(3, "유연석","01057954521","보그4월호","매거진","20200417"));
		list.add(new Data(4, "조정석","01012348745","여덟글자","에세이","20200417"));

		list.sort(new Comparator<Data>() {

			@Override
			//data의 오름차순으로 정렬하고 
			//data가 같으면 이름의 오름차순 정렬 
			public int compare(Data o1, Data o2) {
				//날짜가 같으면 
				if (o1.getDate().compareTo(o2.getDate())==0) {
					//이름 오름차순으로 정렬 하고 
					return o1.getName().compareTo(o2.getName());
				}else {
					//그렇지 않으면 날짜 순으로 정렬 
					return o1.getDate().compareTo(o2.getDate());
				}
			}	
		});
		//데이터출력
		for(Data data:list) {
			System.out.println(data);
		}
	}

}
