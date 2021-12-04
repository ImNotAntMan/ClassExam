// 집과 관련되 것들을 상속과 다형성 ArrayList를 이용하여 표현할 것.
// 부모 클래스는 기본적인 Home의 구성 요소 Name, ID, Address, HousePrice, RommQty 
// 자식 클래스는 BedRoom(잔다, 일어난다), Kitchen(요리, 설거지, 식사), DressRoom(빨래, 말리는)
// StudyRoom(공부, 영화, 게임)으로 구성
// 자식 클래스는 오늘 할 일을 구성할 것 어디에서(Bedroom,kitchen...등등)
// 밥, 옷 갈아입고, 공부하고, 밥먹고, 놀고, 자러간다..
// 할 일들에 대한 구성은 사람마다 틀리므로 ArrayList에 저장한다.
import java.util.*;
public class SweetHome {
	
	private String ownerName;	// 집 소유자
	private int ownerID;	// 소유자 고유번호
	private String homeAddress;	// 집 주소
	private int housePrice;	// 집 가격
	private ArrayList<SweetHome> shList;
	
	public SweetHome() {	// 개,소도 아는 생성자
		
	}
	
	public SweetHome(String ownerName, int ownerID, String homeAddress, int housePrice) {	// 개,소도 아는 매개 변수가 네개인 생성자
		this.ownerName = ownerName;
		this.ownerID = ownerID;
		this.homeAddress = homeAddress;
		this.housePrice = housePrice;
		shList = new ArrayList<SweetHome>();
	}
	
	public void homeAction(int i) {
		System.out.println("집이 움직이는게 아닙니다.");
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

class BedRoom extends SweetHome {
	
	public void homeAction(int i) {
		int selector = i;
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
}

class Kitchen extends SweetHome {
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
}

class DressRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("정장을 입습니다.");
		} else if(selector == 2) {
			System.out.println("마스크를 씁니다.");
		} else if (selector == 3) {
			System.out.println("모자를 씁니다.");
		} else {
			System.out.println("벗고 나갈려고?");
		}
	}
}

class StudyRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("수학을 2시간 공부합니다.");
		} else if(selector == 2) {
			System.out.println("국어를 2시간 공부합니다.");
		} else if (selector == 3) {
			System.out.println("영어를 2시간 공부합니다.");
		} else if (selector == 4) {
			System.out.println("아침에 일찍 일어났습니다?");
		} else {
			System.out.println("아침에 게임룸에서 나왔습니다!!");
		}
	}
}

class GameRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("리니지 머니를 팔아서 2만원을 벌었습니다.");
		} else if(selector == 2) {
			System.out.println("메소를 팔아서 1만원을 벌었습니다.");
		} else if (selector == 3) {
			System.out.println("디2리저 아이템을 30만원에 팔았습니다.");
		} else {
			System.out.println("잠 안자고 뭐한 겁니까?");
		}
	}
}