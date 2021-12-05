// 집과 관련되 것들을 상속과 다형성, ArrayList, 다운 캐스팅을 이용하여 표현할 것.
// 부모 클래스(SweetHome)는 멤버 변수Name, ID, Address, HousePrice.
// 자식 클래스는 BedRoom(일어난다), Kitchen(요리, 설거지, 식사), DressRoom(빨래, 말리는),
// StudyRoom(공부, 영화), GameRoom(게임)으로 구성
// 자식 클래스는 오늘 할 일을 구성하는데 부모 자식에 있는 멤버변수를 사용하고, homeAction() 메소드를 오버라이딩(오버로딩 아님) 할 것.
// 일어나서, 밥 먹고, 옷 갈아입고, 공부하고, 논다.(BedRoom, Kitchen, DressRoom, SturyRoom, GameRoom)
// 할 일들에 대한 구성은 사람마다 틀리므로 ArrayList에 저장한다.(만들었지만 의도에 정확하게 맞지 않았다.)
// 다운 캐스팅을 구현할 수 있도록 자식 클래스에 다른 메소드를 만들어 다운 캐스팅으로 호출할 것.
public class SweetHome {
	
	private String ownerName;	// 집 소유자
	private int ownerID;	// 소유자 고유번호
	private String homeAddress;	// 집 주소
	private int housePrice;	// 집 가격
	
	public SweetHome() {
		// 빈 생성자(empty constructor)가 없이 자식 클래스를 호출하니(a = new BedRoom() 이런거..) 에러를 낸다. 꼭 만들자!
		// Implicit super constructor SweetHome() is undefined for default constructor. 
		// Must define an explicit constructor
		
	}
	
	public SweetHome(String ownerName, int ownerID, String homeAddress, int housePrice) {	// 개,소도 아는 매개 변수가 네개인 생성자
		this.ownerName = ownerName;
		this.ownerID = ownerID;
		this.homeAddress = homeAddress;
		this.housePrice = housePrice;
	}
	
	// 오버로딩의 정의는 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
	// 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것을 오버라이딩이라고 한다.
	public void homeAction(int i) { // 자식 클래스에서 이 메소드를 오버라이딩한다.
		System.out.println("SweetHome에서 homeAction()이 호출되었습니다.");
	}
	
	public void taxHouse () {
		System.out.println("세금은 " + this.getHousePrice()*0.0001*100000000 + "원 입니다.") ;
	}

	// 일단 set, get을 셋팅하고요
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setOWnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public int getOwnerID( ) {
		return this.ownerID;
	}
	
	public String getHomeAddress() {
		return this.homeAddress;
	}
	
	public int getHousePrice() {
		return this.housePrice;
	}
}


// 상속을 시작합니다.
class BedRoom extends SweetHome {
	
	// 오버라이딩 된 homeAction() 메소드
	public void homeAction(int i) { // 숫자를 한개 받아서 옵션을 실행하게 끔 한다.
		int selector = i;	// 부모가 int i 이면 자식도 int i 여야 함.
		if(selector == 1) {
			System.out.println("아침에 일찍 일어 났습니다.");
		} else if(selector == 2) {
			System.out.println("아침에 일어 났습니다.");
		} else if (selector == 3) {
			System.out.println("일어나자마자 회사로 뛰었다.");
		} else {
			System.out.println("잠 안자고 뭐한 겁니까?");
		}
	}
	
	// 다운 캐스팅 테스트를 위한 자식의 메소드
	public void bedRoomAction() { 
		System.out.println("오늘은 휴일입니다.");
	}
}


class Kitchen extends SweetHome {
	
	// 오버라이딩 된 homeAction() 메소드
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("맛있는 요리를 합니다.");
		} else if(selector == 2) {
			System.out.println("맛있는 요리를 먹습니다.");
		} else if (selector == 3) {
			System.out.println("설거지를 합니다.");
		} else {
			System.out.println("밥 안먹어?");
		}
	}
	
	// 다운 캐스팅 테스트를 위한 자식의 메소드
	public void kitchenAction() {
		System.out.println("오늘은 볶음밥입니다.");
	}
}

class DressRoom extends SweetHome {
	
	// 오버라이딩 된 homeAction() 메소드
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("정장을 입습니다.");
		} else if(selector == 2) {
			System.out.println("빨래를 열심히 합니다.");
		} else if (selector == 3) {
			System.out.println("빨래를 말립니다.");
		} else {
			System.out.println("벗고 나갈려고?");
		}
	}
	
	// 다운 캐스팅 테스트를 위한 자식의 메소드
	public void dressRommAction() {
		System.out.println("정장으로 가자고!!");
	}
}

class StudyRoom extends SweetHome {
	
	// 오버라이딩 된 homeAction() 메소드
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("수학을 2시간 공부합니다.");
		} else if(selector == 2) {
			System.out.println("국어를 2시간 공부합니다.");
		} else if (selector == 3) {
			System.out.println("영어를 2시간 공부합니다.");
		} else if (selector == 4) {
			System.out.println("영화 조커를 보았습니다.");
		} else {
			System.out.println("아침에 게임룸에서 나왔습니다!!");
		}
	}
	
	// 다운 캐스팅 테스트를 위한 자식의 메소드
	public void studyRoomAction() {
		System.out.println("쌀먹충 되는게 좋을까요?");
	}
}

class GameRoom extends SweetHome {
	
	// 오버라이딩 된 homeAction() 메소드
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("+9 집행검을 팔아서 2천만원을 벌었습니다.");
		} else if(selector == 2) {
			System.out.println("메소를 팔아서 1만원을 벌었습니다.");
		} else if (selector == 3) {
			System.out.println("디아2리저 아이템을 30만원에 팔았습니다.");
		} else {
			System.out.println("인생은 한방입니다.");
		}
	}
	
	// 다운 캐스팅 테스트를 위한 자식의 메소드
	public void gameRoomAction() {
		System.out.println("쌀먹충이 적성이군요!!!!");
	}
}