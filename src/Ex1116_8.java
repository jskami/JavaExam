
public class Ex1116_8 {

	public static void main(String[] args) {
		// 1 ~ 10 ���� ¦���� ��(��� ���� ����), while, do while ����
		int num = 1;
		int sum = 0;
		do {
			if (num % 2 == 0) {                    //¦��   //�� ������ 2�� ���� �������� 0�� ��� -�� �ǹ�
				sum += num;                        //���� ��ġ
			}
			num++;      
		} while (num <= 10 );    
		System.out.println(sum + "======" + num);  // ¦���� ���� 30 , ============, 11��°���� ��� �� -�� �ǹ�
	}

}
