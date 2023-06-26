package com.wm.d01;

public class MultiplicationTableEx {
	public static void main(String[] args) {
		// 중첩 for 문으로 구구단
		for (int i = 1; i <= 9; i++) {
			System.out.println("***"+i+"단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" x " + j +" = " +(i*j));
			}//for j
		}//for i
	}//main
}//class