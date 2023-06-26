package com.wm.d01;

public class ConditionalOperationEx {
	public static void main(String[] args) {
		// 삼항(조건)연산자
//		조건식 ? true : false
		int score = 85;
		// score 가 90점보다 크면 A 등급 80점 보다크면 B등급 그 외에 C 등급
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
		System.out.println(score + "점 : "+grade + "등급");
 	}//main
}//class