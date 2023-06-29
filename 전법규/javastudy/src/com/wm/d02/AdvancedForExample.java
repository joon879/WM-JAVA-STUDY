package com.wm.d02;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		// 배열 변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};		// int값 배열인 scores (크기 : 5)
		
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {			// scores의 각 데이터들을 score에 가져온다
			sum = sum + score;				// 가져온 score값을 sum에 누적
		}
		System.out.println("점수 총합 = " + sum);				// score 들의 합
		
		// 배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;	
		System.out.println("점수 평균 = " + avg);
		
	}	// main
}	// class
