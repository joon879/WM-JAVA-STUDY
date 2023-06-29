package com.wm.d03;

public class CarInstance {
	int speed;
	
	void run() {
		System.out.println(speed + "Ŕ¸ˇÎ ´Ţ¸ł´Ď´Ů.");

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

