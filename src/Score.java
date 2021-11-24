
public class Score {
	
	String studentName;
	int korean;
	int english;
	int math;
	
	//������ ����
	public Score() {
		studentName = "ȫ�浿";
		korean = 70;
		english = 70;
		math = 70;
	}
	
	public Score(String sName, int sKorean, int sEnglish, int sMath) {
		studentName = sName;
		korean = sKorean;
		english = sEnglish;
		math = sMath;
	}
	
	//�޼ҵ� ����
	
	public void setName(String sName) {
		studentName = sName;
	}
	
	public void setKorean(int sKorean) {
		korean = sKorean;
	}
	
	public void setEnglish(int sEnglish) {
		english = sEnglish;
	}
	
	public void setMath(int sMath) {
		math = sMath;
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return korean + english + math;
	}
	
	public float getAverage() {
		if(getTotal() / 3 >= 90) {
			System.out.println("�ֿ��");
		} else if(getTotal() / 3 >= 80) {
			System.out.println("���");
		} else if(getTotal() / 3 >= 70) {
			System.out.println("����");
		}  else {
			System.out.println("����");
		}
		return (float)getTotal() / 3;
	}

}
