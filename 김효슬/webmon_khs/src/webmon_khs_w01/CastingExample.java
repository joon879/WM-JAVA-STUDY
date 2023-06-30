package webmon_khs_w01;

public class CastingExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 타입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해 호출
		vehicle.run();
		//vehicle.checkFare(); (x)호출불가
		
		//강제 타입 변환후 호출
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
