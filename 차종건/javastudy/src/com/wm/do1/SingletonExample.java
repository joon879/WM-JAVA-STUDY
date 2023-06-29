package com.wm.do1;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInsSingleton();
		Singleton obj2=Singleton.getInsSingleton();
		
		if (obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다");
		}else {			
			System.out.println("다른 Singleton 객체입니다");
		}
	}
}
