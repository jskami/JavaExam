
public class Ex1116_6 {

	public static void main(String[] args) {
		// do while, 홀수의 합
		int num = 1;
		int sum = 0;
		do {
			if (num % 2 == 1) {                    //홀수   //넘 변수를 2로 나눈 나머지가 1인 경우 -를 의미
				sum += num;                        //누적 위치
			}
			num++;
		} while (num <= 10);    
		System.out.println(sum + "======" + num);  //11이 나오는 것은 11에서부터 계산은 멈췄다 -를 의미
	
	}

}
