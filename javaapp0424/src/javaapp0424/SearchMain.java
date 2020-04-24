package javaapp0424;

import java.util.Arrays;

public class SearchMain {

	public static void main(String[] args) {
		String[] artist = { "살바도르달리", "피카소", "고흐", "모네", "클림트" };
		// 데이터 정렬
		Arrays.parallelSort(artist);
		// 필요한 데이터가 있는지 확인
		System.out.println(Arrays.binarySearch(artist, "모네"));
		System.out.println(Arrays.binarySearch(artist, "뭉크"));

		// 대문자 소문자의 값이 다르기 때문에 순서가 이상하게 나올 수 있습니다.
		// toUppercase를 불러 통일 시켜야햄
		//원본을 변경하면 안되기 때문에 복사본을 저장할 배열을 생성 
		String[] alphabets = { "Park", "cha", "kim" };
		//데이터 복사 
		String[] imsi = new String[alphabets.length];
		//원본의 데이터를 대문자로 변경해서 복사본 배열에 저장 
		for (int i = 0; i < imsi.length; i++) {
			imsi[i] = alphabets[i].toUpperCase();
		}
       //복사본 배열을 정렬해서 출력 
		Arrays.parallelSort(imsi);
		for (String artist1 : alphabets) {
			System.out.println(artist1);
		}

	}

}
