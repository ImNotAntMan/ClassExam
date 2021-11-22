
public class Car {
	String carName;
	int carSpeed;
	
	public Car() {
		carName = "ÀÚµ¿Â÷";
		carSpeed = 150;
		
	}
	
	public Car(String cName) {
		carName = cName;
	}
	
	public Car(String cName, int cSpeed) {
		carName = cName;
		carSpeed = cSpeed;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public int getCarSpeed() {
		return carSpeed;
	}
	
	public void setCarName(String cName) {
		carName = cName;
	}
	
	public void setCarSpeed(int cSpeed) {
		carSpeed = cSpeed;
	}
	
	public void setCar(String cName, int cSpeed) {
		carName = cName;
		carSpeed = cSpeed;
	}
	
	public void setCarSpeedUp(int cSpeedUp) {
		carSpeed += cSpeedUp;
	}
	
	public void setCarSpeedDown(int cSpeedDown) {
		carSpeed -= cSpeedDown;
	}
}
