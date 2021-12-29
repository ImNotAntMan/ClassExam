
public abstract class Computer {
	public abstract void display();	// 추상메소드
	public abstract void typing();	// 추상메소드
	public void turnON() {
		System.out.println("전원을 켠다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끈다");
	}
}
