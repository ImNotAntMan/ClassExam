
public class ComputerTest {

	public static void main(String[] args) {
		// Computer c1 = new Computer(); �߻�Ŭ������ ��ü���� ���� ����
		Computer c1 = new DeskTop();
		c1.turnON();
		c1.display();
		c1.typing();
		c1.turnOff();
	}
}
