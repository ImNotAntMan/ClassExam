
public class Ex1126_01 {

	public static void main(String[] args) {
		// �迭 �׽�Ʈ
		int[] stIDs = new int[10];	//������ �迭 ����, �ʱ�ȭ ���� ����
		
		int[] stArr1 = {101, 102, 103, 104, 105};	//�迭 ����� ���ÿ� �ʱ�ȭ
		int[] stArr2 = new int[] {101, 102, 103, 104, 105};	//���� ����
		int[] stArr3;	//�ϴ� ����
		stArr3 = new int[] {101, 102, 103};	//new ���� �Ұ�.
		
		for(int i = 0; i < stArr1.length; i++) {//for�� �ȿ��� ���� �� ���� i�� for�� �ȿ����� ����.
			System.out.println(stArr1[i]);
		}
				
		for(int i = 0; i < stArr1.length; i++) {//for�� �ȿ��� ���� �� ���� i�� for�� �ȿ����� ����.
			System.out.println(stArr1[i]);
		}
	}

}
