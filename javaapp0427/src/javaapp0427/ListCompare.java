package javaapp0427;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList와 LinkedList 생성
		ArrayList<String> a1 = new ArrayList<>();
		LinkedList<String> l1 = new LinkedList<>();
		//데이터를 두개씩 삽입 
        a1.add("First");
        a1.add("Thied");
        
        l1.add("First");
        l1.add("Thied");
        //1번째 자리에 Second 문자열을 10만개 삽입하고 시간을 측정
        long start = System.nanoTime();
        for (int i=0;i<100000;i++) {
        	a1.add(1,"Second");
        }
        long end = System.nanoTime();
        System.out.println("ArrayList:"+(end-start));
	
	
	 start = System.nanoTime();
     for (int i=0;i<100000;i++) {
     	l1.add(1,"Second");
     }
     end = System.nanoTime();
     System.out.println("LinkedList:"+(end-start));
	}


}
