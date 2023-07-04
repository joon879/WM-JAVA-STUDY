package com.wm.d04;

import javax.naming.InsufficientResourcesException;

public class AccountExample {
	public static void main(String[] args) {
		Account account=new Account();
		
		account.deposit(10000);
		System.out.println("예금액"+account.getBalance());
		
		try {
			account.wihtdraw(30000);
		} catch (InsufficientResourcesException e) {
			// TODO: handle exception
			String message=e.getMessage();
			System.out.println(message);
		}
	}
}
