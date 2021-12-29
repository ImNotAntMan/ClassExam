import java.util.*;
public class VehicleTest {

	public static void main(String[] args) {
		// 객체 ArrayList 생성
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();	//각종 객체를 저장할 배열 선언
//		vList.add(new Sedan());
//		vList.add(new Suv());
//		vList.add(new Truck());
//		vList.add(new Sedan());
//		vList.add(new Suv());
//		vList.add(new Truck());
		Vehicle v1 = new Sedan("그랜저");
		Vehicle v2 = new Suv("나도에스유브이");
		Vehicle v3 = new Truck("봉고");
		Vehicle v4 = new Sedan("골프");
		Vehicle v5 = new Suv("V80");
		Vehicle v6 = new Truck("트랙터");
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		vList.add(v6);
		for(Vehicle v : vList ) {
			v.move(); //각각의 객체에 맞게 호출 됨.
		}

	}

}
