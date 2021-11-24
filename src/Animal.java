
public class Animal {
	
	String animalName;
	int animalWeight;
	int animalSpeed;
	
	public Animal() {
		animalName = "동물";
		animalWeight = 30;
		animalSpeed = 0;
	}
	
	public Animal(String aName) {
		animalName = aName;
		animalWeight = 30;
		animalSpeed = 0;
	}
	
	public Animal(String aName, int aWeight) {
		animalName = aName;
		animalWeight = aWeight;
		animalSpeed = 0;
	}
	
	public void setAnimalName(String aName) {
		animalName = aName;
	}
	
	public void setAnimalWeight(int aWeight) {
		animalWeight = aWeight;
	}
	
	public void setAnimalSpeed(int aSpeed) {
		animalSpeed = aSpeed;
		if(animalSpeed > 100) {
			animalSpeed = 100;
		}
		if(animalSpeed < 0) {
			animalSpeed = 0;
		}
	}
	
	public String getAnimalName() {
		return animalName;
	}
	
	public int getAnimalWeight() {
		return animalWeight;
	}
	
	public int getAnimalSpeed() {
		return animalSpeed;
	}
	
	public void animalSpeedUp(int aSpeed) {
		if(aSpeed > 100 || aSpeed < 0) {
			System.out.println("주어진 값 " + aSpeed + "은 정확한 값이 아닙니다. 0 ~ 100 사이의 값을 입력하세요.\n" + "속도에 변화가 없습니다.");
		} else {
			animalSpeed += aSpeed;
			if(animalSpeed > 100) {
				animalSpeed = 100;
			}
			System.out.println(animalName + "의 속도가 " + aSpeed + "만큼 증가하여 " + animalSpeed + "이 되었습니다.");
			System.out.println(animalName + "의 체중은 " + animalWeight + " 입니다.");
		}
	}
	
	public void animalSpeedDown(int aSpeed) {
		if(aSpeed > 100 || aSpeed < 0) {
			System.out.println("주어진 값 " + aSpeed + "은 정확한 값이 아닙니다. 0 ~ 100 사이의 값을 입력하세요.\n" + "속도에 변화가 없습니다.");
		} else {
			animalSpeed -= aSpeed;
			if(animalSpeed < 0) {
				animalSpeed = 0;
			}
			System.out.println(animalName + "의 속도가 " + aSpeed + "만큼 감소하여 " + animalSpeed + "이 되었습니다.");
			System.out.println(animalName + "의 체중은 " + animalWeight + " 입니다.");		
		}
	}

}
