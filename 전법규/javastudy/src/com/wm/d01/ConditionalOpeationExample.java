package com.wm.d01;

public class ConditionalOpeationExample {
	public static void main(String[] args) {
		
		int score = 85;		// 변수 score에 값 대입 (85)
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');	// score의 값이 90보다 크면 A , 80보다 크면 B , 그 외엔 C
		System.out.println(score + "점은 " + grade + "등급입니다.");		// score의 값을 85로 대입헀기 떄문에 그에 맞는 grade는 B
		
	}	// main
}	// class
