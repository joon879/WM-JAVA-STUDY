package com.wm.d06;

import javax.naming.InsufficientResourcesException;

public class Account {
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balacne;
		}

	public void deposit(int money) {
		balance+=money;
	}
	
	public void widthdraw(int money) throws InsufficientResourcesException {
		if( balance<money) {
			throw new InsufficientException("잔고부족 :" + (money-balance)+"모자람");
		}
		balance - =money;
	}
