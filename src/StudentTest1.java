
public class StudentTest1 {

	public static void main(String[] args) {
		// Student 클래스 테스트
		System.out.println(Student.getSerialNum());	//객체 생성과 무관하게 사용할 수 있음.
		Student st1 = new Student();	//디폴트 생성자 매개변수는 없음.
		st1.setStudentName("전두환되졌음.");
		st1.setStudentInfo("어디에 묻힐까? 부관참시고프다");
//		System.out.println(st1.studentName);	// public 멤버변수이므로 가능
//		System.out.println(st1.getStudentName());	//public 메스드이기에 가능
		
//		System.out.println(st1.serialNum); //static 변수 읽기
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		
		
		Student st2 = new Student();
		st2.setStudentName("이순자");
		st2.setStudentInfo("언제뒤질래?");
//		System.out.println(Student.serialNum);
		System.out.println(st2.getSerialNum());
//		System.out.println(st2.serialNum); //st2 생성시 증가했음.
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		Car c1 = new Car("한글차");
		System.out.println(c1.carName);
		System.out.println(Student.getSerialNum());
	}

}
