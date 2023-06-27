package webmon_khs_w01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 71pg: scanner입력, while 무한루프 반복문
		Scanner sc = new Scanner(System.in);

		System.out.println("x 값을 입력하세요 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX); // 입력받은 문자 strX를 정수로 변환하시오.

		System.out.println("y 값을 입력하세요 : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY); // 입력받은 문자 strY를 정수로 변환하시오.

		int result = x + y;
		System.out.println("x + y : " + result);	//입력받은 x+y 합계 결과값을 출력
		System.out.println();

		while (true) { // 중괄호 안을 무한히 반복 실행
			System.out.println("입력 문자열: ");
			String data = sc.nextLine();
			if (data.equals("quit")) { // 만약 quit라는 문자열이 들어오면 반복을 break 멈춰라.
				break;
			}
			System.out.println("출력 문자열: " + data);	//입력받은 문자열을 출력
			System.out.println();

			}
			System.out.println("종료");	//quit이 입력되면 "종료" 라고 출력한다.
	}

}
