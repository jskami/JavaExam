
public class Ex1116_7 {

	public static void main(String[] args) {
		// do ~ while(Ȧ��, �ݺ� Ƚ�� ���̱�)
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			System.out.println(sum + "======" + num);	
			num += 2;          //���� Ȧ��, �ű⿡ +=�� ���� Ȧ���� �������� ����
		} while (num <= 10 );    
		System.out.println(sum + "======" + num);
		
	}

}
