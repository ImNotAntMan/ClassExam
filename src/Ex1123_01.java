
public class Ex1123_01 {
	//��Ģ�����
	int result;	//����������� �Ӽ�
	int num1;
	int num2;
	
	public Ex1123_01() {
		
	}

	//������(Ŭ������� ����, ��ȯŸ�� ����(return�� ����), �������� �޼��� ���� ����� ����)
	//�����ε� �� ������
	public Ex1123_01(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
		
	//������ ����
	public void setNum1(int n1) {
		num1 = n1;
	}
	
	public void setNum2(int n1) {
		num2 = n1;
	}
	
	//������ �б�
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	//���� �޼���
	public int add() {	//public ��ȯŸ�� �޼����(�Ű����� ����Ʈ)
		result = num1 + num2;	//���� ����
		System.out.println(num1 + " + " + num2  + " = " + result + " �Դϴ�.");
		return 0;
	}
	
	//���� �޼���
	public int subtract() {
		result = num1 - num2;
		System.out.println(num1 + " - " + num2  + " = " + result + " �Դϴ�.");
		return 0;
	}
	
	//���� �޼���
	public int multiplication() {
		result = num1 * num2;
		System.out.println(num1 + " X " + num2  + " = " + result + " �Դϴ�.");
		return 0;
	}
	
	//������ �޼���
	public int divide() {
		result = num1 / num2;
		System.out.println(num1 + " / " + num2  + " = " + result + " �Դϴ�.");
		return 0;
	}

}
