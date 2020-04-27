package javaapp0427;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		// 정수데이터를 저장할 수있는 ArrayList생성
		ArrayList<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(30);

		// 데이터 오름차순 정렬
		list.sort(new Comparator<Integer>() {

			@Override
			// 숫자 데이터의 경우는 앞의 데이터에서 뒤의 데이터를 뺼샘한 결과를 리턴하면 오름차순 정렬
			public int compare(Integer o1, Integer o2) {

				return o1 - o2;
			}

		});
		System.out.println(list);

		// 문자열을 저장하는 ArrayList생성
		ArrayList<String> str = new ArrayList<>();

		// 데이터 추가
		str.add("jina");
		str.add("eunbi");
		str.add("sora");
		str.add("mina");
		str.add("sumi");
		// 데이터 내림차순 정렬
		str.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// String과 date는 compare To 메소드를 이용해서 크기비교수행 
				// 앞의 데이터를 기준으로 비교 : 오름차순
				// 뒤에 데이터를 기준으로 배교 : 내림차순 
				// 알고리즘에서는 비교하는 부등호를 반대방향으로 
				return o1.compareTo(o2);
			}

		});
		System.out.println(str);
		// 전체데이터 확인
		
		
		
		
		
		
		
		
	}

}
