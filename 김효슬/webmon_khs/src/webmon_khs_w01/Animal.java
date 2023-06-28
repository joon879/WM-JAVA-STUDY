package webmon_khs_w01;
//추상클래스, 추상메소드, 오버라이딩 재정의
public abstract class Animal {//추상클래스
		//메소드 선언
		public void breathe() {
			System.out.println("숨을 쉽니다.");
	}
		//추상 메소드 선언
		public abstract void sound();
}
