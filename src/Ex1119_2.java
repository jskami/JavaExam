
public class Ex1119_2 {

	public static void main(String[] args) {
		// break 구문 (교재121p 응용)
		int sum = 0;
		int num = 0;
		for (num = 1;  ; num++) {        //조건문 생략
			if (sum > 10) {
				break;
			}
			sum += num;
		}
		System.out.println(sum + ":" + num);
	}

}
