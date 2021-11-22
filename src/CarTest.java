
public class CarTest {

	public static void main(String[] args) {
		// 
		Car car1 = new Car();
		Car car2 = new Car("얼룩말");
		Car car3 = new Car("검정말", 300);
		car2.setCarSpeed(500);
		
		System.out.println("차이름:" + car1.carName + "\t" + "차속도:" + car1.carSpeed);
		System.out.println("차이름:" + car2.carName + "\t" + "차속도:" + car2.carSpeed);
		System.out.println("차이름:" + car3.carName + "\t" + "차속도:" + car3.carSpeed);
		
		car3.setCarSpeedUp(300);
		System.out.println("차이름:" + car3.carName + "\t" + "차속도:" + car3.carSpeed);
		car3.setCarSpeedDown(50);
		System.out.println("차이름:" + car3.carName + "\t" + "차속도:" + car3.carSpeed);
		car1.setCar("머스크", 200);
		System.out.println("차이름:" + car1.carName + "\t" + "차속도:" + car1.carSpeed);
	}

}
