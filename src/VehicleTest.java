import java.util.*;
public class VehicleTest {

	public static void main(String[] args) {
		// ��ü ArrayList ����
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();	//���� ��ü�� ������ �迭 ����
//		vList.add(new Sedan());
//		vList.add(new Suv());
//		vList.add(new Truck());
//		vList.add(new Sedan());
//		vList.add(new Suv());
//		vList.add(new Truck());
		Vehicle v1 = new Sedan("�׷���");
		Vehicle v2 = new Suv("��������������");
		Vehicle v3 = new Truck("����");
		Vehicle v4 = new Sedan("����");
		Vehicle v5 = new Suv("V80");
		Vehicle v6 = new Truck("Ʈ����");
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		vList.add(v6);
		for(Vehicle v : vList ) {
			v.move(); //������ ��ü�� �°� ȣ�� ��.
		}

	}

}
