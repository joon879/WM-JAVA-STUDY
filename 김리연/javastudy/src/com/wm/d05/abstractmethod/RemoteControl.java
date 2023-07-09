package com.wm.d05.abstractmethod;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}//interface