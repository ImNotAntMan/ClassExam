
public class StudentArray {

	public static void main(String[] args) {
		// 
		Student[] st1 = new Student[6];
		
		st1[0] = new Student("³ë¹«Çö");
		st1[1] = new Student("ÀÌÀç¸í");
		st1[2] = new Student("±è´ëÁß");
		st1[3] = new Student("°³¾¾");
		st1[4] = new Student("¾Ã¾¾");
		st1[5] = new Student("Á¿¾¾");
		
		for(int i = 0  ; i < st1.length ; i++) {
			st1[i].showStudent();
		}
		
		for(int i = st1.length - 1; i >= 0; i--) {
			st1[i].showStudent();
		}

	}

}
