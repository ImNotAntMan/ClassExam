// �������� ����� ���� AnimalWorldTest��� ������ �������.
// �� ������ ���� ��ü�� AnimalWorld.java�� �־ �۵��Ѵ�.
public class AnimalWorldTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalWorldTest a = new AnimalWorldTest();	// �� a��� ���� ����������?
		AnimalWorld ani1 = new Humans(); // ����� ����!!!
		AnimalWorld ani2 = new Tigers();
		AnimalWorld ani3 = new Eagles();
		
		ani1.move();	// �������̵� �� �޼ҵ� ȣ��
		ani2.move();
		ani3.move();
		a.moveAnimal(new Humans());	// �̰� ���� �ǹ��ϱ�? AnimalWorldTest���� moveAnimal() �޼ҵ带 ȣ���ϱ� ����
		a.moveAnimal(new Tigers());	// �ܼ��� a�� ����ǰ�? �׷��� a�� ������ �ʰ� moveAnimal() �޼ҵ带 ����
		a.moveAnimal(new Eagles());	// �� �� �ִ� ����� �����ΰ�?
//		moveAnimal(new Human());	// ���� �ȵȴ�....����� moveAnimal() �޼ҵ带 �����ϱ� ���� a��� Ŭ������ ������Ų�Ŵ�....
	}	// ����� � Ŭ���� �ȿ� �ִ� �޼ҵ带 �����ϱ� ���ؼ��� �� Ŭ������ ���� ���Ѿ� �Ѵٴ� �翬�� ��п� �����Ѵ�.
// �ΰ������� �Ӹ��� ���ڴٴ°� ����ƴ�. �翬�� �� �ñ��� �ϴٴ�...		
	public void moveAnimal(AnimalWorld abc) {
			abc.move(); // �������� ���� �� ����. �޼ҵ� �̸��� ������ �Ҽӵ� Ŭ������ ���� �ٸ� ��� ���� �ش�.
	}
}
