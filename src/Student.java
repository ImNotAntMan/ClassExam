
public class Student {
	//������� ����
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//������
	
	//�����ε� �� ������
	
	//�޼���(�Լ�)
	public void showStudentInfo() {
		System.out.println(studentName + "===" + address);
	}
	
	public String getStudentInfo() {
		return address; 
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
		return;
	}
	
	public void setStudentInfo(String add) {
		address = add;
	}
		
	//�����ε� �� �޼���
	
	//������(main)
	public static void main(String[] args) {	//������, �ü������ ���α׷� ȣ�� ���� student Ŭ������ ������ �ƴ�.
		//Ŭ������ ������= new ������
		Student st1 = new Student();	//��ü ����
		st1.setStudentName("�����");
		st1.setStudentInfo("û�ֽ� û���� ��ϵ�");
		st1.showStudentInfo();
		System.out.println(st1.studentName);	//������� ���� ���
		System.out.println(st1.getStudentName());	//�޼��带 ���ؼ� ���
		System.out.println(st1.getStudentInfo());
	}
}
