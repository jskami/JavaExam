
public class Ex1116_7 {

	public static void main(String[] args) {
		// do ~ while(홀수, 반복 횟수 줄이기)
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			System.out.println(sum + "======" + num);	
			num += 2;          //넘은 홀수, 거기에 +=의 값이 홀수가 나오도록 설정
		} while (num <= 10 );    
		System.out.println(sum + "======" + num);
		
	}

}
