import java.util.*;
public class SweetHomeTest {

	public static void main(String[] args) {
		// 
		SweetHome sh = new SweetHome("이만기", 1001, "내덕동", 100);
		ArrayList<SweetHome> shList = new ArrayList<SweetHome>();

		// shList.get()을 통하여 접근하는 방법
		shList.add(sh);
//		System.out.println(shList.get(0).getOwnerName());
//		System.out.println(shList.get(0).getOwnerID());
//		System.out.println(shList.get(0).getHomeAddress());
//		System.out.println(shList.get(0).getHousePrice());
//		System.out.println(shList.get(0).getHousePrice()*0.001);
		// sh 객체를 통하여 접근하는 방법
		System.out.print("이름은 " + sh.getOwnerName() + "이고 번호는 " + sh.getOwnerID() + "입니다. " + "사는 곳은 " + sh.getHomeAddress() + "이며 집 값은 " + sh.getHousePrice() + "억원 입니다.\n");

		shList.add(new BedRoom());
		shList.add(new Kitchen());
		shList.add(new DressRoom());
		shList.add(new StudyRoom());
		shList.add(new GameRoom());

		SweetHome sh2 = new SweetHome("James Lee", 1002, "서울", 250);
		shList.add(sh2);
		System.out.print("이름은 " + shList.get(6).getOwnerName() + "이고 번호는 " + shList.get(6).getOwnerID() + "입니다. " + "사는 곳은 " + shList.get(6).getHomeAddress() + "이며 집 값은 " + shList.get(6).getHousePrice() + "억원 입니다.\n");
		shList.add(new BedRoom());
		shList.add(new Kitchen());
		shList.add(new DressRoom());
		shList.add(new StudyRoom());
		shList.add(new GameRoom());
		
		int j = 0;
		// 다형성 테스트
		for(SweetHome slist : shList) { // 이 for문의 단점은 array만 가능.
			System.out.print(" j의 값은 : " + j + "입니다.");
			System.out.print(slist.getClass() + " "); // getClass() : 호출된 클래스의 이름을 출력한다.
//			if(slist instanceof SweetHome) {
//				System.out.println("");
//				System.out.print("이름은 " + slist.getOwnerName() + "이고 번호는 " + slist.getOwnerID() + "입니다. " + "사는 곳은 " + slist.getHomeAddress() + "이며 집 값은 " + slist.getHousePrice() + "억원 입니다.\n");			
//			}
			slist.homeAction(j); // 다형성: 호출된 클래스의 오버라이딩 된 메소드 homeAction을 실행한다.
//			slist.homeAction(2); // j의 값을 조정하면 다른 옵션이 출력된다.
//			slist.homeAction(3);
//			slist.homeAction(4);
			++j;
			if(j == 5) {
				j = 1;
			}
		}
		
		System.out.println("================================================");
		System.out.println("ArrayLis 사용 안 하고~~");
		System.out.println("================================================");
		SweetHome bedroom= new BedRoom();	// ArrayList를 사용하지 않는 방법
		bedroom.homeAction(3); // 사실 이게 맞는 것 같다. 클래스 마다 다른 행동이 가능하니까...
		SweetHome kitchenroom = new Kitchen(); // 그래서 ArrayList를 사용할까 말까다..
		kitchenroom.homeAction(2); // 그러면 ArrayList에 매개 변수를 줘서 어떻게 어떻게 하면 안될까?
		SweetHome dressroom = new DressRoom();
		dressroom.homeAction(4);
		SweetHome studyroom = new StudyRoom();
		studyroom.homeAction(2);
		SweetHome gameroom = new GameRoom();
		gameroom.homeAction(4);
		System.out.println("================================================");
		
		// if(list instanceof SweetHome) <= 이놈이 맨 앞에 오지 않게 하자. 맨 끝에 오게 하자!!! 이유는??
		// 그리고 형변환은 부모와 자손간의 관계에서만 가능하다.
		System.out.println("다운 캐스팅 연습!!");
		System.out.println("================================================");
		for(int i = 0; i < shList.size(); i++) {
			SweetHome list = shList.get(i);
			if(list instanceof BedRoom) {
				BedRoom b = (BedRoom)list;
				b.bedRoomAction();
			} else if(list instanceof DressRoom) {
				DressRoom d = (DressRoom)list;
				d.dressRommAction();
			} else if(list instanceof Kitchen) {
				Kitchen k = (Kitchen)list;
				k.kitchenAction();
			} else if(list instanceof StudyRoom) {
				StudyRoom s = (StudyRoom)list;
				s.studyRoomAction();
			} else if(list instanceof GameRoom) {
				GameRoom g = (GameRoom)list;
				g.gameRoomAction();
				System.out.println("");
			} else if(list instanceof SweetHome) { // 클래스 SweetHome: 이름, ID, 주소, 가격이 저장된 클래스
				System.out.print("이름은 " + list.getOwnerName() + "이고 번호는 " + list.getOwnerID() + "입니다. " + "사는 곳은 " + list.getHomeAddress() + "이며 집 값은 " + list.getHousePrice() + "억원 입니다.\n");
			} else {
				System.out.println("알수 없는 오류입니다.");
			}
		}
		
		System.out.println("======================================================================================================");
		
		// if(list instanceof SweetHome) <= 이놈이 맨 앞에 오지 않게 하자. 맨 끝에 오게 하자!!! 이유는??
		// 그리고 형변환은 부모와 자손간의 관계에서만 가능하다.
		System.out.println("부모 클래스가 맨 앞에 있을 때 다운 캐스팅! 위에서 실행한 결과와 지금 결과 비교해 보자! 왜 이럴까???");
		System.out.println("======================================================================================================");
		for(int i = 0; i < shList.size(); i++) {
			SweetHome list = shList.get(i);
			if(list instanceof SweetHome) { // list의 속성타입 SweetHome이면 .........
				System.out.print("이름은 " + list.getOwnerName() + "이고 번호는 " + list.getOwnerID() + "입니다. " + "사는 곳은 " + list.getHomeAddress() + "이며 집 값은 " + list.getHousePrice() + "억원 입니다.\n");
			} else if(list instanceof BedRoom) { // 이건 SweetHome의 System.out.print("이름은 " + list.getOwnerName()....);이 실행榮募째풩?. 
				BedRoom b = (BedRoom)list;
				b.bedRoomAction();
			} else if(list instanceof DressRoom) { // 이건 SweetHome의 System.out.print("이름은 " + list.getOwnerName()....);이 실행榮募째풩?.
				DressRoom d = (DressRoom)list;
				d.dressRommAction();
			} else if(list instanceof Kitchen) { // 이건 SweetHome의 System.out.print("이름은 " + list.getOwnerName()....);이 실행榮募째풩?.
				Kitchen k = (Kitchen)list;
				k.kitchenAction();
			} else if(list instanceof StudyRoom) { // 이건 SweetHome의 System.out.print("이름은 " + list.getOwnerName()....);이 실행榮募째풩?.
				StudyRoom s = (StudyRoom)list;
				s.studyRoomAction();
			} else if(list instanceof GameRoom) { // 이건 SweetHome의 System.out.print("이름은 " + list.getOwnerName()....);이 실행榮募째풩?.
				GameRoom g = (GameRoom)list;
				g.gameRoomAction();
				System.out.println("");
			} else {
				System.out.println("알수 없는 오류입니다.");
			}
		} 
		// 결국 이것은 자바에서 if 문의 특징을 보여주는 것이다. 맨 처음, 혹은 맨 위의 조건문을
		// 만족하면(true) 다음 조건문은 실행 안하고 if문을 빠져 나온다.
		// 그리고 위에 있는 조건문 "if(list instanceof SweetHome) {...."이 list가 무엇이든 상관없이 항상
		//  true인 것은 BedRoom, Kitchen, DressRoom, StudyRoom, GameRoom 등 자식 클래스 모두가 
		// 부모인 SweetHome 클래스를 상속하고 있기에 당연히 자식 클래스들 모두는 
		// SweetHome의 속성을 가지고 있다. 그래서 list instanceof SweetHome) {....를 맨 아래에 위치하게 한다.

		
//		bedroom.homeAction(4);
//		dressroom.homeAction(1);
//		kitchenroom.homeAction(3);
//		studyroom.homeAction(1);
//		gameroom.homeAction(3);
//		gameroom.homeAction(1);
//		gameroom.homeAction(2);
		System.out.println("==========================================================================================================");

	}

}
