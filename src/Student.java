// static�� ���ؼ� �˾ƺ���

public class Student {
	//������� ����
//	public static int serialNum = 1000;	//���� ����, �ʱ�ȭ�� ���Ѿ� ��, �ν��Ͻ�(��ü) ������ ������. ������ ����� ��. ��� ��ü���� �������� ��� ��.
	private static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	//������
	public Student() {
		this.serialNum++;
		this.studentId = this.serialNum;
		this.studentName = "�ƹ�����";
	}
	
	public Student(String studentName) {
		this.serialNum++;
		this.studentId = this.serialNum;
		this.studentName = studentName;
	}
	
	//�����ε� �� ������
	
	//�޼���(�Լ�)
//	public void showStudentInfo() {
//		System.out.println(studentName + "===" + address);
//	}
	
	public String getStudentInfo() {
		return address; 
	}
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentInfo(String address) {
		this.address = address;
	}
	
	public void showSutdent() {
		System.out.println(getStudentId() + " : " + getStudentName());
	}
	
	public static int getSerialNum() {
		int i = 10; //�������� ��밡��, static ������ ��� ����!!
//		studentName = "�����"; //������� ��� ���� ���� ��.
		return serialNum;
	}
		
	//�����ε� �� �޼���
	
	//������(main)
//	public static void main(String[] args) {	//������, �ü������ ���α׷� ȣ�� ���� student Ŭ������ ������ �ƴ�.
//		//Ŭ������ ������= new ������
//		Student st1 = new Student();	//��ü ����
//	}
}
