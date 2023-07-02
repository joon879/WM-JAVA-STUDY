package com.wm.d03;

public class CarInstance {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");

	}
	
	static void simulate() {
		CarInstance myCar = new CarInstance();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		CarInstance myCar = new CarInstance();
		myCar.speed = 60;
		myCar.run();
	}

}

