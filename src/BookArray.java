
public class BookArray {

	public static void main(String[] args) {
		// book �迭 �׽�Ʈ
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("������", "�¹���");
		library[1] = new Book("�츣�� ��", "���̾�");
		library[2] = new Book("���ù�", "��� �� ���ΰ�");
		library[3] = new Book("�ڰ渮", "����");
		library[4] = new Book("�������丮", "�����");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = library.length ;i > library.length - i; i++)
	}

}
