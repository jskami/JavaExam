
public class Ex1119_2 {

	public static void main(String[] args) {
		// break ���� (����121p ����)
		int sum = 0;
		int num = 0;
		for (num = 1;  ; num++) {        //���ǹ� ����
			if (sum > 10) {
				break;
			}
			sum += num;
		}
		System.out.println(sum + ":" + num);
	}

}
