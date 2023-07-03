package com.wm.d06;

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();	// Account 클래스 객체 생성
		
		// 예금하기
		account.deposit(10000);		// 계좌에 10000 입금
		System.out.println("예금액 : "+ account.getBalance() + "원");
		
		// 출금하기
		try {
			account.withdraw(30000);	// 30000원 출금
		} catch (InsufficientException e) {		// 예외가 발생하면
			String message = e.getMessage();
			System.out.println(message);		// Account 클래스 20번줄 코드의 ()구문이 message
		}
		
	}	// main
}	// class
