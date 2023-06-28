package com.wm.d04;

public class Dog extends Animal {

	@Override			// 상속받은 Animal의 추상 메소드 오버라이딩		// 필수
	public void sound() {
		System.out.println("멍멍");
	}
	
}	// class
