
public class PersonTest {

	public static void main(String[] args) {
		// person class �׽�Ʈ
		//�����ε� �� �����ڰ� ���� ��� ����Ʈ �����ڵ� �����ؾ� ��.
		Person hu1 = new Person(); //default ������
		Person hu2 = new Person("JGMIN"); //�Ű����� 1�� ������
		
		System.out.println(hu2.getName());
		
		Person hu3 = new Person("�����", 170, 74);
		hu3.getHuman();
		Person hu4 = new Person();
		hu4.setHuman("������", 180, 74);
		System.out.println(hu4.getName());
		System.out.println(hu4.getHeight());
		System.out.println(hu4.getWeight());
		hu1.setHuman("�̰͵�", 180, 78);
		System.out.println(hu1.getName());
		hu1.getHuman();
	}
}
