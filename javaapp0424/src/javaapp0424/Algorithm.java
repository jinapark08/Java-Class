package javaapp0424;

public class Algorithm<T> {
	// 정수 2개를 매개변수로 받아서 swap하는 메소드
	public void swap(T n1, T n2) {
		T temp = n1;
		n1 = n2;
		n2 = temp;

	}
}

// Algorithm 클래스의 인스턴스를 생성
//Algorithm <Integer>obj =new Algorithm<>();
