package com.wm.d08;
public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory2(50);//동기화 블록을 가진 메소드 호출
	}
}