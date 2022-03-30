
public class Ex1116_4 {

	public static void main(String[] args) {
		/* While 반복문, 1부터 10까지 누적 합 (교재 107~9p)
		int num = 1;        // 반복문에서는 제어변수라 부른다.(1 ~ .... 계속 증가)
		int sum = 0;        // 누적합 저장, 초기화
		while (num <= 10) {
			sum += num;     //복합연산자 활용할 것. sum = sum + num 이런 공식은 잘 안쓴다.
		System.out.println("sum=" + sum + " , num=" + num);	
			num++;          //동일한 연산으로 ①num = num + 1, ②전위++num, ③복합연산num += 1 ④후위num++ 등이 있으며, 무엇을 적용하던 상관 없지만 보통은 후위 연산자를 쓴다.
		}
		System.out.println(sum); */
		
		
		
		
		
		//연습해보자! 1부터 100까지 누적 합
		int num = 1;
		int sum = 0;
		while (num <= 100) {
			sum += num;
		System.out.println("sum=" + sum + " , num=" + num);
			num++;
		}
		System.out.println(sum);		
	
	
		/* while (조건식) {
		   실행문 A;
		   }  */
		 
		// 와일문은 조금 더 심플하다. 조건에 만족한다면 실행문을 실행.
	
	
	
		
		
		
		
	}

}
