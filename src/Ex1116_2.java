
public class Ex1116_2 {

	public static void main(String[] args) {
		//① if ~ else if ~ else 조건문 (교재 96p)
		/*int score = 99;
		if (score >= 90) {                 //스코어가 90보다 크거나 같은가?
			System.out.println("A학점");
		}
		
		if (score >= 80) {
			System.out.println("B학점");
		}
		
		if (score >= 70) {
			System.out.println("C학점");
		} */                           
		//① 이러한 작성법은 옳지 못하다. 하나의 스코어가 if 조건문 세 개에 모두 해당되기 때문이다.
		
		
		
		//② 그래서 else if를 사용하여 하나의 스코어에 대해 한 가지 조건문만 찾아서 적용되기 때문
		int score = 63;
		if (score >= 90) {                 //스코어가 90보다 크거나 같은가?
			System.out.println("A학점");
		} else if (score >= 80) {          //else의 의미는 바로 위에 있는 조건문에 대해서 거르겠다는 의미. "80보다 <= 점수 <90"이고 이것이 참이면 여기서 끝, 거짓이면 다음 else if 조건문으로 진행 순서이다. 
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}                             
		//② 스코어가 조건문에 거짓인 경우가 없었기 때문에 else조건문을 만들어서 낮은 스코어도 참,거짓이 나올 수 있게 else조건문을 적용한다.
				
		
		
		//연습해보자!
		int level = 54;
		if (level >= 90) {
			System.out.println("A랭크");
		} else if (level >= 80) {
			System.out.println("B랭크");
		} else if (level >= 70) {
			System.out.println("C랭크");
		} else if (level >= 60) {
			System.out.println("D랭크");
		} else if (level >= 50) {
			System.out.println("E랭크");
		}
		
		
		
		
	}
 
}
