
public class Ex1123_02 {

	public static void main(String[] args) {
		// �ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		//Ŭ������ ������ = new ������
		//����Ʈ �����ڴ� Ŭ������� �����ϸ� �Ű����� ����
		Ex1123_01 cal1 =  new Ex1123_01(118, 7);
//		System.out.println(cal1.add(10, 20));
		int test = cal1.add();	// ����� test�� ���� ��.
//		System.out.println(test);
		
		//���� �׽�Ʈ
		test = cal1.multiplication();
//		System.out.println(test);
		
		//���� �׽�Ʈ
		test = cal1.subtract();
//		System.out.println(test);
		
		//������ �׽�Ʈ
//		test = cal1.divide();
//		System.out.println(test);
		
		//�ι�° ��ü ���� �׽�Ʈ
		Ex1123_01 cal2 = new Ex1123_01(23,5);
		cal2.setNum1(22);
		cal2.setNum2(7);
		cal2.add();
		cal2.subtract();
		cal2.multiplication();
		cal2.divide();
		
		//����° ��ü ���� �׽�Ʈ
		Ex1123_01 cal3 = new Ex1123_01(10, 5);
		// 10 + 5 = 15 ���
		cal3.add();
		
		//�׹�° ��ü ���� �׽�Ʈ
		//����Ʈ �����ڷ� ���� �� �Ű�����(9, 10) �߰��ϰ� ���� ��� �׽�Ʈ
		Ex1123_01 cal4 = new Ex1123_01();
		cal4.setNum1(9);
		cal4.setNum2(10);
		cal4.multiplication();
		cal4.setNum1(13);
		cal4.multiplication();

	}
}
