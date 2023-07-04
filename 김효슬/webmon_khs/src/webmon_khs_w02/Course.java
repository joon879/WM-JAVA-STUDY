package webmon_khs_w02;
//제네릭: 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
public class Course {
	//모든 사람 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course1을 등록함");
	}
	//학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course2를 등록함");
	}
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+
				"이(가) Course3을 등록함");
	}
}

/*
 * 위의 코드는 Course 클래스를 나타내고 있습니다.
 * 이 클래스는 제네릭(Generic)을 활용하여 다양한 타입의
 * 등록자(Applicant)를 처리하는 메소드들을 가지고 있습니다.
 * 
 * registerCourse1 메소드는 모든 사람을 등록할 수 있습니다.
 * Applicant<?>를 매개변수로 받습니다. ?는 모든 타입을 나타냅니다.
 * applicant.kind.getClass().getSimpleName()는 등록자의 종류를 출력하는 부분입니다.
 * 
 * registerCourse2 메소드는 학생만 등록할 수 있습니다.
 * Applicant<? extends Student>를 매개변수로
 * 받습니다. ? extends Student는 Student 클래스 또는 그의 하위 클래스만을 나타냅니다.
 * 즉, Student 클래스와 그의 하위 클래스의 객체만을 받을 수 있습니다.
 * 
 * registerCourse3 메소드는 Worker 클래스 또는 그의 상위 클래스의 등록자만 등록할 수 있습니다.
 * Applicant<?super Worker>를 매개변수로 받습니다.
 * ? super Worker는 Worker 클래스 또는 그의 상위 클래스만을 나타냅니다.
 * 즉, Worker 클래스와 그의 상위 클래스의 객체만을 받을 수 있습니다.
 * 
 * 각 메소드는 등록자의 종류와 해당하는 Course의 등록을 출력합니다.
 */
