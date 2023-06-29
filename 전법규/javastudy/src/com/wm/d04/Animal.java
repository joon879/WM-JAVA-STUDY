package com.wm.d04;

public abstract class Animal {		// 추상메소드가 존재하기 때문에 추상클래스
	
	// 메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 선언
	public abstract void sound();

}	// class
