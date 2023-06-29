package webmon_khs_w01;

public class Bus implements Vehicle{//인터페이스 상속
	//추상메소드 오버라이딩
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//추가 메소드 생성
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
