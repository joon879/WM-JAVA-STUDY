package webmon_khs_w02;
//230706 멀티스레드: 스레드1 종료 후 스레드2 결과값을 받아 출력
public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
	}
}

//위의 코드는 SumThread 클래스를 나타내고 있습니다.
//이 클래스는 멀티스레드 환경에서 작동하는 스레드를 구현합니다.
//private long sum;은 스레드에서 계산된 합계 값을 저장하는 변수입니다.
//public long getSum()과 public void setSum(long sum)은
//합계 값을 가져오고 설정하기 위한 메서드입니다.
//public void run()은 Thread 클래스의 run 메서드를 오버라이딩한 메서드입니다.
//이 메서드는 스레드가 실행되었을 때 수행되는 코드를 정의합니다.
//여기에서는 1부터 100까지의 숫자를 더하여 합계를 계산하고 sum 변수에 저장합니다.
//따라서 이 코드는 SumThread 클래스를 사용하여 멀티스레드 환경에서
//1부터 100까지의 숫자의 합계를 계산할 수 있습니다.
