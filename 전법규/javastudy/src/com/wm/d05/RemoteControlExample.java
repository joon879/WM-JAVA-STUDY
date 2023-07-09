package com.wm.d05;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();	// 인터페이스로 Television 객체 사용
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(20);
		rc.setVolume(-2);
		rc.turnOff();
		
		System.out.println("-------------------------");
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(20);
		rc.setVolume(-2);
		rc.turnOff();
		
	}	// main
}	// class
