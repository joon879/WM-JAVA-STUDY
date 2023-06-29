package com.wm.d02;

public class IndexOfContainsEx {
	public static void main(String[] args) {
		// 변수들은 모두 스택 이라는 메모리 영역에 생성된다.
		// 메모리영역 (메소드 영역 , 스택 영역, 힙 영역)
		// 메소드 영역 바이트 코드 파일을 읽은 내용이 저장되는 영역 클래스별로 상수,정적필드 메소드 코드, 생성자 코드 등 저장 
		// 힙 영역 객체가 생성되는 영역 객체의 번지는 메소드 영역과 스택 영역의 상수 변수에서참조가능
		// 스택 영역 메소드를 호출될 때마다 생성되는 프레임이 장되는 영역 메소드 호출이 끝나면 프레임은 자동 제거됨 
		String str= "자바 프로그래밍";
		int loc =str.indexOf("프로그래밍");// 프로그래밍 글자의 시작 위치
		System.out.println(loc);
		String subStr=str.substring(loc);
		System.out.println(subStr);
		
		loc = str.indexOf("자바");
		
		if(loc != -1) {// 주어진 문자열이 포함되어있는 경우
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와관련 없음");
		}
		
		boolean result= str.contains("자바");
		if(result) {
			System.out.println("자바와 관련된책 ");
		}else {
			System.out.println("자바와관련 없음");
		}
		
	}//main
}//class