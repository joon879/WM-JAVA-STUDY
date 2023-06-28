package com.wm.d04;

public class AbstractMethodEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		
		cat.sound();
		
		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}//main
	
	public static void animalSound(Animal animal) {// 부모와 자식 간의 자동 타입 형변환
		animal.sound();// 재정의된 메소드 호출
	}
}//class