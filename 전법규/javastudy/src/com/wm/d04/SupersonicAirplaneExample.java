package com.wm.d04;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();		// SupersonicAirplane 클래스의 객체 sa 생성
		sa.takeOff();			// takeOff() 메소드 호출
		sa.fly();			// fly() 메소드 호출		flyMode = normal
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// flyMode를 supersonic 으로 설정
		sa.fly();			// flyMode가 supersonic인 채로 fly() 메소드 호출
		sa.flyMode = SupersonicAirplane.NORMAL;		// flyMode를 normal로 설정
		sa.fly();			// flyMode가 normal인 상태에서의 fly() 메소드 호출
		sa.land();		// land() 메소드 호출
		
	}	// main
}	// class
