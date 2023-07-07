package com.wm.d08;

public class JoinExample {
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();		// 클래스 SumThread의 객체 sumThread 생성
		sumThread.start();		// 스레드 실행
		try {
			sumThread.join();		// main이 SumThread 클래스의 run() 메소드가 전부 실행되기를 기다리게 하는 Join() 메소드
		} catch (InterruptedException e) {		// 예외 처리
			
		}
		
		System.out.println("1~100 합 : " + sumThread.getSum());	// 출력
		
	}	// main
}	// class
