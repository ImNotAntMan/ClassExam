import java.util.*;
public class Students {
	//�������
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	//������
	public Students() {
		
	}
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	// �޼ҵ�
	// ������� ������ �߰��ϴ� �޼���, �л����� ���� ó��
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		this.subjectList.add(subject);	// Subject Ÿ���� ��ü�� �߰�
	}
	
	public void showStudentInfo() {
		int total = 0;
		System.out.println(this.studentName + " : " + this.studentID + " ");
		for(Subject s : this.subjectList) {	// ����� ���� ����ŭ �ݺ�
			total += s.getScorePoint();	// ���� ����
			System.out.print(s.getName() + " : " + s.getScorePoint() + " ");
		}
		System.out.println();
		System.out.println("���� : " + total);
		System.out.println("=================================");
		
	}

}