//���� ���� ��.
//���̸�, �ּ�, ����, ����, ����, ���� ����, �������̸�
public class House {
	String houseName;
	String constructCategory;	//����, ö��, ����, ����, �Ÿ�
	String address;
	int width;
	int height;
	int housePrice;
	int houseArea; //�������� ����
	float pyeong; // houseArea / 3.3 �� ����
	float houseTax;	//housePrice * 0.2 �ŷ��� ���� ����, ����� ö��, ����, ���࿡���� �ΰ����� ����. �ŷ������� �ΰ� ��.
	int numberOfRoom;
	String ownerName;
	
	public House() { //������
		
	}
	
	public House(String hId, String hvalue) {
		
	}
	
	public House(String hName, String hCategory, String haddress, int w, int h, int hArea, float hPyeong, float hTax, int hRoom, int hPrice, String hOwner) {
		houseName = hName;
		constructCategory = hCategory;
		address = haddress;
		width = w;
		height = h;
		houseArea = hArea;
		housePrice = hPrice;
		houseTax = hTax;
		numberOfRoom = hRoom;
		pyeong = hPyeong;
		ownerName = hOwner;
	}
	
	public String gethouseName() {	//1.�� �̸�
		return houseName;
	}
	
	public String getConstructCategory() { //2. ���� ����
		return constructCategory;
	}
	
	public String getAddress() {	//3.�� �ּ�
		return address;
	}
	
	public int getWidth() {	//4.��
		return width;
	}
	
	public int getHeight() {	//5.����
		return height;
	}
	
	public int getArea() {	//6.����
		return houseArea;
	}
	
	public float getPyeong() {	//7.�������
		return pyeong;
	}
	
	public float getHouseTax() {	//8.����
		return houseTax;
	}
	
	public int getNumberOfRoom() {	//9.���� ����
		return numberOfRoom;
	}
	
	public String getOwnerName() {	//10. ������ �̸�
		return ownerName;
	}
	
	public int getHousePrice() {	//11.�� ��
		return housePrice;
	}
	
	public void setHouse(String hName, String hCategory, String haddress, int w, int h, int hArea, float hPyeong, float hTax, int hRoom, int hPrice, String hOwner) {
		houseName = hName;
		constructCategory = hCategory;
		address = haddress;
		width = w;
		height = h;
		houseArea = hArea;
		housePrice = hPrice;
		houseTax = hTax;
		numberOfRoom = hRoom;
		pyeong = hPyeong;
		ownerName = hOwner;		
	}
	
	public void settingHouse(String hId, String hvalue) {

		switch(hId) {
			case "hName" : houseName = hvalue;
			break;
			
			case "hCategory" : constructCategory = hvalue;
			break;
			
			case "haddress" : address = hvalue;
			break;
			
			case "hWidth" : width = (int)hvalue;
			break;
			
			case "hHeight" : height = (int)hvalue;
			break;
			
			case "hPrice" : housePrice = (int)hvalue;
			break;
			
			case "hArea" : houseArea = (int)hvalue;
			break;
			
			case "hPyeong" : pyeong = (float)hvalue;
			break;
			
			case "hTax" : houseTax = (int)hvalue;
			break;
			
			case "hRoom" : numberOfRoom = (int)hvalue;
			break;
			
			case "hOwner" : ownerName = hvalue;
			break;
			
			default :
			
		}

	}
}
