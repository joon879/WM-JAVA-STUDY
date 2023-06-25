package com.wm.d01;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 96;
		char grade = (score > 95) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(score + "점은" + grade + "등급입니다.");
	}
}
