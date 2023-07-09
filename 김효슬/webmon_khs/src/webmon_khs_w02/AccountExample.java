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
//위 코드는 AccountExample 클래스로, Account 클래스를 사용하는 예시 코드입니다.
//먼저 Account 객체 account를 생성합니다.그리고 account 객체를 사용하여 예금을 진행합니다.
//account.deposit(10000); 코드를 통해 10000원을 예금합니다.
//그 후 account.getBalance()를 호출하여 현재 잔액을 출력합니다.
//이어서 출금을 진행합니다. account.withdraw(30000); 코드를 호출합니다. 이때 출금액이 잔액보다 크기 때문에 InsufficientResourcesException 예외가 발생합니다.
//catch 블록에서는 InsufficientResourcesException 예외를 처리합니다. 예외 객체의 메시지를 가져와 message 변수에 저장하고, 이를 출력합니다. 이를 통해 "잔고 부족: (부족한 금액) 모자람" 형태의 메시지가 출력됩니다.
//이렇게 예외 처리를 통해 출금 시 잔고 부족 예외를 처리하는 예시 코드입니다.