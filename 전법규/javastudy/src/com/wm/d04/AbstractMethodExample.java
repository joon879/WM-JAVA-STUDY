package com.wm.d04;

public class AbstractMethodExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();		// Dog 클래스의 객체 dog 생성
		dog.sound();		// Dog 클래스의 sound() 메소드 호출
		
		Cat cat = new Cat();		// Cat 클래스의 객체 cat 생성
		cat.sound();		// Cat 클래스의 sound() 메소드 호출
		
		// 매개변수의 다형성
		animalSound(new Dog());		// animalSound() 메소드의 매개변수로 들어가서 자동 타입 변환된다
		animalSound(new Cat());		//		''
		
	}	// main
	
	public static void animalSound(Animal animal) {
		
		animal.sound();		// 오버라이딩 된 메소드 호출
		
	}	// animalSound
	
}	// class
