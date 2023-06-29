package webmon_khs_w01;

public interface RemoteControl {//인터페이스, 추상메소드의 집합
		//상수 필드
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		//추상 메소드 선언
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		
	}