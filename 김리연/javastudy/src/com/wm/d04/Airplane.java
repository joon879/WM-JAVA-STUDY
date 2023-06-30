package com.wm.d04;

public class Airplane {
//메소드 오버라이딩 : 자식 클래스에서 재정의해서 사용하는 것
	
	// 메소드 선언
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}//