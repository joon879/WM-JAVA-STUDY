package webmon_khs_w01;

public class ContinueExample {

	public static void main(String[] args) throws Exception{
		// continue문(for,while,do-while문에서 사용)
		// 특정조건을 만족하는 경우에 continue문 실행, 그 이후 문장은 실행하지 않고 다음 반복으로 넘어간다.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { //2로 나눈 나머지가 0이 아닐 경우
				continue; // i가 짝수가 아니면 다음 반복으로 넘어감
			}
			System.out.println(i + "");	//홀수는 실행되지 않음.
		}
	}
}
