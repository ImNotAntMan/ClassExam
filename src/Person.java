
public class Person {
	String name;
	int height;
	int weight;
	
	// �����ڰ� �� ���� ���� ��� ����Ʈ �����ڰ� ������.
	
	//������ �ۼ� ��Ģ
	//Ŭ������� ����
	//��ȯŸ���� ����(���� ����)
	//��������� ����Ʈ ������ �ʿ�
	public Person() {
		
	}
	
	//�����ε� �� ������
	public Person(String pname) { //������ �̸��� ����, �Ű����� �ٸ�.(����, Ÿ��, ���� ���� �ٸ�)
		name = pname;
	}
	// �����ε� �� ������
	public Person(String pname,  int pheight, int pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	//�޼���
	public String getName() {
		return name;
	}
	
	//Ű�� �����Ը� ���� ������ �� �ִ� �޼��� �߰�
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void getHuman() {
		System.out.println("�̸�:" + name + "\n" +  "Ű:" + height + "\n" + "ü��:" + weight);
	}
	
	//����, Ű, ������ ������ �� �ִ� �޼��� �߰�
	public void setName(String pname) {
		name = pname;
	}
	
	public void setWeight(int pweight) {
		weight = pweight;
	}
	
	public void setHeight(int pheight) {
		height = pheight;
	}
	
	//����, Ű, ������ �ѹ��� ������ �� �ִ� �޼��� �߰�
	public void setHuman(String pname, int pheight, int pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
}
