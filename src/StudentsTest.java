
public class StudentsTest {

	public static void main(String[] args) {
		// �л� ���� Ŭ���� �׽�Ʈ(���� ����)
		Students student1 = new Students(1001, "ȫ�浿");
		student1.addSubject("����", 90);
		student1.addSubject("����", 85);
		
		Students student2 = new Students(1002, "���̳�");
		student2.addSubject("����", 70);
		student2.addSubject("����", 93);
		student2.addSubject("����", 81);

		Students student3= new Students(1003, "�ѱ���");
		student3.addSubject("����", 95);
		student3.addSubject("����", 93);
		student3.addSubject("����", 89);
		student3.addSubject("����", 79);
		student3.addSubject("ȭ��", 69);
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		student3.showStudentInfo();
	}

}