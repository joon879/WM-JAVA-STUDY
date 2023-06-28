package com.wm.d03;

public class Singleton {
	// 싱글톤 패턴
	// 단 한개의 객체만을생성해서 사용하는 것을 말함
	// 생성자를 private 으로 접근 제한을 지정해서 외부에서 new 연산자로 생성자를 호출할수없도록 막는것
	
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언 
	private Singleton() {}
	
	// pulic 접근 권한을 갖는 정적 메소드 선언 
	public static Singleton getInstance() {
		return singleton;
	}
}//class