// ���� ���õ� �͵��� ��Ӱ� ������, ArrayList, �ٿ� ĳ������ �̿��Ͽ� ǥ���� ��.
// �θ� Ŭ����(SweetHome)�� ��� ����Name, ID, Address, HousePrice.
// �ڽ� Ŭ������ BedRoom(�Ͼ��), Kitchen(�丮, ������, �Ļ�), DressRoom(����, ������),
// StudyRoom(����, ��ȭ), GameRoom(����)���� ����
// �ڽ� Ŭ������ ���� �� ���� �����ϴµ� �θ� �ڽĿ� �ִ� ��������� ����ϰ�, homeAction() �޼ҵ带 �������̵�(�����ε� �ƴ�) �� ��.
// �Ͼ��, �� �԰�, �� �����԰�, �����ϰ�, ���.(BedRoom, Kitchen, DressRoom, SturyRoom, GameRoom)
// �� �ϵ鿡 ���� ������ ������� Ʋ���Ƿ� ArrayList�� �����Ѵ�.(��������� �ǵ��� ��Ȯ�ϰ� ���� �ʾҴ�.)
// �ٿ� ĳ������ ������ �� �ֵ��� �ڽ� Ŭ������ �ٸ� �޼ҵ带 ����� �ٿ� ĳ�������� ȣ���� ��.
public class SweetHome {
	
	private String ownerName;	// �� ������
	private int ownerID;	// ������ ������ȣ
	private String homeAddress;	// �� �ּ�
	private int housePrice;	// �� ����
	
	public SweetHome() {
		// �� ������(empty constructor)�� ���� �ڽ� Ŭ������ ȣ���ϴ�(a = new BedRoom() �̷���..) ������ ����. �� ������!
		// Implicit super constructor SweetHome() is undefined for default constructor. 
		// Must define an explicit constructor
		
	}
	
	public SweetHome(String ownerName, int ownerID, String homeAddress, int housePrice) {	// ��,�ҵ� �ƴ� �Ű� ������ �װ��� ������
		this.ownerName = ownerName;
		this.ownerID = ownerID;
		this.homeAddress = homeAddress;
		this.housePrice = housePrice;
	}
	
	// �����ε��� ���Ǵ� �ڹ��� �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �޼ҵ尡 �ִ��� �Ű������� ���� �Ǵ� Ÿ���� �ٸ���, ���� �̸��� ����ؼ� �޼ҵ带 ������ �� �ִ�.
	// �θ� Ŭ�����κ��� ��ӹ��� �޼ҵ带 �ڽ� Ŭ�������� �������ϴ� ���� �������̵��̶�� �Ѵ�.
	public void homeAction(int i) { // �ڽ� Ŭ�������� �� �޼ҵ带 �������̵��Ѵ�.
		System.out.println("SweetHome���� homeAction()�� ȣ��Ǿ����ϴ�.");
	}
	
	public void taxHouse () {
		System.out.println("������ " + this.getHousePrice()*0.0001*100000000 + "�� �Դϴ�.") ;
	}

	// �ϴ� set, get�� �����ϰ��
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


// ����� �����մϴ�.
class BedRoom extends SweetHome {
	
	// �������̵� �� homeAction() �޼ҵ�
	public void homeAction(int i) { // ���ڸ� �Ѱ� �޾Ƽ� �ɼ��� �����ϰ� �� �Ѵ�.
		int selector = i;	// �θ� int i �̸� �ڽĵ� int i ���� ��.
		if(selector == 1) {
			System.out.println("��ħ�� ���� �Ͼ� �����ϴ�.");
		} else if(selector == 2) {
			System.out.println("��ħ�� �Ͼ� �����ϴ�.");
		} else if (selector == 3) {
			System.out.println("�Ͼ�ڸ��� ȸ��� �پ���.");
		} else {
			System.out.println("�� ���ڰ� ���� �̴ϱ�?");
		}
	}
	
	// �ٿ� ĳ���� �׽�Ʈ�� ���� �ڽ��� �޼ҵ�
	public void bedRoomAction() { 
		System.out.println("������ �����Դϴ�.");
	}
}


class Kitchen extends SweetHome {
	
	// �������̵� �� homeAction() �޼ҵ�
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("���ִ� �丮�� �մϴ�.");
		} else if(selector == 2) {
			System.out.println("���ִ� �丮�� �Խ��ϴ�.");
		} else if (selector == 3) {
			System.out.println("�������� �մϴ�.");
		} else {
			System.out.println("�� �ȸԾ�?");
		}
	}
	
	// �ٿ� ĳ���� �׽�Ʈ�� ���� �ڽ��� �޼ҵ�
	public void kitchenAction() {
		System.out.println("������ �������Դϴ�.");
	}
}

class DressRoom extends SweetHome {
	
	// �������̵� �� homeAction() �޼ҵ�
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("������ �Խ��ϴ�.");
		} else if(selector == 2) {
			System.out.println("������ ������ �մϴ�.");
		} else if (selector == 3) {
			System.out.println("������ �����ϴ�.");
		} else {
			System.out.println("���� ��������?");
		}
	}
	
	// �ٿ� ĳ���� �׽�Ʈ�� ���� �ڽ��� �޼ҵ�
	public void dressRommAction() {
		System.out.println("�������� ���ڰ�!!");
	}
}

class StudyRoom extends SweetHome {
	
	// �������̵� �� homeAction() �޼ҵ�
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("������ 2�ð� �����մϴ�.");
		} else if(selector == 2) {
			System.out.println("��� 2�ð� �����մϴ�.");
		} else if (selector == 3) {
			System.out.println("��� 2�ð� �����մϴ�.");
		} else if (selector == 4) {
			System.out.println("��ȭ ��Ŀ�� ���ҽ��ϴ�.");
		} else {
			System.out.println("��ħ�� ���ӷ뿡�� ���Խ��ϴ�!!");
		}
	}
	
	// �ٿ� ĳ���� �׽�Ʈ�� ���� �ڽ��� �޼ҵ�
	public void studyRoomAction() {
		System.out.println("�Ҹ��� �Ǵ°� �������?");
	}
}

class GameRoom extends SweetHome {
	
	// �������̵� �� homeAction() �޼ҵ�
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("+9 ������� �ȾƼ� 2õ������ �������ϴ�.");
		} else if(selector == 2) {
			System.out.println("�޼Ҹ� �ȾƼ� 1������ �������ϴ�.");
		} else if (selector == 3) {
			System.out.println("���2���� �������� 30������ �Ⱦҽ��ϴ�.");
		} else {
			System.out.println("�λ��� �ѹ��Դϴ�.");
		}
	}
	
	// �ٿ� ĳ���� �׽�Ʈ�� ���� �ڽ��� �޼ҵ�
	public void gameRoomAction() {
		System.out.println("�Ҹ����� �����̱���!!!!");
	}
}