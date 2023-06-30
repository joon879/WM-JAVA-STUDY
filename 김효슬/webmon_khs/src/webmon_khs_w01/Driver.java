package webmon_khs_w01;

public class Driver {
	void drive(Vehicle2 vehicle2) {
		// 구현 객체가 대입될수 있도록 매개변수를 인터페이스 타입 선언
		vehicle2.run(); // 인터페이스 메소드 호출, 재정의한 메소드가 실행됨
	}
}
