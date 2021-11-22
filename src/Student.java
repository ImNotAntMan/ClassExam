
public class Student {
	//멤버변수 선언
	int studentId;
	String studentName;
	int grade;
	String address;
	
	//생성자
	
	//오버로딩 된 생성자
	
	//메서드(함수)
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
		
	//오버로딩 된 메서드
	
	//진입점(main)
	public static void main(String[] args) {	//진입점, 운영체제에서 프로그램 호출 목적 student 클래스의 영역이 아님.
		//클래스명 변수명= new 생성자
		Student st1 = new Student();	//객체 생성
		st1.setStudentName("민재기");
		st1.setStudentInfo("청주시 청원구 우암동");
		st1.showStudentInfo();
		System.out.println(st1.studentName);	//멤버변수 직접 출력
		System.out.println(st1.getStudentName());	//메서드를 통해서 출력
		System.out.println(st1.getStudentInfo());
	}
}
