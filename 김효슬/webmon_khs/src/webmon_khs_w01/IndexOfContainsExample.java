package webmon_khs_w01;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		// 163pg. indexOf 특정 문자열의 위치값 찾기, substring 특정 위치의 문자열을 잘라 가져오기 
		String subject = "자바 프로그래밍";
		
		// "프로그래밍"이라는 문자열의 위치값 찾기
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		// 위치값을 기준으로 잘라낸 문자열 가져오기
		String subString = subject.substring(location);
		System.out.println(subString);
		
		// "자바"라는 문자열의 위치값 찾기
		// indexOf()메소드는 주어진 문자열이 포함되어있지 않으면 -1를 리턴한다
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		
	}

}
