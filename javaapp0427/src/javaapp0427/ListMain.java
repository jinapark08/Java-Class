package javaapp0427;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		// 문자열을 저장할 ArrayList생성 
		LinkedList <String> list = new LinkedList<>();
		//데이터 추가 
		list.add("짱아");
		list.add("초코");
		list.add("콩이");
		list.add("미키");
		list.add("구름이");
		//2번째 데이터에 추가
        list.add(2, "뭉치");
        //구름이라는 데이터를 삭제 
        list.remove("구름이");
        //위치를 가지고 삭제 
        list.remove(4);
        //데이터 전체를 확인 - toString을 이용해서 확인 
        System.out.println(list);
        
        //데이터 전체를 순회(순서대로 하나씩 접근) 
        //빠른열거를 이용 - 전체데이터를 순서대로 접근할때 간결 
        for (String temp:list) {
        	System.out.print(temp+"\t");
        }
        System.out.println("\n");
        //인덱스를 이용한 접근 - 짝수번쨰나 홀수번째 등 골라내서 접근 가능 
        int size = list.size();
        		for (int i=0;i<size;i++) {
        			System.out.print(list.get(i)+"\t");
        		}
        System.out.println("\n");
        
	}

}
