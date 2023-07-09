package com.wm.d05;

public class DriverExample {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus2 bus2 = new Bus2();
		Taxi taxi = new Taxi();
		
		//매개값은 구현 객체 대입(다형성 : 실행 결과가 다름)
		driver.drive(bus2);
		driver.drive(taxi);
	}
}
