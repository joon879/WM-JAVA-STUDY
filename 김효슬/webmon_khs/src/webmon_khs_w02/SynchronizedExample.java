package webmon_khs_w02;

//동기화 메소드, 블록 선언(메소드 전체가 아닌 일부 영역을 실행할때만 객체 잠금을 걸고 싶을때)
public class SynchronizedExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		// User1Thread 인스턴스 생성
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		// User2Thread 인스턴스 생성
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}

}

/*
 * SynchronizedExample 클래스는 Calculator 클래스의 동기화 메소드와 동기화 블록을 활용하는 예제입니다.
 * Calculator 객체를 생성하고, 해당 객체를 User1Thread와 User2Thread에 전달하여 사용합니다.
 * User1Thread와 User2Thread는 동기화된 Calculator 객체에 접근하여 작업을 수행합니다. 이 예제는 메소드 전체가
 * 아닌 특정 영역에서만 객체 잠금을 걸고자 할 때 동기화 블록을 사용하는 방법을 보여줍니다. 이를 통해 멀티스레드 환경에서 객체의 일부
 * 영역만 동기화하여 안전하게 작업을 수행할 수 있습니다.
 */