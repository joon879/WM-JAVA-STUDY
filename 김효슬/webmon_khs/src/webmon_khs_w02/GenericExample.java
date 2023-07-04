package webmon_khs_w02;

//제네릭: 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
public class GenericExample {

	public static void main(String[] args) {
		// 모든 사람이 신청 가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		// 학생만 신청 가능
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	}

}

/*
 * Course.registerCourse1 메소드는 모든 사람이 등록 가능한 Course1에 대한 신청을 나타냅니다.
 * Course.registerCourse2 메소드는 학생만 등록 가능한 Course2에 대한 신청을 나타냅니다.
 * 각각의 registerCourse1,2,3 호출에서는 Applicant 객체를 생성하고, 해당하는 타입의 객체를 전달합니다.
 * 예를 들어, new Applicant<Person>(new Person())는 Person 객체를 가지고 있는 Applicant 객체를 생성하여
 * Course1,2,3에 등록합니다.
 */