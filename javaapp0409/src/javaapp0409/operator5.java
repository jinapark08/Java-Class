package javaapp0409;

public class operator5 {

	public static void main(String[] args) {
        //삼항연산자 사용
		int a =10; 
		int b =20;
		//a>b이면 a 그렇지 않으면 b 
        int result = a>b ? a:b; 
	    System.out.println("result:"+result); 
	    
	    
	    String w1 = "콜라";
	    String w2 = "사이다";
        //2개의 내용물을 swap
	    //빈컵을 만들고 콜라를 대입
	    String temp =w1 ; 
	    //콜라가 들어있던 컵에 사이다를 대입
	    w1 = w2 ; 
	    //사이다가 들어있던 컵에 콜라를 대입 
	    w2 = temp ; 
	    
	    
	    System.out.println("w1:"+w1);
	    System.out.println("w2:"+w2);
	
	
	}

}
