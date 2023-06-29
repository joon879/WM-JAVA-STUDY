package webmon_khs_w01;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		// 삼항(조건)연산자 boolean 연습 [조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)]
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	}

}
