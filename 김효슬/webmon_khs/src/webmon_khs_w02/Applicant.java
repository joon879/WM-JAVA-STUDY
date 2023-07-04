package webmon_khs_w02;
//제네릭: 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
public class Applicant<T> {
	public T kind;

	public Applicant(T kind) {
		this.kind = kind;
	}
}

/*
 * 위의 코드는 Applicant 클래스를 나타내고 있습니다.
 * 제네릭(Generic)을 사용하여 여러 다른 데이터 타입을 가질 수 있는 kind 멤버 변수를 갖습니다.
 * 
 * kind 변수는 제네릭 타입 T로 선언되었습니다. 이는 Applicant 클래스가 생성될 때
 * 어떤 데이터 타입을 사용할 지를 나타냅니다. 즉, kind 변수는 T 타입의 객체를 저장할 수 있습니다.
 * 
 * Applicant 클래스의 생성자는 T kind 매개변수를 받습니다.
 * 이 생성자는 kind 변수에 전달된 값을 저장합니다.
 * 
 * 이렇게 제네릭을 사용하면 Applicant 클래스는 다양한 타입의 객체를 다룰 수 있습니다.
 * ex) Applicant<String> Applicant<Integer>는 kind 변수에 문자열, 정수 저장가능
 */