
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc1 = new Score();
		System.out.println("���� : " + sc1.getName() + "\t���� : " + sc1.getTotal() + "\t��� : " + sc1.getAverage());
		Score sc2 = new Score("�̼���", 65, 78, 99);
		System.out.println("���� : " + sc2.getName() + "\t���� : " + sc2.getTotal() + "\t��� : " + sc2.getAverage());		
		Score sc3 = new Score("������", 95, 87, 90);
		System.out.println("���� : " + sc3.getName() + "\t���� : " + sc3.getTotal() + "\t��� : " + sc3.getAverage());
		Score sc4 = new Score("������", 65, 44, 67);
		sc4.setEnglish(55);
		System.out.println("���� : " + sc4.getName() + "\t���� : " + sc4.getTotal() + "\t��� : " + sc4.getAverage());
	}

}
