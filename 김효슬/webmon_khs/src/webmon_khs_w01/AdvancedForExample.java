package webmon_khs_w01;

public class AdvancedForExample {

	public static void main(String[] args) {
		// for문, 배열에 가져올 항목이 있을 경우 변수에 항목 저장->실행문 실행, 다시 반복 시 배열에서 가져올 다음 항목이 존재 시, 타입변수를 확인 후 실행하고 배열
		// 배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
		// 배열 항목 전체 합 구하기
		int sum = 0;
		for (int score : scores) {	//타입변수 : 배열
			sum = sum + score;	//반복 실행문, 5개의 항목이 한번씩 score변수에 저장되고 sum에 누적됨(반복횟수 5회) {95, 166, 250, 343, 430}
		}
		System.out.println("점수 총합 = "+ sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = "+ avg);
	}
}
