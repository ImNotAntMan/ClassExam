
public class Suv extends Vehicle {
	public Suv(String carName) {
		this.carName = carName;
	}

	public void move() {
		System.out.println(carName + " 산길을 간다.");
	}
}
