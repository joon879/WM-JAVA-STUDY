package webmon_khs_w01;

public class DriverExample {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus2 bus2 = new Bus2();
		Taxi2 taxi2 = new Taxi2();
		
		//매게값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.drive(bus2);
		driver.drive(taxi2);
		//자동 타입 변환->오버라이딩 메소드 호출-> 다형성

	}

}
