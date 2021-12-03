// �����߿� ���ذ� �ȵ� �κ��� �־ AnimalTest�� �ΰ��� ���Ϸ� �и��ߴ�. 
// ���ó�� �ΰ��� ������ ���Ϸ� �и��� ���ϰ� ������ ���������� �ϴ� �ǹ����� 
// ���ó�� ���ϴ� �� ������ �������� ���Ǹ� �����. �׷��� �ΰ��� ���Ϸ� �и��ؼ� �����ϰ� �;���. �׸���....
// 1. �� public�� �� ����? public�� ��� ���� �����Ѱ� �ƴѰ�?
// 2. �� AnimalTest ��ü�� �ҷ��ٰ� ����?(AnimalTest aTest = new AnimalTest())
// ���� Ŭ������ ���� ������ ���� Ȯ���� �������� �ʾƼ����� 4�ð� ���� ��޴ٰ� �� ����ġ�� ���.  
// ������ �Ͼ �ٽ� ������ ���� ��ȣ�� �߸� ���� �߰��ߴ�. ��ġ�� �� �۵��Ѵ�.......
// ���̰� �� �Ӹ��� �������� ���� ���̴�....
class AnimalWorld {	// public�� �� �ᵵ �� Ŭ������ ���� �����ϴ�. �������� ���� �𸣰ڴ�.
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

// Ŭ���� ���� Human�̶�� ���ߴ��� �̹� �ִٰ� ������ ����. �׷��� Humans�� ���ߴ�. �Ƹ� AnimalTest�� �ִ� Ŭ�����̸��� �ν��ϳ� ����.
class Humans extends AnimalWorld {	// ���������� �� �տ� public�� �������� ������ ����. public�� ���� �� �ִ� Ŭ������ �����̸��� ���� Ŭ�����ۿ� ���ٰ� �Ѵ�.
	public void move() { // �������̵� �� �޼ҵ�
		System.out.println("����� �������� �԰� �ֽ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �д´ٰ�?");
		
	}
	public void move2() {
		System.out.println("����� Ÿ�̰ŵ� �԰� �;� �մϴ�.");
	}
	public void heist() {
		System.out.println("�ʹ� ó ��ø� �ȵ˴ϴ�.");
	}
}

//Ŭ���� ���� Tiger��� ���ߴ��� �̹� �ִٰ� ������ ����. �׷��� Tigers�� ���ߴ�.
class Tigers extends AnimalWorld {
	public Tigers() {
		
	}
	public void move() {
		System.out.println("Ÿ�̰Ű� ����� �԰� �ֽ��ϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

// Ŭ���� ���� Eagle�̶�� ���ߴ��� �̹� �ִٰ� ������ ����. �׷��� Eagles�� ���ߴ�. �ǳ� ��� �ϴ� ����� �������� ����� ��������.
class  Eagles extends AnimalWorld {
	public void move() {
		System.out.println("�̱��� Ÿ�̰Ÿ� �԰� �ֽ��ϴ�.");
	}
	public void flying() {
		System.out.println("������ ����.!");
	}
}

