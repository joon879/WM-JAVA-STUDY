package webmon_khs_w02;

// 동기화 메소드, 블록 선언(메소드 전체가 아닌 일부 영역을 실행할때만 객체 잠금을 걸고 싶을때)
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메소드
	public synchronized void setMemory1(int memory) {
		// 메모리 값을 설정하고 2초간 일시 정지
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}

	public void setMemory2(int memory) {
		// 동기화 블록
		synchronized (this) {
			// 메모리 값을 설정하고 2초간 일시 정지
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}

/*
 * Calculator 클래스는 메모리 값을 저장하고 조회하는 기능을 가진 클래스입니다. memory는 Calculator 클래스의
 * 멤버변수로, 다른 스레드에서 접근하는 경우에 동기화를 해야 합니다. getMemory 메소드는 메모리 값을 반환하는 역할을 합니다.
 * setMemory1 메소드는 동기화 메소드로, 메모리 값을 설정하고 2초간 일시 정지합니다. 동기화 메소드를 사용하여 멀티스레드 환경에서
 * 안전한 접근을 보장합니다. setMemory2 메소드는 동기화 블록으로, synchronized 키워드를 사용하여 메모리 값을 설정하고
 * 2초간 일시 정지합니다. 동기화 블록을 사용하여 특정 영역을 동기화하고 멀티스레드 환경에서 안전한 접근을 보장합니다.
 */