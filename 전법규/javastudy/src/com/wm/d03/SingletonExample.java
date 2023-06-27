package com.wm.d03;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();		// 컴파일 에러
//		Singleton obj2 = new Singleton();		// 컴파일 에러		// private에 막혀 접근 불가
		
		// 정적 메소드를 호출해서 싱글톤 객체 얻음
		Singleton obj1 = Singleton.getInstance();		// obj1 에 singleton이 대입
		Singleton obj2 = Singleton.getInstance();		// obj2 에 singleton이 대입
		
		// 동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}	// main
}	// class
