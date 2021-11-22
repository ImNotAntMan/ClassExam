//집을 설계 함.
//집이름, 주소, 가로, 세로, 면적, 방의 갯수, 소유자이름
public class House {
	String houseName;
	String constructCategory;	//신축, 철거, 개축, 수리, 매매
	String address;
	int width;
	int height;
	int housePrice;
	int houseArea; //제곱미터 단위
	float pyeong; // houseArea / 3.3 평 단위
	float houseTax;	//housePrice * 0.2 거래에 대한 세금, 신축과 철거, 수리, 개축에서는 부과되지 않음. 거래에서만 부과 됨.
	int numberOfRoom;
	String ownerName;
	
	public House() { //생성자
		
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
	
	public String gethouseName() {	//1.집 이름
		return houseName;
	}
	
	public String getConstructCategory() { //2. 건축 종류
		return constructCategory;
	}
	
	public String getAddress() {	//3.집 주소
		return address;
	}
	
	public int getWidth() {	//4.폭
		return width;
	}
	
	public int getHeight() {	//5.높이
		return height;
	}
	
	public int getArea() {	//6.면적
		return houseArea;
	}
	
	public float getPyeong() {	//7.면적평수
		return pyeong;
	}
	
	public float getHouseTax() {	//8.세금
		return houseTax;
	}
	
	public int getNumberOfRoom() {	//9.방의 갯수
		return numberOfRoom;
	}
	
	public String getOwnerName() {	//10. 소유자 이름
		return ownerName;
	}
	
	public int getHousePrice() {	//11.집 값
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
