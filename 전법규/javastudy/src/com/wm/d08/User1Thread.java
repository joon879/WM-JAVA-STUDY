package com.wm.d08;

public class User1Thread extends Thread {		// 스레드 상속
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");		// 스레드의 이름을 변경
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;		// 외부에서 공유 객체인 Calculator를 받아 필드에 저장
	}

	@Override
	public void run() {		// 스레드를 작업할 구문 작성
		calculator.setMemory1(100);		// 동기화 메소드 호출
	}
	
	

}
