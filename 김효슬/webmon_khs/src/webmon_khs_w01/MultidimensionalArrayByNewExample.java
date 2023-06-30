package webmon_khs_w01;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// 183pg 각 반의 학생 수가 3명으로 동일할 경우, 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열생성(합계, 평균)
		int[][] mathScores = new int[2][3];
		// 배열 항목 초기값 출력

		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			for (int j = 0; j < mathScores[i].length; j++) { // 해당 반의 학생 수만큼 반복
				System.out.println("mathScores[" + i + "][" + j + "]:" + mathScores[i][j]);

			}
		}
		System.out.println();
		
		// 배열 항목 값 지정
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0; // 전체학생수
		int totalMathSum = 0; // 수학 총점
		for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
			totalStudent += mathScores[i].length; // 반의 학생 수 합산
			for (int j = 0; j < mathScores.length; j++) { // 해당 반의 학생수만큼 반복

				totalMathSum += mathScores[i][j]; // 학생 수학점수 합산
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();

		// 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] englshScores = new int[2][];
		englshScores[0] = new int[2];
		englshScores[1] = new int[3];
		// 배열 항목 초기값 출력
		for (int i = 0; i < englshScores.length; i++) {
			for (int j = 0; j < englshScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]:" + englshScores[i][j]);
			}
		}
		System.out.println();
		
		// 배열 항목 값 변경
		englshScores[0][0] = 90;
		englshScores[0][1] = 91;
		englshScores[1][0] = 92;
		englshScores[1][1] = 93;
		englshScores[1][2] = 94;
		// 전체 학생의 영어 평균 구하기
		totalStudent = 0; // 전체학생수 초기화
		int totalEnglishSum = 0; // 영어 총점
		for (int i = 0; i < englshScores.length; i++) { // 반의 수만큼 반복
		    totalStudent += englshScores[i].length; // 반의 학생 수 합산
		    for (int j = 0; j < englshScores[i].length; j++) { // 해당 반의 학생수만큼 반복
		        totalEnglishSum += englshScores[i][j]; // 학생 영어점수 합산
		    }
		}
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);

		}
	}
