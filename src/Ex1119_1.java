
public class Ex1119_1 {

	public static void main(String[] args) {
		// continue구문, 1~100까지 홀수만 더한 값을 구하라 (교재119p)
		int total = 0;
		int num;
		for (num = 1; num <= 100; num++) {
			if(num % 2 == 0) {
				continue;    //소속된 반복구문 중에서 아래 라인을 생략한다 -의 의미
			}
			total += num;    //num이 홀수일때만 실행
		}
		System.out.println(total);
	}

}
