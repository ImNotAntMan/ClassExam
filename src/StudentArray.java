
public class StudentArray {

	public static void main(String[] args) {
		// 
		Student[] st1 = new Student[6];
		
		st1[0] = new Student("�빫��");
		st1[1] = new Student("�����");
		st1[2] = new Student("�����");
		st1[3] = new Student("����");
		st1[4] = new Student("�þ�");
		st1[5] = new Student("����");
		
		for(int i = 0  ; i < st1.length ; i++) {
			st1[i].showStudent();
		}
		
		for(int i = st1.length - 1; i >= 0; i--) {
			st1[i].showStudent();
		}

	}

}
