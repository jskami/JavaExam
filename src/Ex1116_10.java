
public class Ex1116_10 {

	public static void main(String[] args) {
		/* ��ø�� �ݺ��� (���� 116p ~ ) ��¥ ���� ��û ���� �߿��ϴϱ� �ݵ�� �����ؾ��Ѵ�.
		int dan;
		int times;
		for(dan = 2; dan <= 9; dan++) {                                       //���� 9���� �����ߴ�! �ܺ�for��
			for (times = 1; times <= 9; times++) {                            //9���� ���� �� �ܿ��� �� 9���� ��µǵ��� ��������! ����for��
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");    //""���� �Ӽ� �ְ� * ������ ���ϱⰡ �ƴ� ���ϱ��� �ǹ̷� ��Ÿ����. println����� ���η�, print����� ���η� ��Ÿ����.
																				   //�� ���� + " "�� ������ ������ �ΰ� ��µȴ�.
																				   //�� �� + "  " ���̿� \t(tab�� �ǹ�)�� �ְ� ����ϸ� ���� ���� �������� ��Ÿ����.
			}
			System.out.println();    //�ٹٲ�, ���� ��� �������. ���� �ݺ����� �������� �ٱ� ������ println���� ����ϸ� ���η� ��Ÿ����.
		} */
		
		int dan;
		int times;
		for(dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.print(times + "*" + dan + "=" + (dan*times) + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
