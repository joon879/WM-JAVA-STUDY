package webmon_khs_w01;

public class Television implements RemoteControl{//인터페이스 상속
	//필드
	private int volume;
	
	//turnOn 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOn 추상메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	//setvolume 추상메소드 오버라이딩, 볼륨 필드의 값 제한
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+this.volume);
	}

	//setVolume 추상메소드 오버라이딩
}	
