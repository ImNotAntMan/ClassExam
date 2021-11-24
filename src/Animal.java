
public class Animal {
	
	String animalName;
	int animalWeight;
	int animalSpeed;
	
	public Animal() {
		animalName = "����";
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
			System.out.println("�־��� �� " + aSpeed + "�� ��Ȯ�� ���� �ƴմϴ�. 0 ~ 100 ������ ���� �Է��ϼ���.\n" + "�ӵ��� ��ȭ�� �����ϴ�.");
		} else {
			animalSpeed += aSpeed;
			if(animalSpeed > 100) {
				animalSpeed = 100;
			}
			System.out.println(animalName + "�� �ӵ��� " + aSpeed + "��ŭ �����Ͽ� " + animalSpeed + "�� �Ǿ����ϴ�.");
			System.out.println(animalName + "�� ü���� " + animalWeight + " �Դϴ�.");
		}
	}
	
	public void animalSpeedDown(int aSpeed) {
		if(aSpeed > 100 || aSpeed < 0) {
			System.out.println("�־��� �� " + aSpeed + "�� ��Ȯ�� ���� �ƴմϴ�. 0 ~ 100 ������ ���� �Է��ϼ���.\n" + "�ӵ��� ��ȭ�� �����ϴ�.");
		} else {
			animalSpeed -= aSpeed;
			if(animalSpeed < 0) {
				animalSpeed = 0;
			}
			System.out.println(animalName + "�� �ӵ��� " + aSpeed + "��ŭ �����Ͽ� " + animalSpeed + "�� �Ǿ����ϴ�.");
			System.out.println(animalName + "�� ü���� " + animalWeight + " �Դϴ�.");		
		}
	}

}
