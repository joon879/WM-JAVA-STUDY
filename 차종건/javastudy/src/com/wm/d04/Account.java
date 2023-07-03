package com.wm.d04;

import javax.naming.InsufficientResourcesException;

public class Account {
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
		public  long getBalance(){
			return balance;		
	}
		public void deposit(int money) {
			balance+=money;
		}
		public void wihtdraw(int money) throws InsufficientResourcesException{
			if(balance<money) {
				throw new InsufficientResourcesException("잔고부족"+(money-balance)+"모자람");
			}
			balance-=money;
		}
}
