
public class SweetHomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetHome sh = new SweetHome("민재기", 1001, "우암동", 100);
		SweetHome bedroom= new BedRoom();
		SweetHome kitchenroom = new Kitchen();
		SweetHome dressroom = new DressRoom();
		SweetHome studyroom = new StudyRoom();
		SweetHome gameroom = new GameRoom();
		sh.getOwnerName();
		sh.getOwnerID();
		sh.getHomeAddress();
		sh.getHousePrice();
		System.out.print("이름은 " + sh.getOwnerName() + "이고 번호는 " + sh.getOwnerID() + "입니다. " + "사는 곳은 " + sh.getHomeAddress() + "이며 집값은 " + sh.getHousePrice() + "억원 입니다.\n");
		bedroom.homeAction(4);
		dressroom.homeAction(1);
		kitchenroom.homeAction(3);
		studyroom.homeAction(1);
		gameroom.homeAction(3);
		gameroom.homeAction(1);
		gameroom.homeAction(2);


	}

}
