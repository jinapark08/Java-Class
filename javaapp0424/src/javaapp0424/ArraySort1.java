package javaapp0424;

import java.util.Arrays;

public class ArraySort1 {

	public static void main(String[] args) {
		// 정수배열
		int[] ar = { 30, 60, 90, 20 };
		// Arrays의 sort 메소드가 정렬을 해 줌
		// 배열만 대입하는 경우에는 데이터가 Comparable
		// 인터페이스를 implements한 경우만 가능
		Arrays.parallelSort(ar);
		// 결과확인
		for (int temp : ar) {
			System.out.println(temp + "\t");

		}
		System.out.println("\n");

		String[] br = { "진아", "지나", "진순이", "G나", "jina" };
		// String은 Comparable을 implements했으므로 정렬가능
		Arrays.sort(br);
		for (String temp : br) {
			System.out.println(temp + br);

		}
		System.out.println("\n");
	}

}
