
public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc1 = new Score();
		System.out.println("¼º¸í : " + sc1.getName() + "\tÃÑÁ¡ : " + sc1.getTotal() + "\tÆò±Õ : " + sc1.getAverage());
		Score sc2 = new Score("ÀÌ¼ø½Å", 65, 78, 99);
		System.out.println("¼º¸í : " + sc2.getName() + "\tÃÑÁ¡ : " + sc2.getTotal() + "\tÆò±Õ : " + sc2.getAverage());		
		Score sc3 = new Score("¼ºÃáÇâ", 95, 87, 90);
		System.out.println("¼º¸í : " + sc3.getName() + "\tÃÑÁ¡ : " + sc3.getTotal() + "\tÆò±Õ : " + sc3.getAverage());
		Score sc4 = new Score("À±¼®¿­", 65, 44, 67);
		sc4.setEnglish(55);
		System.out.println("¼º¸í : " + sc4.getName() + "\tÃÑÁ¡ : " + sc4.getTotal() + "\tÆò±Õ : " + sc4.getAverage());
	}

}
