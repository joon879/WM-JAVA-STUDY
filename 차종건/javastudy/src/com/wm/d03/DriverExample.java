package com.wm.d03;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver=new Driver();
		
		Bus2 bus=new Bus2();
		Taxi taxi=new Taxi();
		
		driver.drive(bus);		
		driver.drive(taxi);		
	}
}
