import java.util.*;
public class Ex1130_05 {

	public static void main(String[] args) {
		// ArrayList Ŭ���� Ȱ��
		ArrayList<Book> library = new ArrayList<Book>();	// ���ʸ� Ÿ������ ����
		
		System.out.println("==================================================");
		for(int i = 0; i < library.size(); i++) {
			// �ӽ� ������ ��ȭ
			Book book = library.get(i);	// ��ü ��ȯ
			book.showBookInfo();
		}
		library.add(new Book("�¹���", "������"));	// inline ��ü ����
		library.add(new Book("���̾�", "�츣���켼"));
		library.add(new Book("�Ųٷ��д¼����", "���ù�"));
		library.add(new Book("��������� �ں�����", "�丣�������"));
		System.out.println("==================================================");
		for(int i = 0; i < library.size(); i++) {
			// �ӽ� ������ ��ȭ
			Book book = library.get(i);	// ��ü ��ȯ
			book.showBookInfo();
		}
		System.out.println("==================================================");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
