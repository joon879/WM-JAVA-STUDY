package com.wm.d02;

public class AdvancedForEx {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};
		
		//배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {// score 변수에 누적됨
			sum = sum+score;
			System.out.println("누적 : "+score);
		}
		System.out.println("점수 총합 = "+sum);
		// 배열 항목 전체 평균 구하기
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 = "+avg);
	}//main
}//class