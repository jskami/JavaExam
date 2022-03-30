
public class Ex002 {

	public static void main(String[] args) {
		// 문자처리, 형변환,
		char ch1 = 'A';  //단일문자, 유니코드, ''는 안써도 되지만 정수(2바이트내에서)도 가능
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		// 소문자, 숫자 일부 출력 해보자!
		char ch2 = 'a';
		System.out.println((int)ch2);
		char ch3 = '0';
		System.out.println((int)ch3);
		
				
		double num1;
		int num2 = 3;
		num1 = 100 / (double)num2; // 정수 대 정수 연산의 중간결과는 정수, 100을 넘2로 나누기라는 의미, 더블 타입을 적용해서 캐스팅 하면 소수점 이하의 값이 나온다.
		System.out.println(num1);  //소수점 이하는 해결 되지 않은 출력이다.
		
		// num1이 정상적인 값이 출력되도록 형변환 해보자!
		
	}

}
