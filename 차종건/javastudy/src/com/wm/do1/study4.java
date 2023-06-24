package com.wm.do1;

import java.util.Scanner;

public class study4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		int speed=0;
		while (run) {
			System.out.println("------------------");
			System.out.println("1.증속 ||2.감속 ||3.정지");
			System.out.println("------------------");
			System.out.println("선택 :");
			String string = (String) scan.next();
			if (string.equals("1")) {
				speed++;
				System.out.println("현재속도 :"+speed);
			}else if (string.equals("2")) {
				speed--;
				System.out.println("현재속도 :"+speed);
			}else {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
