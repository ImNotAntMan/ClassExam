
public class StudentsTest {

	public static void main(String[] args) {
		// 학생 과목 클래스 테스트(가변 과목)
		Students student1 = new Students(1001, "홍길동");
		student1.addSubject("국어", 90);
		student1.addSubject("영어", 85);
		
		Students student2 = new Students(1002, "나미남");
		student2.addSubject("국어", 70);
		student2.addSubject("영어", 93);
		student2.addSubject("수학", 81);

		Students student3= new Students(1003, "한국인");
		student3.addSubject("국어", 95);
		student3.addSubject("영어", 93);
		student3.addSubject("수학", 89);
		student3.addSubject("물리", 79);
		student3.addSubject("화학", 69);
		
		student1.showStudentInfo();
		student2.showStudentInfo();
		student3.showStudentInfo();
	}

}