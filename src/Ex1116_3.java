
public class Ex1116_3 {

	public static void main(String[] args) {
		//�� switch-case ���ǹ� (����101p)
		int score = 84;
		switch (score / 10) {                                //����ġ�� ���ǽ��� �ƴ� ���� �ۼ��ϴ� �����̴�.
		case 10:                               //100���� ���� ���
			 System.out.println("A����");       //�� ��ȣ�� �ᵵ �׸� �Ƚᵵ �׸�.
			 break;
		case 9 :                               //90���뿡 ���� ���
			 System.out.println("A����");
			 break;
		case 8 :                               //80���뿡 ���� ���
			 System.out.println("B����");
			 break;
		case 7 :                               //70���뿡 ���� ���
			 System.out.println("C����");
			 break;
		case 6 :                               //60���뿡 ���� ���
			 System.out.println("D����");
			 break;
		default :                              //�ش� ���� ���� ���
			 System.out.println("F����");
			 
		 
		/*�� case�� ��� 100�� ~ 0������ 100���� ����� �ʹ� ��� �ð��� ���� �ɸ��� ���������� �� ȿ�����̴�. �� ���, 10����� ����� �����
			case�� 10���� ����� �ȴ�. 10�� �߿����� ������ �ش����� �ʴ� ��ŭ�� ���� �ʿ䰡 ����. �� ���¿��� ����ϸ� 99���� ���� ���� ���� A,B,C,D,F���� ���ð��̴�.
			����ġ ������ else if ó�� ���� ���ǹ����� ������ �ۼ����� �ʾƵ� �ڵ����� ���� ���ǹ����� �Ѿ�� �����̴�. �̸� �����ϰ� ������ �ش��ϴ� ���ǽĿ��� �����ϱ� ���ؼ�
			������ ���ǽ� ���� break�� �ۼ��Ѵ�. �׷��� 99���� ���� �ش� ���ǹ����� �����Ͽ� ����� ��µ� ���̴�. */
			 
			 
		/* break���� �ݺ����� for, while, do-while���� ������ ������ �� ����Ѵ�. switch�������� break���� ����Ͽ� �����Ѵ�.
		   break;�� ���̸� ���� ����� �ݺ����� �ƿ� �������´ٰ� �����ϸ� ����.
		
			 
		/* ��������	 
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
	//�� �κп� ����� ���
	System.out.println("����� ������" + score + "�̸�, �����" + grade + "�Դϴ�."); */
	
			 
			 
			 
			 
			 
		}
	}

}
