
public class Ex1116_11 {

	public static void main(String[] args) {
		//��ø�� �簢��(5�� 5�� * ���)
		int i ; //�� 
		int j ; //��
		/*for(i = 1; i <= 5; i++) {    //Ƚ���� ó���ϸ� �ǹǷ� ������ 0���� �ص� ��
			System.out.print("\t");
			for (j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();     //���� for������(print)���η� 5�� ��µǸ� ����� �ܺ� for�����μ�(println)���η� 5�� ����Ѵ�. -�� �ǹ�
		} */
		
		
		
		/*�ﰢ�� ���
		*
		**
		***
		****
		***** <-�̷��� */
		for	(i = 0; i < 5; i++) {    
			for (j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		
		
		/* ���ﰢ�� ���
		*****
		****
		***
		**
		*       <-�̷��� */
		for	(i = 0; i < 5; i++) {            //�� 
			for (j = 0; j < 5-i; j++) {      //5-i�� ��¥ ��û ū ��Ʈ����. 
				System.out.print("*");
			}
			System.out.println();  //�ٹٲ�
		}
		
		
		
		
		
		
		
		
	}

}
