package webmon_khs_w01;

//p296 상속 - 부모,자식 메소드 호출
public class Airplane {
	// 메소드 선언(부모클래스)
	public void land() {
		System.out.println("착륙합니다.");
	}

	public void fly() {
		System.out.println("일반 비행합니다.");
	}

	public void takeOff() {
		System.out.println("이륙합니다.");

	}
}
