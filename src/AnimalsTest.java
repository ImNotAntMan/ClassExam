import java.util.*;
class Animals {	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animals {
	public void move() { // 오버라이딩 된 메소드
		System.out.println("사람이 독수리를 먹고 있습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽는다고?");
		
	}
	public void move2() {
		System.out.println("사람이 타이거도 먹고 싶어 합니다.");
	}
	public void heist() {
		System.out.println("너무 처 드시면 안됩니다.");
	}
}

class Tiger extends Animals {
	public void move() {
		System.out.println("타이거가 사람을 먹고 있습니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class  Eagle extends Animals {
	public void move( ) {
		System.out.println("이글이 타이거를 먹고 있습니다.");
	}
	public void flying() {
		System.out.println("독수리 날다.!");
	}
}

public class AnimalsTest {
	
	public static void main(String[] args) {
		
		AnimalsTest aTest = new AnimalsTest();
		
//		Animals[] animalsArr = new Animals[10]; //배열 객체 생성
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
		aniList.add(new Human());	// 객체 생성하면서 배열에 추가
		aniList.add(new Tiger());	// 객체 생성하면서 배열에 추가
		aniList.add(new Eagle());	// 객체 생성하면서 배열에 추가
		aniList.add(new Eagle());	// 객체 생성하면서 배열에 추가
		aniList.add(new Tiger());	// 객체 생성하면서 배열에 추가
//		aniList.clear();
		for(Animals ani : aniList) {
			ani.move();	// 다형성에 의해 각각의 메서드 호출
		}
		for(int i = 0; i < aniList.size(); i++) {
			Animals item = aniList.get(i);
			if(item instanceof Human) {
				Human h = (Human)item;	// 휴먼으로 다운캐스팅
				h.readBook();	// 다운 캐스팅 되었으므로 독립된 메스드 사용 가능
				h.move2();
				h.heist();
			} else if(item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if(item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("알수 없는 오류입니다.");
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
//		aaa.move(); // 다형성, 실제로 다른 일을 샐행
//	}
}