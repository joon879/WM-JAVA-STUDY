package webmon_khs_w01;

public class Car2 {
	// 인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		Car2 myCar = new Car2();
		//인스턴트 멤버 사용
		myCar.speed =200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//정적 멤버 : 메소드 영역의 클래스에 고정적으로 위치하는 멤버, 객체생성 필요x, 클래스를 통해 바로 사용 가능
		simulate();// 정적 메소드 호출
		
		//객체 생성
		Car2 myCar = new Car2();
		//인스턴트 멤버 사용
		myCar.speed = 60;
		myCar.run();
	
	}

}
