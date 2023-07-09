package com.wm.d06;

@SuppressWarnings("serial")
public class InsufficientException extends Exception {
	//사용자 정의 예외 생성
	public InsufficientException() {}

	
	public InsufficientException(String message) {
		super(message);
	}
}