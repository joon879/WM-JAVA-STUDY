package com.wm.d08;

public class JoinEx {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();// 계산 작업을 마칠 때 까지 메인스레드가 일시정지 상태에 있다가 sumThread 에서 최종 계산된 결과값을 산출하고 종료하면 메인스레드가 결과값을 받아 출력한다.
		} catch (Exception e) {
			
		}
		System.out.println("1~100까지합 : "+sumThread.getSum());
	}

}