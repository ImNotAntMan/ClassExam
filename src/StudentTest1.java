
public class StudentTest1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ
		System.out.println(Student.getSerialNum());	//��ü ������ �����ϰ� ����� �� ����.
		Student st1 = new Student();	//����Ʈ ������ �Ű������� ����.
		st1.setStudentName("����ȯ������.");
		st1.setStudentInfo("��� ������? �ΰ����ð�����");
//		System.out.println(st1.studentName);	// public ��������̹Ƿ� ����
//		System.out.println(st1.getStudentName());	//public �޽����̱⿡ ����
		
//		System.out.println(st1.serialNum); //static ���� �б�
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		
		
		Student st2 = new Student();
		st2.setStudentName("�̼���");
		st2.setStudentInfo("����������?");
//		System.out.println(Student.serialNum);
		System.out.println(st2.getSerialNum());
//		System.out.println(st2.serialNum); //st2 ������ ��������.
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		Car c1 = new Car("�ѱ���");
		System.out.println(c1.carName);
		System.out.println(Student.getSerialNum());
	}

}
