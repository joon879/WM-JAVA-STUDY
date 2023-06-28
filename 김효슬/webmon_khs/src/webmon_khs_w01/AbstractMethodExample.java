package webmon_khs_w01;
//추상클래스, 추상메소드, 오버라이딩 재정의
public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
		public static void animalSound(Animal animal) {
			animal.sound();//재정의된 메소드 호출
		}
}
