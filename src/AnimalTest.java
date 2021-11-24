
public class AnimalTest {

	public static void main(String[] args) {
		// 
		Animal ani1 = new Animal();
		ani1.setAnimalName("코끼리");
		ani1.setAnimalWeight(200);
		ani1.setAnimalSpeed(50);
		ani1.animalSpeedUp(30);
		ani1.animalSpeedDown(40);
		ani1.animalSpeedDown(10);
		ani1.animalSpeedUp(99);
		
		Animal ani2 = new Animal("기린", 150);
		ani2.animalSpeedUp(30);
		ani2.animalSpeedUp(300);
		ani2.animalSpeedDown(400);
		ani2.animalSpeedDown(10);
		ani2.animalSpeedUp(99);
		ani2.animalSpeedDown(2);
		
		Animal ani3 = new Animal("사자", 110);
		ani3.animalSpeedUp(30);
		ani3.animalSpeedUp(300);
		ani3.animalSpeedDown(400);
		ani3.animalSpeedDown(10);
		ani3.animalSpeedUp(99);
		ani3.animalSpeedDown(2);

	}

}
