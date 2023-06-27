package com.wm.d02;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");		// "프로그래밍"이 나오는건 3번쨰
		System.out.println(location);
		String substring = subject.substring(location);		// location은 3이였기 떄문에 subject에서 3번째 이후의 문자를 모두 출력
		System.out.println(substring);
		
		location = subject.indexOf("자바");		// 0
		if(location != -1) {		// location이 -1이 아니라면
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");		// "자바"가 subject에 포함되어 있는가, true of false
		if(result) {		// true
			System.out.println("자바와 관련된 책이군요");
		}else {		// false
			System.out.println("자바와 관련 없는 책이군요");
		}	
		
	}	// main
}	// class
