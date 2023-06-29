package com.wm.d01;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);		// Scanner 객체 생성
		// 변수 선언
		boolean run = true;	
		int speed = 0;			
		
		while(run) {		// while문 
			// for문은 정해진 만큼만 반복문이 돌지만, while문은 조건식이 true일 경우에는 무한으로 반복된다. false가 되야지만 종료가 되는 차이점이 있다
			// 그리고 조건식이 false일 경우에는 아예 돌지 않을수도 있음
			System.out.println("----------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("----------------------");
			System.out.println("선택: ");
			
			String strNum = sc.nextLine();		// 프로그램에 입력한 문자를 읽어옴
			
			if (strNum.equals("1")) {			// 위에서 읽어온 strNum이 1일 경우
				speed++;			// speed가 1증가
				System.out.println("현재 속도 : " + speed);
			}else if(strNum.equals("2")) {		// strNum이 2일 경우
				speed--;			// speed가 1감소
				System.out.println("현재 속도 : " + speed);
			}else if(strNum.equals("3")) {		// strNum이 3인 경우
				run = false;		// true 였던 run값을 false로 만들어 while문 종료
			}
		}
		
		System.out.println("프로그램 종료");
		
	}	// main
}	// class
