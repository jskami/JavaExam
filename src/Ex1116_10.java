
public class Ex1116_10 {

	public static void main(String[] args) {
		/* 중첩된 반복문 (교재 116p ~ ) 진짜 정말 엄청 레알 중요하니까 반드시 이해해야한다.
		int dan;
		int times;
		for(dan = 2; dan <= 9; dan++) {                                       //단을 9개로 나열했다! 외부for문
			for (times = 1; times <= 9; times++) {                            //9개로 나눈 각 단에서 또 9개씩 출력되도록 나누었다! 내부for문
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");    //""문자 속성 넣고 * 넣으면 곱하기가 아닌 곱하기의 의미로 나타난다. println출력은 세로로, print출력은 가로로 나타난다.
																				   //맨 끝에 + " "를 넣으면 공백을 두고 출력된다.
																				   //맨 끝 + "  " 사이에 \t(tab을 의미)을 넣고 출력하면 행이 일정 간격으로 나타난다.
			}
			System.out.println();    //줄바꿈, 내용 없어도 상관없다. 내부 반복문을 기준으로 바깥 블럭에서 println으로 출력하면 세로로 나타난다.
		} */
		
		int dan;
		int times;
		for(dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.print(times + "*" + dan + "=" + (dan*times) + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
