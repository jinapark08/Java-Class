package javaapp0417;

public class TestMain {

	public static void main(String[] args) {
		
		//TestClass클래스에 존재하는 static int noRecuresionFibo(int n) 사용 
		int result = TestClass.noRecuresionFibo (9);
		System.out.println("9번째 숫자:"+result);
		
		result = TestClass.noRecuresionFibo (10);
		System.out.println("10번째 숫자:"+result);
		
		result = TestClass.noRecuresionFibo (5);
		System.out.println("5번째 숫자:"+result);
		
		
		System.out.println("========================");
		
		TestClass obj = new TestClass ();
		result = obj.recursiveFibo(9);
		System.out.println("9번째 숫자:"+result);
		result = obj.recursiveFibo(10);
		System.out.println("10번째 숫자:"+result);
		result = obj.recursiveFibo(5);
		System.out.println("5번째 숫자:"+result);
	}

}
