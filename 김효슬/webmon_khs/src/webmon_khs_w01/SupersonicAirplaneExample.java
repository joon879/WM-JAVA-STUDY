package webmon_khs_w01;

public class SupersonicAirplaneExample {
	// p296 상속 - 메인클래스, 부모,자식 메소드 호출
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		
		sa.fly();
		
		sa.land();

	}
}
