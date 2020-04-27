package javaapp0427;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// 스택생성 
		Stack <String>stack = new Stack<>();
		//스택에 데이터 삽입
		stack.push("Denni");
		//스택에서 데이터를 꺼내기 
		String data = stack.pop();
		System.out.println(data);
		//스택에 데이터가 없는데 꺼내려고 해서 예외발생 
        data = stack.pop();
	}

}
