import java.util.*;
class Animals {	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animals {
	public void move() { // �������̵� �� �޼ҵ�
		System.out.println("����� �������� �԰� �ֽ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �д´ٰ�?");
		
	}
	public void move2() {
		System.out.println("����� Ÿ�̰ŵ� �԰� �;� �մϴ�.");
	}
	public void heist() {
		System.out.println("�ʹ� ó ��ø� �ȵ˴ϴ�.");
	}
}

class Tiger extends Animals {
	public void move() {
		System.out.println("Ÿ�̰Ű� ����� �԰� �ֽ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class  Eagle extends Animals {
	public void move( ) {
		System.out.println("�̱��� Ÿ�̰Ÿ� �԰� �ֽ��ϴ�.");
	}
	public void flying() {
		System.out.println("������ ����.!");
	}
}

public class AnimalsTest {
	
	public static void main(String[] args) {
		
		AnimalsTest aTest = new AnimalsTest();
		
//		Animals[] animalsArr = new Animals[10]; //�迭 ��ü ����
//		for(int i = 0; i < 3; i++ ) {
//			animalsArr[i] = new Human();
//		}
//		for(int i = 3; i < 5; i++) {
//			animalsArr[i] = new Tiger();
//		}
//		
//		for(int i = 5; i < 10; i++) {
//			animalsArr[i] = new Eagle();
//		}
//		
//		for(int i = 0; i < animalsArr.length; i++) {
//			aTest.moveAnimals(animalsArr[i]);
//		}
		
		//--------------------------------------------------------------------------------
		ArrayList<Animals> aniList = new ArrayList<Animals>();
		aniList.add(new Human());	// ��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Tiger());	// ��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Eagle());	// ��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Eagle());	// ��ü �����ϸ鼭 �迭�� �߰�
		aniList.add(new Tiger());	// ��ü �����ϸ鼭 �迭�� �߰�
//		aniList.clear();
		for(Animals ani : aniList) {
			ani.move();	// �������� ���� ������ �޼��� ȣ��
		}
		for(int i = 0; i < aniList.size(); i++) {
			Animals item = aniList.get(i);
			if(item instanceof Human) {
				Human h = (Human)item;	// �޸����� �ٿ�ĳ����
				h.readBook();	// �ٿ� ĳ���� �Ǿ����Ƿ� ������ �޽��� ��� ����
				h.move2();
				h.heist();
			} else if(item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if(item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("�˼� ���� �����Դϴ�.");
			}
			
		}
		
		//--------------------------------------------------------------------------------
		
//		Animals a1 = new Human();
//		Animals a2 = new Tiger();
//		Animals a3 = new Eagle();
//		
//		aTest.moveAnimals(new Human());
//		aTest.moveAnimals(new Tiger());
//		aTest.moveAnimals(new Eagle());
//		
//		aTest.moveAnimals(a1);
//		aTest.moveAnimals(a2);
//		aTest.moveAnimals(a3);
	}

//	public void moveAnimals(Animals aaa) {
//		aaa.move(); // ������, ������ �ٸ� ���� ����
//	}
}