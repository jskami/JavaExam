
public class Ex1112_1 {

	public static void main(String[] args) {
		// 기본 연산자
		int num1 = 90;             //int같은 앞에 수식어는 타일이라 말한다.
		int num2 = 70;
		int num3 = num1 + num2;
		System.out.println(num3);  //더하기 연산의 결과이다.
		
		num3 = num1 / num2;        //위에서의 num3은 정의한 것이고 여기서의 num3은 수식이다.
		System.out.println(num3);  //나누기 연산의 결과이다.
		
		double num4 = (double)num1 / (double)num2;  //num1,2에 더블을 캐스팅 한 것과 하지 않은 것의 결과는 다르다. num1, 2중 하나만 더블 캐스팅 해도 되고 둘다 해도 된다. double <- int + double 이다. 
		System.out.println(num4);  //나누기 연산중 더블을 적용하여 소수점을 표현한 연산의 결과이다.
		
		num4 = (double)(num1 / num2);  //이렇게 연산하면 절대 안된다.		
		System.out.println(num4);      //14L 처럼 같은 나누기 연산으로 했지만 결과가 다르게 출력된다.
		
		int num5 = 10 % 7;  //10을 7로 나눈 나머지를 구하는것. 나머지 연산자.(많이 쓰임) 
		System.out.println(num5);
		
		int num6 = 10 / 7;  //5를 7로 나눈 몫
		System.out.println(num6);
		
		int num7 = num6 * 7 + num5;  //복원 
		System.out.println(num7);
		
		//Q1. 0 ~ 100까지의 정수를 7로 나눈 나머지를 구하면? 가능한 값은? ->답 6 ??이해 필요..
		
		// 증가,감소 연산자
		int num8 = 10;
		System.out.println("num8 : " +num8);  //문자열추가?
		++num8; /*->단항연산자를 이용한 증가 연산자이며 전위연산이라 한다. num8 = num8 +1;  //여기서 =의 의미는 같다는 의미가 아닌 '~은(는)'이다. 이거 진짜 레알 헷린다 중요하다.*/
		System.out.println("num8 : " +num8);
		num8++; // 후위연산이라 한다.
		System.out.println("num8 : " +num8);
		
		// 전위 연산
		int num9 = 10;
		int num10 = ++num9;  //num9 변수의 값을 먼저 1증가시키고 num10에 저장하는 전위연산이다.
		System.out.println("num10 : " +num10);
		
		// 후위 연산
		int num9a = 10;
		int num11 = num9a++;  //num9a 변수의 값을 다음 행에서 1증가시키지만, 현재 행에서는 증가되지 않음, 여기서 증가 주체는 num9a다.
		System.out.println("num11 : " +num11);
		
		int num12 = num9++ + ++num9 + ++num9 + ++num9 + num9++;  //이런 연산은 결과는 나오지만 아주 비효율적인 최악의 연산이다. 
		System.out.println(num12);
		
		int num13 = 27;
		boolean b1 = (num13 > 25);  //크기비교의 결과는 참, 거짓(True, False);
		System.out.println("b1 : " + b1);
		/*
		boolean b2 = (5 > 3) && (5 < 2);  //참 && 참, and연산 or 논리곱이라 부른다. 두 항 모두 참이어야 함, 하나라도 참이 아니면 거짓으로 출력.
		System.out.println("b2 : " + b2);
		
		boolean b3 = (5 > 3) || (5 < 2);  //논리항, 두 항 중 하나의 항만 참이면 결과 값은 참, 두 항 모두 거짓이면 거짓.
		System.out.println("b3 : " + b3);
		
		boolean b4 = !(5 < 3);            //부정, 단항 연산자로서 참은 거짓으로 거짓은 참으로 바꾼다. '5가 3보다 작다 -가 아니다'
		System.out.println("b3 : " + b3); */
		
		num1 = 10;
		int i = 2;
		
		boolean b3 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);  //거짓 && 참
		System.out.println("b3 : " + b3);
		System.out.println("i : " + i);
		
		
		//복합대입연산자
		int num14 = 10;
		num14 = num14 + 2;  //등가식 [num14 += 2;]<- 이렇게 써도 됨, 복합대입연산자
		System.out.println("num14 : " + num14);
		
		num14++;
		++num14;
		num14 = num14 + 1;
		num14 += 1;        //이 네 개 항의 결과는 모두 같다.
		
		//조건연산자
		char ch = (45 > 47) ? 'T' : 'F'; //조건 or 삼항 연산자.
		System.out.println("ch : " + ch);
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		/*or isEven = (10 % 2 == 0) ? true : false; 단, 이것은 삼항연산자식으로 적용,  
		(%로 num과 2를 나눈 나머지)항, 0의 항, ==을 통해 두 개 항의 값이 같으면 참/거짓으로 반환한다.*/ 
		System.out.println(isEven);  //조건연산자를 사용하여 10이 짝수인 경우 t, 아닌 경우 f가 나오도록 만든 것.
		
		//비트이동연산자(시프트연산자)
		num <<= 2;                   //int result = num << 2;
		System.out.println(num);     //System.out.println(result);
		num >>= 2;                   //result = result >> 2;
		System.out.println(num);     //System.out.println(result); 양 쪽 동일한 식이지만 왼쪽이 더 간편하다.
				
		
		
		
		
		
	}

}
