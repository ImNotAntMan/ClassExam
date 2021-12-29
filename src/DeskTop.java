
public class DeskTop extends Computer {
	// 추상 클래스를 상속받았을 경우 반드시 추상메서드를 구형해야 함.
	@Override
	public void display() {
		System.out.println("DeskTop Display");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
	}
}
