package com.wm.d08;

public class SumThread extends Thread {
// 쓰레드 : 코드의 실행 흐름
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum+=i;
		}
	}
}