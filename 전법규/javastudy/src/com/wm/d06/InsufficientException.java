package com.wm.d06;

public class InsufficientException extends Exception {		// 일반 예외로 선언
	
	// 2개의 생성자 선언
	public InsufficientException() {	// 매개변수 x
		
	}
	
	public InsufficientException(String message) {	// String 타입의 message 라는 매개변수를 받는다
		super(message);
	}
}
