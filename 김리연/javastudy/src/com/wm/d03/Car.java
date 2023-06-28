package com.wm.d03;
// 클래스 구성 멤버
// 필드 : 객체의 데이터가 저장되는 곳 (클래스 블록에 선언) 
// 생성자 : 객체 생성시 초기화 역할 담당
// 생성자 오버로딩 : 매개변수를 달리하는 생성자를 여러개 선언하는 것
// 메소드 : 객체의 동작으로 호출 시 실행하는 블록
public class Car {
	// 필드 선언 
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car(String model) {
		// 메개 변수를 3개 가지고 있는 생성자 호출
		this(model,"은색",250);
	}//constructor
	
	public Car(String model, String color) {
		// 메개 변수를 3개 가지고 있는 생성자 호출
		this(model,color,250);
	}//constructor
	
	public Car(String model,String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}//constructor
}// class