
public class CarTest {

	public static void main(String[] args) {
		// 
		Car car1 = new Car();
		Car car2 = new Car("��踻");
		Car car3 = new Car("������", 300);
		car2.setCarSpeed(500);
		
		System.out.println("���̸�:" + car1.carName + "\t" + "���ӵ�:" + car1.carSpeed);
		System.out.println("���̸�:" + car2.carName + "\t" + "���ӵ�:" + car2.carSpeed);
		System.out.println("���̸�:" + car3.carName + "\t" + "���ӵ�:" + car3.carSpeed);
		
		car3.setCarSpeedUp(300);
		System.out.println("���̸�:" + car3.carName + "\t" + "���ӵ�:" + car3.carSpeed);
		car3.setCarSpeedDown(50);
		System.out.println("���̸�:" + car3.carName + "\t" + "���ӵ�:" + car3.carSpeed);
		car1.setCar("�ӽ�ũ", 200);
		System.out.println("���̸�:" + car1.carName + "\t" + "���ӵ�:" + car1.carSpeed);
	}

}
