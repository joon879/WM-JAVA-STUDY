package com.wm.d08;

public class Calculator {
	
	private int memory;

	public int getMemory() {	// private가 걸려있는 memory값을 외부에서 가져갈 수 있게 해주는 getter	
		return memory;
	}

	public synchronized void setMemory1(int memory) {	// 메소드 동기화 --> synchronized
		this.memory = memory;		// memory 값 저장
		try {
			Thread.sleep(2000);		// 스레드 일시정지 ( 2000 -> 2초 )
		} catch (InterruptedException e) {		// 예외 처리

		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);		// 출력
	}
	
	public void setMemory2(int memory) {
		synchronized (this) {		// 동기화 블록
			this.memory = memory;	// memory 값 저장
			try {
				Thread.sleep(2000);		// 스레드 일시정지 ( 2000 -> 2초 )
			} catch (InterruptedException e) {		// 예외 처리
				
			}	
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);		// 출력
			
		}	// synchronized
	} // setMemory
}	// class
