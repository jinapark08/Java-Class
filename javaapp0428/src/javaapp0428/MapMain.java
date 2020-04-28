package javaapp0428;

import java.util.HashMap;

public class MapMain {

	public static void main(String[] args) {
		// 2차원배열 -배열의배열
		// 가수들의 그룹별 선수 명단을 데이터로 작성
		String[] twice = { "쯔위", "사나", "미나" };
		String[] blackpink = { "제니", "로제","리사","지수" };
		String[] redvelvet = {  "웬디", "슬기","조이","예리","아이린" };
		String[] afterschool = {"나나","가희","유이"};
        //이차원 배열 생성
		//배열에는 비교가 가능한 데이터만 저장하기 때문에 데이터 이외의 정보를 저장하지 못해서 
		//이차원 배열을 이용하는 경우 배열의 특성을 출력할 수 없습니다.
		String[][] groups = { twice, blackpink, redvelvet,afterschool };
         /*
		//데이터 출력 
		for (int i = 0; i < groups.length; i++) {
			//그룹이름출력 
			if (i == 0) {
				System.out.printf("%5s", "트와이스:");
			} else if (i == 1) {
				System.out.printf("%5s", "블랙핑크:");
			} else if (i == 2) {
				System.out.printf("%5s", "레드벨벳:");
			}
			// 각 그룹의 멤버명단
			String[] temp = groups[i];
			for (String imsi : temp) {
				System.out.printf("%7s", imsi);

			}
			System.out.printf("\n"); */

			
			//배열들을 하나로 묶어 줄 때는 Map을 만들어서 
			//배열의 특징과 데이터를 저장하고 Map의 배열을 만들어주는 것이 좋습니다. 
            HashMap<String,Object> map1 = new HashMap<String,Object>();
            map1.put("groups", "트와이스:");
            map1.put("member", twice);
            
            HashMap<String,Object> map2 = new HashMap<String,Object>();
            map2.put("groups", "블랙핑크:");
            map2.put("member", blackpink);
            
            HashMap<String,Object> map3 = new HashMap<String,Object>();
            map3.put("groups", "레드벨벳:");
            map3.put("member", redvelvet);
            
            HashMap<String,Object> map4 = new HashMap<String,Object>();
            map4.put("groups", "에프터스쿨:");
            map4.put("member", afterschool);
            
            HashMap [] star= {map1,map2,map3,map4};
            		for(HashMap map:star) {
            			System.out.printf("%5s",map.get("groups"));
            			//출력 이외의 작업을 할 때는 원래 자료형으로 형 변환해서 사용해야합니다. 
            			String [] member = 
            					(String [])map.get("member");
            			for (String m:member) {
            				System.out.printf("%7s",m);
            			}
            			System.out.printf("\n");
            		}
            		
            		
		}

	}

