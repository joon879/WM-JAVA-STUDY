package com.wm.d03;

public class Car2 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		
		Car2 hoCar = new Car2();
		 
		
		hoCar.speed = 200;
		hoCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		 
		Car2 hoCar2 = new Car2();
		hoCar2.speed = 60;
		
		hoCar2.run();
	}
}
