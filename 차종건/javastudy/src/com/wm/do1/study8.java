package com.wm.do1;

import java.util.Iterator;

public class study8 {
	public static void main(String[] args) throws Exception{
		int[] scores= {95,71,84,93,87};
		
		int sum=0;
		for(int score:scores) {
			sum=sum+score;
		}
		System.out.println("점수 총합="+sum);
		
		double avg=(double)sum/scores.length;
		System.out.println("점수 평균="+avg);
	}
}
