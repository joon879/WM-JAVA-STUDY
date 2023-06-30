package webmon_khs_w01;
//추상클래스, 추상메소드, 오버라이딩 재정의
public class Cat extends Animal{//상속 자식클래스
	//추상 메소드 재정의
	@Override	//오버라이딩
	public void sound() {
		System.out.println("야옹");
	}
}

