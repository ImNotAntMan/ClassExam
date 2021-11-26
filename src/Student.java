// static에 대해서 알아보자

public class Student {
	//멤버변수 선언
//	public static int serialNum = 1000;	//정적 변수, 초기화를 시켜야 함, 인스턴스(객체) 생성과 무관함. 무조건 만들어 짐. 모든 객체에서 공용으로 사용 함.
	private static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	//생성자
	public Student() {
		this.serialNum++;
		this.studentId = this.serialNum;
		this.studentName = "아무개씨";
	}
	
	public Student(String studentName) {
		this.serialNum++;
		this.studentId = this.serialNum;
		this.studentName = studentName;
	}
	
	//오버로딩 된 생성자
	
	//메서드(함수)
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
		int i = 10; //지역변수 사용가능, static 변수만 사용 가능!!
//		studentName = "민재기"; //멤버변수 사용 못함 오류 남.
		return serialNum;
	}
		
	//오버로딩 된 메서드
	
	//진입점(main)
//	public static void main(String[] args) {	//진입점, 운영체제에서 프로그램 호출 목적 student 클래스의 영역이 아님.
//		//클래스명 변수명= new 생성자
//		Student st1 = new Student();	//객체 생성
//	}
}
