package com.wm.d05;

public class Television implements RemoteControl {	// RemoteControl 인터페이스 구현
	
	// 필드
	private int volume;

	@Override		// 인터페이스 RemoteControl의 추상 메소드 오버라이딩
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {		
		if(volume > RemoteControl.MAX_VOLUME) {		
			this.volume = RemoteControl.MAX_VOLUME;		// (매개변수로 받은)volume 값이 MAX_VOLUME(10) 보다 크면 (필드의)volume = MAX_VOLUME(10)
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;		// (매개변수로 받은)volume 값이 MIN_VOLUME(0) 보다 작으면 (필드의)volume = MIN_VOLUME(0)
		}else {
			this.volume = volume;		// 매개변수로 받은 volume값이 필드의 volume으로
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}	// setVolume
	
}	// class
