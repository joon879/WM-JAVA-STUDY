package com.wm.d02;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");// 문자열이 시작되는 인덱스 리턴
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);

		location = subject.indexOf("자바");
		if (location != -1) {// 주어진 문자열이 포함되지 않으면 -1 리턴
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		boolean result = subject.contains("자바");// 포함되면 true, 포함안되면 false 리턴
		if (result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
