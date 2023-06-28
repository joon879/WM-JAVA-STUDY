package com.wm.d03;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton s1 = new Singleton(); //컴파일 에러
		
		// 정적 메소드를 호출해서 싱글톤 객체 얻기
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// 동일한 객체를 참조하는지 확인하기
		if(s1 == s2) {
			System.out.println("동일한 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체 입니다.");
		}
	}//main
}//class