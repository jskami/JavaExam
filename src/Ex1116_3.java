
public class Ex1116_3 {

	public static void main(String[] args) {
		//③ switch-case 조건문 (교재101p)
		int score = 84;
		switch (score / 10) {                                //스위치는 조건식이 아닌 값을 작성하는 문법이다.
		case 10:                               //100점에 대한 경우
			 System.out.println("A학점");       //블럭 기호는 써도 그만 안써도 그만.
			 break;
		case 9 :                               //90점대에 대한 경우
			 System.out.println("A학점");
			 break;
		case 8 :                               //80점대에 대한 경우
			 System.out.println("B학점");
			 break;
		case 7 :                               //70점대에 대한 경우
			 System.out.println("C학점");
			 break;
		case 6 :                               //60점대에 대한 경우
			 System.out.println("D학점");
			 break;
		default :                              //해당 사항 없는 경우
			 System.out.println("F학점");
			 
		 
		/*③ case의 경우 100점 ~ 0점까지 100개를 만들면 너무 길고 시간도 오래 걸리고 여러가지로 비 효율적이다. 이 경우, 10점대로 나누어서 만들면
			case는 10개만 만들면 된다. 10개 중에서도 학점에 해당하지 않는 만큼은 만들 필요가 없다. 이 상태에서 출력하면 99점에 대한 학점 값은 A,B,C,D,F전부 나올것이다.
			스위치 문법은 else if 처럼 다음 조건문으로 가도록 작성하지 않아도 자동으로 다음 조건문으로 넘어가기 때문이다. 이를 방지하고 점수에 해당하는 조건식에만 적용하기 위해서
			각각의 조건식 끝에 break를 작성한다. 그러면 99점에 대한 해당 조건문에만 적용하여 결과가 출력될 것이다. */
			 
			 
		/* break문은 반복문인 for, while, do-while문의 실행을 중지할 때 사용한다. switch문에서도 break문을 사용하여 종료한다.
		   break;가 쓰이면 가장 가까운 반복문을 아예 빠져나온다고 생각하면 쉽다.
		
			 
		/* 연습문제	 
		int score = 79;
 		char grade;
		switch (score / 10) {
		case 10 :                             
			grade = "A";
			break;
		case 9 :
			grade = "B";		
			break;
		case 8 :
			grade = "C";				
			break;
		case 7 :
			grade = "D";				
			break;
		default :                             
			grade = "F";
		}
	//이 부분에 등급을 출력
	System.out.println("당신의 점수는" + score + "이며, 등급은" + grade + "입니다."); */
	
			 
			 
			 
			 
			 
		}
	}

}
