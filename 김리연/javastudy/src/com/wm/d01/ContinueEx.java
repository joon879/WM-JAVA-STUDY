package com.wm.d01;

public class ContinueEx {

	public static void main(String[] args) {

		// 특정 조건을 만족하는 경우 그 조건을 출력하지 않음
		for (int i = 0; i < 10; i++) {
			if(i%2 !=0) {
				continue;// 홀수인 경우 출력하지 않는다.
			}//if
			System.out.println(i);
		}//for
	}//main 

}// class