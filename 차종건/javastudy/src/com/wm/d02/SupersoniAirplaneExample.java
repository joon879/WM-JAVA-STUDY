package com.wm.d02;

public class SupersoniAirplaneExample {
	public static void main(String[] args) {
		SupersoniAirplane sa=new SupersoniAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymood=SupersoniAirplane.supersonic;
		sa.fly();
		sa.flymood=SupersoniAirplane.normal;
		sa.fly();
		sa.land();
		
		
	}
}
