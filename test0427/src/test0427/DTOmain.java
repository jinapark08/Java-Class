package test0427;

import java.util.ArrayList;
import java.util.Comparator;

public class DTOmain {

	public static void main(String[] args) {
		
	
		
		ArrayList <DTO> list = new ArrayList <> ();
		
		//DTO의 객체를 5개 생성하여 List에 저장 
		//번호,이름,점수,생년월일
		list.add(new DTO(0, "박진아",100,"930808"));
		list.add(new DTO(1, "정경호",70,"830515"));
		list.add(new DTO(2, "박보검",95,"931102"));
		list.add(new DTO(3, "유연석",98,"901208"));
		list.add(new DTO(4, "조정석",80,"800708"));
		
		
		list.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}

			
		});
		//출력
		System.out.println(list);
}
}
