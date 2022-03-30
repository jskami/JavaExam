
public class Ex1116_9 {

	public static void main(String[] args) {
		/* for문 이용 1 ~ 10 까지의 누적합 (교재 112p ~ )
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {          
			sum += i;
		}
		System.out.println(sum + "======" + i); */
		
		
		
		
		
		/*① 1 ~ 10 까지 홀수의 합
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 1)
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		
		/*② 1 ~ 10 까지 짝수의 합
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0)
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i);  //①,② 이거 고민하느라 머리 터지는 줄 알았는데.. 이거보다 더 간결한 식이 있다고 하네; 그래도 스스로 생각해서 해결했으니 뿌듯하긴 하다.*/
		
		
		
		
		//아래부터는 민재기 선생님의 식을 참고로 만듦
		/* 1 ~ 10 까지 홀수 합 (if식 뺀 .ver)
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i += 1) {
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		/* 1 ~ 10 까지 짝수 합 (if식 뺀 .ver)
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i += 2) {
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		
		//아래부터는 황선민 선생님의 식
		int i = 1;
		int sum = 0;
		//1 ~ 10 까지 짝수의 합
		sum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		;
		;
		//필요한 반복만 처리
		sum = 0;
		for (i = 1; i <= 10; i +=2) {
			
		}
		System.out.println(sum);
		
		//1 ~ 10 까지 홀수의 합
		sum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1 ~ 10 까지 출력
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}	

		
		/* for문은 반복횟수를 알고 있을때, while문은 조건에 따라 반복할 때(반복횟수가 랜덤할 때)사용
		   while과 do-while의 차이점은 조건을 먼저 검사하느냐, 나중에 검사하느냐! */
		
		
	}

}
