package com.wm.d03;

public class Car2 {
	//인스턴스 필드 선언
	int speed;
	
	//인스턴트 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		Car2 mayCar2=new Car2();
		//인스턴스 멤버 사용
		mayCar2.speed=200;
		mayCar2.run();
	}

	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car2 myCar2=new Car2();
		//인스턴스 멤버 사용
		myCar2.speed = 60;
		myCar2.run();
	}
}
