package webmon_khs_w01;

public class Bus2 implements Vehicle2 {//인터페이스 상속
	//추상메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
