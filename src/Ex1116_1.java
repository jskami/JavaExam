
public class Ex1116_1 {

	public static void main(String[] args) {
		// 조건문 (21.11.16 교재92p)
		int age = 7;              //변수 선언과 동시에 변수 값을 대입했기 때문에 이는 '초기화'이다. 전에 배웠음(생성도 포함)
		
		if (age >= 8)            //if다음엔 반드시 ()가 나와야 한다.
			System.out.println("학교에 다닙니다.");
		else                     //else는 if 행에 있던, 아래에 있던 상관 없지만 대개 if행에 이어서 작성하는 편이 많다.
			System.out.println("학교에 다니지 않습니다.");
		//실행문이 한 줄일 경우 블럭 기호가 없어도 실행은 가능하다. ex/ {}지우고 출력해도 값은 나온다.
		
		
		
		//연습해보자!
		int level = 50;
		
		if (level >= 63)
			System.out.println("길드에 가입할 수 있다.");
		else
			System.out.println("길드에 가입할 수 없다.");
		
		
		int grade = 58;
				
		if (grade >= 60)
			System.out.println("통과");
		else
			System.out.println("재시험");
		
		
	}

}
