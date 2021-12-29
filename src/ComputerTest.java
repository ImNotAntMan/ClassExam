
public class ComputerTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); 추상클래스는 객체생성 하지 않음
		Computer c1 = new DeskTop();
		c1.turnON();
		c1.display();
		c1.typing();
		c1.turnOff();
	}
}
