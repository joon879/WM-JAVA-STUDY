package com.wm.d05;

public interface RemoteControl {
	
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;		
	
	// 추상 메소드
	void turnOn();			// 메소드 선언부만 작성
	void turnOff();
	void setVolume(int volume);		// public abstract가 생략된 추상메소드

}
