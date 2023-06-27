package com.wm.d01;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		for(int m=2; m<=9; m++) {	// m은 2부터 9까지 1씩 증가
			System.out.println("*** " + m + "단 ***");		// 아래 for문이 다 돌면 그제서야 한번 돌아감
			for(int n=1; n<=9; n++) {		// n은 1부터 9까지 1씩 증가
				System.out.println(m + " x " + n + " = " + (m*n));
				// m이 1 증가할 때마다 n은 1~9까지 도는게 반복
			}
			System.out.println("--------------------------");
		}

	}	// main
}	// class
