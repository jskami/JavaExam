
public class Ex1116_6 {

	public static void main(String[] args) {
		// do while, Ȧ���� ��
		int num = 1;
		int sum = 0;
		do {
			if (num % 2 == 1) {                    //Ȧ��   //�� ������ 2�� ���� �������� 1�� ��� -�� �ǹ�
				sum += num;                        //���� ��ġ
			}
			num++;
		} while (num <= 10);    
		System.out.println(sum + "======" + num);  //11�� ������ ���� 11�������� ����� ����� -�� �ǹ�
	
	}

}
