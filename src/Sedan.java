
public class Sedan extends Vehicle {
	public Sedan(String carName) {
		this.carName = carName;
	}

	public void move() {
		System.out.println(carName + " 조용하게 움직인다.");
	}
}
