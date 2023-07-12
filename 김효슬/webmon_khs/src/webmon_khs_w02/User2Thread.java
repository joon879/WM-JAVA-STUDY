package webmon_khs_w02;
//동기화 메소드, 블록 선언(메소드 전체가 아닌 일부 영역을 실행할때만 객체 잠금을 걸고 싶을때)
public class User2Thread extends Thread{
	private Calculator calculator;	
	
	public User2Thread() {
		setName("User2Thread");	//스레드 이름 변경
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory2(50);	//동기화 메소드 호출
	}
}
