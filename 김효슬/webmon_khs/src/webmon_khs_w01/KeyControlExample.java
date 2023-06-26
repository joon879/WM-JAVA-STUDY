package webmon_khs_w01;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// while문
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while (run) {//run 변수값 true, 무한반복
			System.out.println("----------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("----------------------");
			System.out.println("선택: ");
			
			String strNum = sc.nextLine();
			
			if (strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {//run이 false값이 되어 while문 조건식도 false가 되므로 무한반복 종료
				run = false;			
			}
		}

			System.out.println("프로그램 종료");
	}

}
