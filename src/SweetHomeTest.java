import java.util.*;
public class SweetHomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetHome sh = new SweetHome("�����", 1001, "��ϵ�", 100);
		ArrayList<SweetHome> shList = new ArrayList<SweetHome>();
		shList.add(new BedRoom());
		shList.add(new Kitchen());
		shList.add(new DressRoom());
		shList.add(new StudyRoom());
		shList.add(new GameRoom());
//		SweetHome bedroom= new BedRoom();
//		SweetHome kitchenroom = new Kitchen();
//		SweetHome dressroom = new DressRoom();
//		SweetHome studyroom = new StudyRoom();
//		SweetHome gameroom = new GameRoom();
//		sh.getOwnerName();
//		sh.getOwnerID();
//		sh.getHomeAddress();
//		sh.getHousePrice();
		System.out.print("�̸��� " + sh.getOwnerName() + "�̰� ��ȣ�� " + sh.getOwnerID() + "�Դϴ�. " + "��� ���� " + sh.getHomeAddress() + "�̸� ������ " + sh.getHousePrice() + "��� �Դϴ�.\n");
		for(SweetHome slist : shList) {
			slist.homeAction(1);
			slist.homeAction(2);
			slist.homeAction(3);
			slist.homeAction(4);
		}
//		bedroom.homeAction(4);
//		dressroom.homeAction(1);
//		kitchenroom.homeAction(3);
//		studyroom.homeAction(1);
//		gameroom.homeAction(3);
//		gameroom.homeAction(1);
//		gameroom.homeAction(2);


	}

}
