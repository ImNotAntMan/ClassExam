import java.util.*;
public class SweetHomeTest {

	public static void main(String[] args) {
		// 
		SweetHome sh = new SweetHome("�̸���", 1001, "������", 100);
		ArrayList<SweetHome> shList = new ArrayList<SweetHome>();

		// shList.get()�� ���Ͽ� �����ϴ� ���
		shList.add(sh);
//		System.out.println(shList.get(0).getOwnerName());
//		System.out.println(shList.get(0).getOwnerID());
//		System.out.println(shList.get(0).getHomeAddress());
//		System.out.println(shList.get(0).getHousePrice());
//		System.out.println(shList.get(0).getHousePrice()*0.001);
		// sh ��ü�� ���Ͽ� �����ϴ� ���
		System.out.print("�̸��� " + sh.getOwnerName() + "�̰� ��ȣ�� " + sh.getOwnerID() + "�Դϴ�. " + "��� ���� " + sh.getHomeAddress() + "�̸� �� ���� " + sh.getHousePrice() + "��� �Դϴ�.\n");

		shList.add(new BedRoom());
		shList.add(new Kitchen());
		shList.add(new DressRoom());
		shList.add(new StudyRoom());
		shList.add(new GameRoom());

		SweetHome sh2 = new SweetHome("James Lee", 1002, "����", 250);
		shList.add(sh2);
		System.out.print("�̸��� " + shList.get(6).getOwnerName() + "�̰� ��ȣ�� " + shList.get(6).getOwnerID() + "�Դϴ�. " + "��� ���� " + shList.get(6).getHomeAddress() + "�̸� �� ���� " + shList.get(6).getHousePrice() + "��� �Դϴ�.\n");
		shList.add(new BedRoom());
		shList.add(new Kitchen());
		shList.add(new DressRoom());
		shList.add(new StudyRoom());
		shList.add(new GameRoom());
		
		int j = 0;
		// ������ �׽�Ʈ
		for(SweetHome slist : shList) { // �� for���� ������ array�� ����.
			System.out.print(" j�� ���� : " + j + "�Դϴ�.");
			System.out.print(slist.getClass() + " "); // getClass() : ȣ��� Ŭ������ �̸��� ����Ѵ�.
//			if(slist instanceof SweetHome) {
//				System.out.println("");
//				System.out.print("�̸��� " + slist.getOwnerName() + "�̰� ��ȣ�� " + slist.getOwnerID() + "�Դϴ�. " + "��� ���� " + slist.getHomeAddress() + "�̸� �� ���� " + slist.getHousePrice() + "��� �Դϴ�.\n");			
//			}
			slist.homeAction(j); // ������: ȣ��� Ŭ������ �������̵� �� �޼ҵ� homeAction�� �����Ѵ�.
//			slist.homeAction(2); // j�� ���� �����ϸ� �ٸ� �ɼ��� ��µȴ�.
//			slist.homeAction(3);
//			slist.homeAction(4);
			++j;
			if(j == 5) {
				j = 1;
			}
		}
		
		System.out.println("================================================");
		System.out.println("ArrayLis ��� �� �ϰ�~~");
		System.out.println("================================================");
		SweetHome bedroom= new BedRoom();	// ArrayList�� ������� �ʴ� ���
		bedroom.homeAction(3); // ��� �̰� �´� �� ����. Ŭ���� ���� �ٸ� �ൿ�� �����ϴϱ�...
		SweetHome kitchenroom = new Kitchen(); // �׷��� ArrayList�� ����ұ� �����..
		kitchenroom.homeAction(2); // �׷��� ArrayList�� �Ű� ������ �༭ ��� ��� �ϸ� �ȵɱ�?
		SweetHome dressroom = new DressRoom();
		dressroom.homeAction(4);
		SweetHome studyroom = new StudyRoom();
		studyroom.homeAction(2);
		SweetHome gameroom = new GameRoom();
		gameroom.homeAction(4);
		System.out.println("================================================");

		// �ٿ� ĳ���� ����!!
		// super(SweetHome)�� if �� ���� �տ� ���� �ٿ� ĳ������ ���� �ʴ´�.else ���� ������ ���� �۵��Ѵ�. �Ѥ�;;
//		for(int i = 0; i < shList.size(); i++) {
//			SweetHome list = shList.get(i);
//		 if(list instanceof SweetHome) { // ���Ͼտ� SweetHome???
//			System.out.print("�̸��� " + shList.get(i).getOwnerName() + "�̰� ��ȣ�� " + shList.get(i).getOwnerID() + "�Դϴ�. " + "��� ���� " + shList.get(i).getHomeAddress() + "�̸� �� ���� " + shList.get(i).getHousePrice() + "��� �Դϴ�.\n");
//				list.taxHouse(); // �̰� ������Ŀ� �ڽ� Ŭ�������� ������ .taxHouse()������.
//			} else if(list instanceof BedRoom) {
//				BedRoom b = (BedRoom)list;
//				b.bedRoomAction(); // taxHouse() �����...?????
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
//				System.out.println("�˼� ���� �����Դϴ�.");	
//			}
//		}
//		
		System.out.println("�ٿ� ĳ���� ����!!");
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
			} else if(list instanceof SweetHome) { // SweetHome: �̸�, ID, �ּ�, ������ ����� Ŭ����
				System.out.print("�̸��� " + list.getOwnerName() + "�̰� ��ȣ�� " + list.getOwnerID() + "�Դϴ�. " + "��� ���� " + list.getHomeAddress() + "�̸� �� ���� " + list.getHousePrice() + "��� �Դϴ�.\n");
			} else {
				System.out.println("�˼� ���� �����Դϴ�.");
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
