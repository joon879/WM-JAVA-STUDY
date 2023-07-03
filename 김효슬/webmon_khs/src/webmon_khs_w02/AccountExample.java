package webmon_khs_w02;

import javax.naming.InsufficientResourcesException;

public class AccountExample {
	//try-catch 예외처리
	public static void main(String[] args) {
		//은행계좌 클래스의 출금 메소드에서 잔고 필드와 출금액을 비교해 잔고가 부족하면 예외를 발생시키고 throw한다
		//accountexample은 withdraw 메소드를 호출할때 예외처리를 한다
		
		
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch (InsufficientResourcesException e) {
			// 예외처리 코드+withdraw() 메소드 호출
		String message = e.getMessage();
		System.out.println(message);
		}
	}

}
