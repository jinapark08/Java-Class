package javaapp0424;

import java.util.Arrays;
import java.util.Comparator;

public class UserDataSorting {

	public static void main(String[] args) {
		//UserData인스턴스를 생성 
		
		UserData1[] ar = new UserData1[3];
		
		UserData1 user1 = new UserData1();
		user1.setName("웬디");
		user1.setAge(28);
		user1.setSalary(3000);
		ar[0]=user1;
		
		ar[1] = new UserData1 ();
		ar[1].setName("사나");
		ar[1].setAge(20);
		ar[1].setSalary(8000);
		
		ar[2] = new UserData1 ();
		ar[2].setName("지나");
		ar[2].setAge(50);
		ar[2].setSalary(18000);
		
		//정렬-예외발생 
		//ar은 UserData1의 배열이고 UserData1은
		//Comparable 인터페이스가 Implements 되지않아서 
		//크기 비교하는 방법을 알지 못하기 때문입니다.
		
		
		Comparator<UserData1> comp1 =new Comparator() {

			@Override
			public int compare(Object a0, Object a1) {
				UserData1 a3 = (UserData1)a0;
				UserData1 a4 = (UserData1)a1;
				return a4.getName().compareTo(a3.getName());
				
			}
			
		};
		Arrays.sort(ar,comp1);
		//베열의 데이터 전부 출력 
	    for(UserData1 temp:ar) {
	    	System.out.println(temp);
	    	
	    }
	}

}
