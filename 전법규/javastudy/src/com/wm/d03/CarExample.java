package com.wm.d03;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car("자가용");			// 매개변수가 1개인 생성자 Car
		System.out.println("Car1.Company : " + car1.company);		
		System.out.println("Car1.Model : " + car1.model);
		System.out.println();
		
		Car car2 = new Car("자가용","빨강");			// 매개변수가 2개인 생성자 Car
		System.out.println("Car2.Company : " + car2.company);		
		System.out.println("Car2.Model : " + car2.model);
		System.out.println("Car2.Color : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("택시","검정",200);			// 매개변수가 3개인 생성자 Car
		System.out.println("Car3.Company : " + car3.company);		
		System.out.println("Car3.Model : " + car3.model);
		System.out.println("Car3.Color : " + car3.color);
		System.out.println("Car3.maxSpeed : " + car3.maxspeed);		
		
	}	// main
}	// class
