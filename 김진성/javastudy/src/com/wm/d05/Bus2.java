package com.wm.d05;

public class Bus2 implements Vehicle2{
	//추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

}
