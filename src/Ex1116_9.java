
public class Ex1116_9 {

	public static void main(String[] args) {
		/* for�� �̿� 1 ~ 10 ������ ������ (���� 112p ~ )
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {          
			sum += i;
		}
		System.out.println(sum + "======" + i); */
		
		
		
		
		
		/*�� 1 ~ 10 ���� Ȧ���� ��
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 1)
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		
		/*�� 1 ~ 10 ���� ¦���� ��
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i % 2 == 0)
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i);  //��,�� �̰� ����ϴ��� �Ӹ� ������ �� �˾Ҵµ�.. �̰ź��� �� ������ ���� �ִٰ� �ϳ�; �׷��� ������ �����ؼ� �ذ������� �ѵ��ϱ� �ϴ�.*/
		
		
		
		
		//�Ʒ����ʹ� ����� �������� ���� ����� ����
		/* 1 ~ 10 ���� Ȧ�� �� (if�� �� .ver)
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i += 1) {
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		/* 1 ~ 10 ���� ¦�� �� (if�� �� .ver)
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i += 2) {
			sum += i;
			}
		while (i <= 10 );
		System.out.println(sum + "=====" + i); */
		
		
		
		//�Ʒ����ʹ� Ȳ���� �������� ��
		int i = 1;
		int sum = 0;
		//1 ~ 10 ���� ¦���� ��
		sum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		;
		;
		//�ʿ��� �ݺ��� ó��
		sum = 0;
		for (i = 1; i <= 10; i +=2) {
			
		}
		System.out.println(sum);
		
		//1 ~ 10 ���� Ȧ���� ��
		sum = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1 ~ 10 ���� ���
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}	

		
		/* for���� �ݺ�Ƚ���� �˰� ������, while���� ���ǿ� ���� �ݺ��� ��(�ݺ�Ƚ���� ������ ��)���
		   while�� do-while�� �������� ������ ���� �˻��ϴ���, ���߿� �˻��ϴ���! */
		
		
	}

}
