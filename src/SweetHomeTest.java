
public class SweetHomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetHome sh = new SweetHome("�����", 1001, "��ϵ�", 100);
		SweetHome bedroom= new BedRoom();
		SweetHome kitchenroom = new Kitchen();
		SweetHome dressroom = new DressRoom();
		SweetHome studyroom = new StudyRoom();
		SweetHome gameroom = new GameRoom();
		sh.getOwnerName();
		sh.getOwnerID();
		sh.getHomeAddress();
		sh.getHousePrice();
		System.out.print("�̸��� " + sh.getOwnerName() + "�̰� ��ȣ�� " + sh.getOwnerID() + "�Դϴ�. " + "��� ���� " + sh.getHomeAddress() + "�̸� ������ " + sh.getHousePrice() + "��� �Դϴ�.\n");
		bedroom.homeAction(4);
		dressroom.homeAction(1);
		kitchenroom.homeAction(3);
		studyroom.homeAction(1);
		gameroom.homeAction(3);
		gameroom.homeAction(1);
		gameroom.homeAction(2);


	}

}
