package com.wm.d06;

public class Account {

	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance +=money;
	}
	
	public void withdraw(int money) throws InsufficientException{//호출된 곳으로 예외 떠넘긴다.
		if(balance<money) {
			//예외발생시키기
			throw new InsufficientException("잔고부족 : "+(money-balance)+" 모자람");
		}
		balance -=money;
		
	}
}