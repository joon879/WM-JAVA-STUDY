package com.wm.d08;

public class SumThread extends Thread {		// 스레드 상속
	
	private long sum;

	public long getSum() {		// private가 걸린 sum 값을 외부에서 가져갈 수 있는 getter
		return sum;
	}

	public void setSum(long sum) {		// private가 걸린 sum 값을 외부에서 변경 할 수 있는 setter
		this.sum = sum;
	}

	@Override
	public void run() {		// 스레드를 통해 작업하고 싶은 내용을 적는 run() 메소드
		for(int i=0; i<=100; i++) {
			sum+=i;			// 스레드로 작업할 본문
		
		}	// for
		
	}	// run
	
}	// class
