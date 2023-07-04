package com.wm.d06;

public class Account {
	private long balance;		// 잔고
	
	public Account() {
		
	}

	public long getBalance() {		// getter , 외부에서 (접근제어자)private로 접근이 불가한 balance값을 가져가고 싶을 때 사용
		return balance;		// (잔고)balance 리턴
	}
	
	public void deposit(int money) {	// 입금
		balance += money;	// 잔고에 (매개변수로 받은)money를 더함
	}
												// 호출한 곳으로 예외를 떠넘김
	public void withdraw(int money) throws InsufficientException{		// 출금
		if(balance < money) {		// (매개변수로 받은)money의 값이 (잔고)balance의 값보다 크면
			throw new InsufficientException("잔고부족 : " + (money-balance) + "원 모자람");	// 예외 발생
			// insufficientException(예외를) 발생시키고 throw 
		}
		balance -= money;
	}
	
}	// class
