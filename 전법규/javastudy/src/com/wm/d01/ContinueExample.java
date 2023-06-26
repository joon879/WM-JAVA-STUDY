package com.wm.d01;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {		// i는 1부터 10까지 1씩 증가
			if(i%2 != 0) {		// i를 2로 나누었을 때의 나머지가 0이 아닐 경우, 2로 나누었을 때 나머지가 홀수인 경우
				continue;		// 너미지가 홀수인경우에, for문(6번줄의 코드)으로 간다
			}	// if
			System.out.print(i + " ");	// 나머지가 0인경우,짝수일 경우 실행, 홀수인 경우에는 실행x
		}	// for
		
	}	// main
}	// class
