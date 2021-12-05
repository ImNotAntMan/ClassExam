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

		// 다운 캐스팅 연습!!
		// super(SweetHome)이 if 문 제일 앞에 오면 다운 캐스팅이 되지 않는다.else 위에 있으면 정상 작동한다. ㅡㅡ;;
//		for(int i = 0; i < shList.size(); i++) {
//			SweetHome list = shList.get(i);
//		 if(list instanceof SweetHome) { // 제일앞에 SweetHome???
//			System.out.print("이름은 " + shList.get(i).getOwnerName() + "이고 번호는 " + shList.get(i).getOwnerID() + "입니다. " + "사는 곳은 " + shList.get(i).getHomeAddress() + "이며 집 값은 " + shList.get(i).getHousePrice() + "억원 입니다.\n");
//				list.taxHouse(); // 이게 실행된후에 자식 클래스들은 무조건 .taxHouse()실행함.
//			} else if(list instanceof BedRoom) {
//				BedRoom b = (BedRoom)list;
//				b.bedRoomAction(); // taxHouse() 실행됨...?????
//			} else if(list instanceof DressRoom) {
//				DressRoom d = (DressRoom)list;
//				d.dressRommAction();
//			} else if(list instanceof Kitchen) {
//				Kitchen k = (Kitchen)list;
//				k.kitchenAction();
//			} else if(list instanceof StudyRoom) {
//				StudyRoom s = (StudyRoom)list;
//				s.studyRoomAction();
//			} else if(list instanceof GameRoom) {
//				GameRoom g = (GameRoom)list;
//				g.gameRoomAction();
//			} else {
//				System.out.println("알수 없는 오류입니다.");	
//			}
//		}
//		
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
			} else if(list instanceof SweetHome) { // SweetHome: 이름, ID, 주소, 가격이 저장된 클래스
				System.out.print("이름은 " + list.getOwnerName() + "이고 번호는 " + list.getOwnerID() + "입니다. " + "사는 곳은 " + list.getHomeAddress() + "이며 집 값은 " + list.getHousePrice() + "억원 입니다.\n");
			} else {
				System.out.println("알수 없는 오류입니다.");
			}
		}
		
//		bedroom.homeAction(4);
//		dressroom.homeAction(1);
//		kitchenroom.homeAction(3);
//		studyroom.homeAction(1);
//		gameroom.homeAction(3);
//		gameroom.homeAction(1);
//		gameroom.homeAction(2);
		System.out.println("========================================");

	}

}
