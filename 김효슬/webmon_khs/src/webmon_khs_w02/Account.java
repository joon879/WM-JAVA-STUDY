package webmon_khs_w02;

import javax.naming.InsufficientResourcesException;

//예외처리, throw+Exception, RuntimeException, InsufficientException
public class Account {
	//은행계좌 클래스의 출금 메소드에서 잔고 필드와 출금액을 비교해 잔고가 부족하면 예외를 발생시키고 throw한다
	//accountexample은 withdraw 메소드를 호출할때 예외처리를 한다
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws InsufficientResourcesException {
		if (balance < money) {
			throw new InsufficientResourcesException("잔고 부족: " + (money - balance) + " 모자람");
		}
		balance -= money;

	}
}
