
public class Ex1112_1 {

	public static void main(String[] args) {
		// �⺻ ������
		int num1 = 90;             //int���� �տ� ���ľ�� Ÿ���̶� ���Ѵ�.
		int num2 = 70;
		int num3 = num1 + num2;
		System.out.println(num3);  //���ϱ� ������ ����̴�.
		
		num3 = num1 / num2;        //�������� num3�� ������ ���̰� ���⼭�� num3�� �����̴�.
		System.out.println(num3);  //������ ������ ����̴�.
		
		double num4 = (double)num1 / (double)num2;  //num1,2�� ������ ĳ���� �� �Ͱ� ���� ���� ���� ����� �ٸ���. num1, 2�� �ϳ��� ���� ĳ���� �ص� �ǰ� �Ѵ� �ص� �ȴ�. double <- int + double �̴�. 
		System.out.println(num4);  //������ ������ ������ �����Ͽ� �Ҽ����� ǥ���� ������ ����̴�.
		
		num4 = (double)(num1 / num2);  //�̷��� �����ϸ� ���� �ȵȴ�.		
		System.out.println(num4);      //14L ó�� ���� ������ �������� ������ ����� �ٸ��� ��µȴ�.
		
		int num5 = 10 % 7;  //10�� 7�� ���� �������� ���ϴ°�. ������ ������.(���� ����) 
		System.out.println(num5);
		
		int num6 = 10 / 7;  //5�� 7�� ���� ��
		System.out.println(num6);
		
		int num7 = num6 * 7 + num5;  //���� 
		System.out.println(num7);
		
		//Q1. 0 ~ 100������ ������ 7�� ���� �������� ���ϸ�? ������ ����? ->�� 6 ??���� �ʿ�..
		
		// ����,���� ������
		int num8 = 10;
		System.out.println("num8 : " +num8);  //���ڿ��߰�?
		++num8; /*->���׿����ڸ� �̿��� ���� �������̸� ���������̶� �Ѵ�. num8 = num8 +1;  //���⼭ =�� �ǹ̴� ���ٴ� �ǹ̰� �ƴ� '~��(��)'�̴�. �̰� ��¥ ���� �򸰴� �߿��ϴ�.*/
		System.out.println("num8 : " +num8);
		num8++; // ���������̶� �Ѵ�.
		System.out.println("num8 : " +num8);
		
		// ���� ����
		int num9 = 10;
		int num10 = ++num9;  //num9 ������ ���� ���� 1������Ű�� num10�� �����ϴ� ���������̴�.
		System.out.println("num10 : " +num10);
		
		// ���� ����
		int num9a = 10;
		int num11 = num9a++;  //num9a ������ ���� ���� �࿡�� 1������Ű����, ���� �࿡���� �������� ����, ���⼭ ���� ��ü�� num9a��.
		System.out.println("num11 : " +num11);
		
		int num12 = num9++ + ++num9 + ++num9 + ++num9 + num9++;  //�̷� ������ ����� �������� ���� ��ȿ������ �־��� �����̴�. 
		System.out.println(num12);
		
		int num13 = 27;
		boolean b1 = (num13 > 25);  //ũ����� ����� ��, ����(True, False);
		System.out.println("b1 : " + b1);
		/*
		boolean b2 = (5 > 3) && (5 < 2);  //�� && ��, and���� or �����̶� �θ���. �� �� ��� ���̾�� ��, �ϳ��� ���� �ƴϸ� �������� ���.
		System.out.println("b2 : " + b2);
		
		boolean b3 = (5 > 3) || (5 < 2);  //����, �� �� �� �ϳ��� �׸� ���̸� ��� ���� ��, �� �� ��� �����̸� ����.
		System.out.println("b3 : " + b3);
		
		boolean b4 = !(5 < 3);            //����, ���� �����ڷμ� ���� �������� ������ ������ �ٲ۴�. '5�� 3���� �۴� -�� �ƴϴ�'
		System.out.println("b3 : " + b3); */
		
		num1 = 10;
		int i = 2;
		
		boolean b3 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);  //���� && ��
		System.out.println("b3 : " + b3);
		System.out.println("i : " + i);
		
		
		//���մ��Կ�����
		int num14 = 10;
		num14 = num14 + 2;  //��� [num14 += 2;]<- �̷��� �ᵵ ��, ���մ��Կ�����
		System.out.println("num14 : " + num14);
		
		num14++;
		++num14;
		num14 = num14 + 1;
		num14 += 1;        //�� �� �� ���� ����� ��� ����.
		
		//���ǿ�����
		char ch = (45 > 47) ? 'T' : 'F'; //���� or ���� ������.
		System.out.println("ch : " + ch);
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		/*or isEven = (10 % 2 == 0) ? true : false; ��, �̰��� ���׿����ڽ����� ����,  
		(%�� num�� 2�� ���� ������)��, 0�� ��, ==�� ���� �� �� ���� ���� ������ ��/�������� ��ȯ�Ѵ�.*/ 
		System.out.println(isEven);  //���ǿ����ڸ� ����Ͽ� 10�� ¦���� ��� t, �ƴ� ��� f�� �������� ���� ��.
		
		//��Ʈ�̵�������(����Ʈ������)
		num <<= 2;                   //int result = num << 2;
		System.out.println(num);     //System.out.println(result);
		num >>= 2;                   //result = result >> 2;
		System.out.println(num);     //System.out.println(result); �� �� ������ �������� ������ �� �����ϴ�.
				
		
		
		
		
		
	}

}
