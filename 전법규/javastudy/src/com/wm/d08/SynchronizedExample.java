package com.wm.d08;

public class SynchronizedExample {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();		// calculator 按眉 积己
		
		User1Thread user1Thread = new User1Thread();	// user1Thread 按眉 积己
		user1Thread.setCalculator(calculator);
		user1Thread.start();		// 胶饭靛 角青
		
		User2Thread user2Thread = new User2Thread();	// user2Thread 按眉 积己
		user2Thread.setCalculator(calculator);
		user2Thread.start();		// 胶饭靛 角青
		
	}	// main
}	// class
