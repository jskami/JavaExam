
public class Ex1116_2 {

	public static void main(String[] args) {
		//�� if ~ else if ~ else ���ǹ� (���� 96p)
		/*int score = 99;
		if (score >= 90) {                 //���ھ 90���� ũ�ų� ������?
			System.out.println("A����");
		}
		
		if (score >= 80) {
			System.out.println("B����");
		}
		
		if (score >= 70) {
			System.out.println("C����");
		} */                           
		//�� �̷��� �ۼ����� ���� ���ϴ�. �ϳ��� ���ھ if ���ǹ� �� ���� ��� �ش�Ǳ� �����̴�.
		
		
		
		//�� �׷��� else if�� ����Ͽ� �ϳ��� ���ھ ���� �� ���� ���ǹ��� ã�Ƽ� ����Ǳ� ����
		int score = 63;
		if (score >= 90) {                 //���ھ 90���� ũ�ų� ������?
			System.out.println("A����");
		} else if (score >= 80) {          //else�� �ǹ̴� �ٷ� ���� �ִ� ���ǹ��� ���ؼ� �Ÿ��ڴٴ� �ǹ�. "80���� <= ���� <90"�̰� �̰��� ���̸� ���⼭ ��, �����̸� ���� else if ���ǹ����� ���� �����̴�. 
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		} else if (score >= 60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}                             
		//�� ���ھ ���ǹ��� ������ ��찡 ������ ������ else���ǹ��� ���� ���� ���ھ ��,������ ���� �� �ְ� else���ǹ��� �����Ѵ�.
				
		
		
		//�����غ���!
		int level = 54;
		if (level >= 90) {
			System.out.println("A��ũ");
		} else if (level >= 80) {
			System.out.println("B��ũ");
		} else if (level >= 70) {
			System.out.println("C��ũ");
		} else if (level >= 60) {
			System.out.println("D��ũ");
		} else if (level >= 50) {
			System.out.println("E��ũ");
		}
		
		
		
		
	}
 
}
