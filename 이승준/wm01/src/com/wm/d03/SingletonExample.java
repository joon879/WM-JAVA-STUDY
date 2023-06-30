package com.wm.d03;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b4189a33e9e9a8bb53e657f6e3f67639da466098
