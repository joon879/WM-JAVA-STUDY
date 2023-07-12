package webmon_khs_w02;
//230706 멀티스레드: Sumthread 종료 후 메인스레드 실행 결과값을 받아 출력
public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumT.getSum());
	}

}
//위의 코드는 JoinExample 클래스를 나타내고 있습니다.
//이 클래스는 스레드의 join 메소드를 활용하여 스레드의 실행이 종료된 후에 결과를 받고 출력합니다.
//SumThread sumT = new SumThread();은 SumThread 클래스의 인스턴스인 sumT를 생성합니다.
//sumT.start();은 sumT 스레드를 시작합니다. 이 때, SumThread 클래스에서 정의한 run 메소드가 실행됩니다.
//sumT.join();은 sumT 스레드가 종료될 때까지 현재 실행 중인 스레드(main 스레드)를 일시적으로 중지합니다.
//즉, sumT 스레드의 실행이 완료될 때까지 대기합니다.
//System.out.println("1~100 합: " + sumT.getSum());은 sumT 스레드의 실행이 종료된 후에
//getSum 메소드를 호출하여 합계 값을 가져와 출력합니다. 이는 SumThread 클래스에서 계산된 합계 값을 출력하는 역할을 합니다.
//따라서 이 코드는 JoinExample 클래스를 사용하여 SumThread 스레드의 실행을 기다리고, 메인스레드의 실행이 종료된 후에 합계 값을 출력합니다.