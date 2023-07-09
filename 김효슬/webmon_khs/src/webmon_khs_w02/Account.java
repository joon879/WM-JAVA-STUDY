package webmon_khs_w02;

import javax.naming.InsufficientResourcesException;

//예외처리, throw+Exception, RuntimeException, InsufficientException
public class Account {
	//은행계좌 클래스의 출금 메소드에서 잔고 필드와 출금액을 비교해 잔고가 부족하면 예외를 발생시키고 throw한다
	//accountexample은 withdraw 메소드를 호출할때 예외처리를 한다
	private long balance;
	// 계좌의 잔액을 나타내는 변수
	
	 // 기본 생성자
    public Account() {
    }

    // 잔액을 반환하는 메서드
    public long getBalance() {
        return balance;
    }

    // 입금하는 메서드
    public void deposit(int money) {
        // 잔액에 입금액을 추가합니다.
        balance += money;
    }

    // 출금하는 메서드
    public void withdraw(int money) throws InsufficientResourcesException {
        // 출금할 금액이 잔액보다 큰 경우 예외를 발생시킵니다.
        if (balance < money) {
            throw new InsufficientResourcesException("잔고 부족: " + (money - balance) + " 모자람");
        }
        // 출금할 금액을 잔액에서 차감합니다.
        balance -= money;
    }
}

//balance 변수는 계좌의 잔액을 나타내는 long 타입의 멤버 변수입니다.
//Account 클래스는 기본 생성자를 갖고 있습니다. 잔액을 초기화할 때 사용할 수 있습니다.
//getBalance() 메서드는 현재 계좌의 잔액을 반환하는 메서드입니다. 호출 시 balance 변수의 값을 반환합니다.
//deposit(int money) 메서드는 입금을 처리하는 메서드입니다. money 파라미터로 전달된 금액을 잔액에 더합니다.
//withdraw(int money) 메서드는 출금을 처리하는 메서드입니다. money 파라미터로 전달된 금액을 잔액에서 차감합니다. 만약 잔액보다 출금 금액이 더 큰 경우 InsufficientResourcesException 예외를 발생시킵니다.
//위 코드에서 InsufficientResourcesException 클래스는 javax.naming 패키지에서 제공되는 예외 클래스입니다. 잔액 부족 시 예외를 처리하기 위해 사용됩니다.