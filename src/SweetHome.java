// ���� ���õ� �͵��� ��Ӱ� ������ ArrayList�� �̿��Ͽ� ǥ���� ��.
// �θ� Ŭ������ �⺻���� Home�� ���� ��� Name, ID, Address, HousePrice, RommQty 
// �ڽ� Ŭ������ BedRoom(�ܴ�, �Ͼ��), Kitchen(�丮, ������, �Ļ�), DressRoom(����, ������)
// StudyRoom(����, ��ȭ, ����)���� ����
// �ڽ� Ŭ������ ���� �� ���� ������ �� ��𿡼�(Bedroom,kitchen...���)
// ��, �� �����԰�, �����ϰ�, ��԰�, ���, �ڷ�����..
// �� �ϵ鿡 ���� ������ ������� Ʋ���Ƿ� ArrayList�� �����Ѵ�.
import java.util.*;
public class SweetHome {
	
	private String ownerName;	// �� ������
	private int ownerID;	// ������ ������ȣ
	private String homeAddress;	// �� �ּ�
	private int housePrice;	// �� ����
	private ArrayList<SweetHome> shList;
	
	public SweetHome() {	// ��,�ҵ� �ƴ� ������
		
	}
	
	public SweetHome(String ownerName, int ownerID, String homeAddress, int housePrice) {	// ��,�ҵ� �ƴ� �Ű� ������ �װ��� ������
		this.ownerName = ownerName;
		this.ownerID = ownerID;
		this.homeAddress = homeAddress;
		this.housePrice = housePrice;
		shList = new ArrayList<SweetHome>();
	}
	
	public void homeAction(int i) {
		System.out.println("���� �����̴°� �ƴմϴ�.");
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

class BedRoom extends SweetHome {
	
	public void homeAction(int i) {
		int selector = i;
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
}

class Kitchen extends SweetHome {
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
}

class DressRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("������ �Խ��ϴ�.");
		} else if(selector == 2) {
			System.out.println("����ũ�� ���ϴ�.");
		} else if (selector == 3) {
			System.out.println("���ڸ� ���ϴ�.");
		} else {
			System.out.println("���� ��������?");
		}
	}
}

class StudyRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("������ 2�ð� �����մϴ�.");
		} else if(selector == 2) {
			System.out.println("��� 2�ð� �����մϴ�.");
		} else if (selector == 3) {
			System.out.println("��� 2�ð� �����մϴ�.");
		} else if (selector == 4) {
			System.out.println("��ħ�� ���� �Ͼ���ϴ�?");
		} else {
			System.out.println("��ħ�� ���ӷ뿡�� ���Խ��ϴ�!!");
		}
	}
}

class GameRoom extends SweetHome {
	public void homeAction(int i) {
		int selector = i;
		if(selector == 1) {
			System.out.println("������ �Ӵϸ� �ȾƼ� 2������ �������ϴ�.");
		} else if(selector == 2) {
			System.out.println("�޼Ҹ� �ȾƼ� 1������ �������ϴ�.");
		} else if (selector == 3) {
			System.out.println("��2���� �������� 30������ �Ⱦҽ��ϴ�.");
		} else {
			System.out.println("�� ���ڰ� ���� �̴ϱ�?");
		}
	}
}