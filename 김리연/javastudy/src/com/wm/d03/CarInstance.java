package com.wm.d03;

public class CarInstance {
	
	// 정적 멤버(정적 메소드)
	// 가변 길이 매개변수를 갖는 메소드 선언
	static int sum(int ...v) {
		// sum 변수 선언
		int sum = 0;
		
		// values 는 배열타입의 변수처럼 사용
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		// 합산 결과 리턴
		return sum;
	}
	
	// 인스턴스 필드 선언 
	int speed;
	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + " 으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		CarInstance myCar = new CarInstance();
		// 인스턴스 멤버 사용
		myCar.speed=200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// 가변길이 메소드 호출
		System.out.println(sum(20,30,40,50));
		
		// 정적 메소드 호출 
		simulate();
		
		// 객체 생성
		CarInstance myCar = new CarInstance();
		// 인스턴스 멤버 사용
		myCar.speed=60;
		myCar.run();
	}// main
}// class