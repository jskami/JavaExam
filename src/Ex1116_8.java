
public class Ex1116_8 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 짝수의 합(방법 제한 없음), while, do while 택일
		int num = 1;
		int sum = 0;
		do {
			if (num % 2 == 0) {                    //짝수   //넘 변수를 2로 나눈 나머지가 0인 경우 -를 의미
				sum += num;                        //누적 위치
			}
			num++;      
		} while (num <= 10 );    
		System.out.println(sum + "======" + num);  // 짝수의 합은 30 , ============, 11번째에서 계산 끝 -을 의미
	}

}
